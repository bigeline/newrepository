package com.ssmTest.demo.entity.crawlerEntity.nbedi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 该类用于获取验证码，并返回验证图片的位移量。
 */
public class GetSlideCode {
    /**
     * 宁波港口EDI获取滑块验证码链接
     */
    private String slideCodeURL;

    private HttpClient httpClient;

    public GetSlideCode(String slideCodeURL, HttpClient httpClient) {
        this.slideCodeURL = slideCodeURL;
        this.httpClient = httpClient;
    }

    //总的工具类,返回包含位移量的数组
    public int[] getPixelArr() {
        //发送请求获取验证图片Base64位字符串
        String slideCodeBase64Str = getSlideCodeBase64Str(this.slideCodeURL);

        //从返回结果中解析获取相应的字符串
        Map<String, String> base64StringMap = parseResponse(slideCodeBase64Str);

        //对字节数组字符串进行Base64解码并生成图片对象
        File originImgFile = parseBase64ToFile(base64StringMap.get("origin"), "originImg.png");
        File groundImgFile = parseBase64ToFile(base64StringMap.get("ground"), "groundImg.png");

        //读取图片,并解析比较图片的像素值，获取位移量，返回的数组中，第一个元素为大概率的位移量，如果不行就使用第二个元素。
        int[] displacementArr = null;
        try {
            displacementArr = getImagePixel(originImgFile, groundImgFile, Integer.parseInt(base64StringMap.get("top")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return displacementArr;
    }

    //发送请求获取验证图片Base64位字符串
    public String getSlideCodeBase64Str(String slideCodeURL) {
        HttpGet httpRequest = new HttpGet(slideCodeURL);
        //設置httpGet的头部參數信息

        httpRequest.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");

        httpRequest.setHeader("Accept-Encoding", "gzip, deflate");

        httpRequest.setHeader("Accept-Language", "zh-CN,zh;q=0.9");

        httpRequest.setHeader("Connection", "keep-alive");

        httpRequest.setHeader("Cookie", "JSESSIONID=AdDFFwO+bC5ADZjATkk+EE6g.edi-webf");

        httpRequest.setHeader("Host", "www.npedi.com");

        httpRequest.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");
        //请求HttpClient，取得HttpResponse
        String strResult = null;
        try {
            HttpResponse httpResponse = this.httpClient.execute(httpRequest);
            //请求成功
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //取得返回的字符串
                strResult = EntityUtils.toString(httpResponse.getEntity());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strResult;
    }

    //从返回结果中解析获取相应的字符串
    public Map<String, String> parseResponse(String slideCode) {
        Map<String, String> results = new HashMap<>();

        JSONObject jobj = JSON.parseObject(slideCode);
        String brick = jobj.get("brick").toString();
        String ground = jobj.get("ground").toString();
        String origin = jobj.get("origin").toString();
        String top = jobj.get("top").toString();

        results.put("brick", brick);
        results.put("ground", ground);
        results.put("origin", origin);
        results.put("top", top);

        return results;
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片对象
     */
    public File parseBase64ToFile(String imgStr, String filePath) {
        //图像数据为空
        if (imgStr == null) {
            return null;
        }
        try {
            //Base64解码
            byte[] b = Base64.decodeBase64(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }
            //生成jpeg图片
            File imgFile = new File(filePath);
            OutputStream out = new FileOutputStream(imgFile);
            out.write(b);
            out.flush();
            out.close();
            return imgFile;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 读取图片,并解析比较图片的像素值，获取位移量
     */
    public int[] getImagePixel(File originImgFile, File groundImgFile, int top) throws Exception {
        BufferedImage originImgFileBi = null;
        BufferedImage groundImgFileBi = null;
        try {
            originImgFileBi = ImageIO.read(originImgFile);
            groundImgFileBi = ImageIO.read(groundImgFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int width = originImgFileBi.getWidth();
        int height = originImgFileBi.getHeight();

        int minx = originImgFileBi.getMinX();
        int miny = originImgFileBi.getMinY();

        //获取两张图片某一点的像素值的和
        int[] originImgRgb = new int[3];
        int[] groundImgRgb = new int[3];
        for (int i = minx; i < width; i++) {
            // 下面三行代码将一个数字转换为RGB数字

            int originImgPixel = originImgFileBi.getRGB(i, top);
            originImgRgb[0] = (originImgPixel & 0xff0000) >> 16;
            originImgRgb[1] = (originImgPixel & 0xff00) >> 8;
            originImgRgb[2] = (originImgPixel & 0xff);
            int originImgTotal = originImgRgb[1] + originImgRgb[2] + originImgRgb[0];


            int groundImgPixel = groundImgFileBi.getRGB(i, top);
            groundImgRgb[0] = (groundImgPixel & 0xff0000) >> 16;
            groundImgRgb[1] = (groundImgPixel & 0xff00) >> 8;
            groundImgRgb[2] = (groundImgPixel & 0xff);
            int groundImgTotal = groundImgRgb[1] + groundImgRgb[2] + groundImgRgb[0];
            //如果此处两张图片的像素值的和不同，说明此处就是被截取的地方，此处的x就是位移量。
            if ((groundImgTotal - originImgTotal) > 100) {
                System.out.println("位移量为：" + (i - 1) + "或者为：" + i);
                //返回可能是位移量的两个值
                return new int[]{(i - 1), i};
            }
        }
        return null;
    }
}
