package com.ssmTest.demo.utils;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 用于测试破解滑块验证码的工具类
 */
public class UtilForSlider {
    public static void main(String[] args) {

        File originImgFile = generateImage("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", "originImg.png");
        File groundImgFile = generateImage("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", "groundImg.png");
        int top = 29;

        try {
            //比较获取位移量
            getImagePixel(originImgFile, groundImgFile, top);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取比较图片的像素值
     */
    public static void getImagePixel(File originImgFile, File groundImgFile, int top) throws Exception {
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
            /*System.out.println("i=" + i + ",j=" + top + ":(" + originImgRgb[0] + ","
                    + originImgRgb[1] + "," + originImgRgb[2] + ")" + ":(" + groundImgRgb[0] + ","
                    + groundImgRgb[1] + "," + groundImgRgb[2] + ")" + "像素和之差：" + (groundImgTotal - originImgTotal));*/
            if ((groundImgTotal - originImgTotal) > 100) {
                System.out.println("位移量为：" + (i - 1) + "或者为：" + i);
                return;
            }
        }
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片
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

//            OutputStream out = new FileOutputStream(imgFilePath);
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
}
