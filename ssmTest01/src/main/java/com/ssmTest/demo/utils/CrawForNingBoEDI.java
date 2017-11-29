package com.ssmTest.demo.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrawForNingBoEDI {
    /**
     * 宁波港口EDI获取滑块验证码链接
     */
    private static String slideCodeURL = "http://www.npedi.com/ediportal-web/createSlideCode.action";
    /**
     * 宁波港口EDI检查滑块验证码链接
     */
    private static String checkSlideCodeURL = "http://www.npedi.com/ediportal-web/checkSlideCode.action";
    /**
     * 宁波港口EDI检查滑块验证码链接
     */
    private static String userLoginURL = "http://www.npedi.com//ediportal-web/userLoginStatus.action";


    private static HttpClient httpClient = HttpClients.createDefault();
    private static HttpResponse httpResponse;

    public static void main(String[] args) {
        //获取验证图片的Base64字符串
        Map<String, String> results = parseResponse();
        //解析比较两张图片的不同，获取位移量
        int[] displacement = checkSlideCode(results);

        String resultCode = checkSlideCode(displacement);
    }

    //发起检查验证码的请求
    public static String checkSlideCode(int[] displacement) {
        if (displacement == null) {
            return null;
        }
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost httpRequest = new HttpPost(checkSlideCodeURL);

        httpRequest.setHeader("Accept", "*/*");

        httpRequest.setHeader("Accept-Encoding", "gzip, deflate");

        httpRequest.setHeader("Accept-Language", "zh-CN,zh;q=0.9");

        httpRequest.setHeader("Cache-Control", "no-cache");

        httpRequest.setHeader("Connection", "keep-alive");

        httpRequest.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

        httpRequest.setHeader("Content-Length", "5");

        httpRequest.setHeader("Cookie", "JSESSIONID=BXbiJidn-22vrltshsx1Dybs.edi-webf");

        httpRequest.setHeader("Host", "www.npedi.com");

        httpRequest.setHeader("refer", "http://www.npedi.com/ediportal-web/ediweb/index.jsp");

        httpRequest.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");

        //设置参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("x", displacement.toString()));

        //请求HttpClient，取得HttpResponse
        //执行请求操作，并拿到结果（同步阻塞）
        String strResult = null;
        try {
            HttpResponse response = httpClient.execute(httpRequest);
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

    //发送请求获取验证图片Base64位字符串
    public static String getSlideCode(String slideCodeURL) {
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
            HttpResponse httpResponse = httpClient.execute(httpRequest);
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

    //解析返回的验证图片字符串
    public static Map<String, String> parseResponse() {
        Map<String, String> results = new HashMap<>();

        String slideCode = getSlideCode(slideCodeURL);

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


    //发送检查验证码的请求
    public static int[] checkSlideCode(Map<String, String> results) {
        //获取图片字符串
        String oringin = results.get("oringin");
        String ground = results.get("ground");
        int top = Integer.parseInt(results.get("top"));

        File originImgFile = generateImage(oringin, "originImg.png");
        File groundImgFile = generateImage(ground, "groundImg.png");

        //比较这张图片的差异，获取位移量
        int[] imagePixel = null;
        try {
            imagePixel = getImagePixel(originImgFile, groundImgFile, top);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imagePixel;
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片对象
     */
    public static File generateImage(String imgStr, String filePath) {
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
     * 读取图片,并解析比较图片的像素值
     */
    public static int[] getImagePixel(File originImgFile, File groundImgFile, int top) throws Exception {
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

        System.out.println("width=" + width + ",height=" + height + ".");
        System.out.println("minx=" + minx + ",miniy=" + miny + ".");

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
                return new int[]{(i - 1), i};
            }
        }
        return null;
    }

    //发起登录post请求
    //
}
