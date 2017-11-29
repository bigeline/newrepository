package com.ssmTest.demo.utils;

import org.apache.commons.codec.binary.Base64;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ImageFindDemo {
    /**
     * 屏幕截图
     */
    BufferedImage screenShotImage;
    /**
     * 查找目标图片
     */
    BufferedImage keyImage;
    /**
     * 屏幕截图宽度
     */
    int scrShotImgWidth;
    /**
     * 屏幕截图高度
     */
    int scrShotImgHeight;
    /**
     * 查找目标图片宽度
     */
    int keyImgWidth;
    /**
     * 查找目标图片高度
     */
    int keyImgHeight;
    /**
     * 屏幕截图RGB数据
     */
    int[][] screenShotImageRGBData;
    /**
     * 查找目标图片RGB数据
     */
    int[][] keyImageRGBData;
    /**
     * 查找结果，目标图标位于屏幕截图上的坐标数据
     */
    int[][][] findImgData;

    //指定变量
//    public ImageFindDemo(BufferedImage originImgBi, BufferedImage brickImgBi) {
//        screenShotImage = originImgBi;
//        keyImage = brickImgBi;
//        screenShotImageRGBData = this.getImageGRB(screenShotImage);
//        keyImageRGBData = this.getImageGRB(keyImage);
//        scrShotImgWidth = screenShotImage.getWidth();
//        scrShotImgHeight = screenShotImage.getHeight();
//        keyImgWidth = keyImage.getWidth();
//        keyImgHeight = keyImage.getHeight();
//
//        //开始查找
////        this.findImage();
//
//    }


    public static void main(String[] args) {
        //i=138 top=21
        BufferedImage originImgBi = generateImage("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",
                "originImg.png");
        //截取的图片
        BufferedImage brickImgBi = generateImage("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",
                "brickImg.png");
//        ImageFindDemo imageFindDemo = new ImageFindDemo(originImgBi, brickImgBi);
//        imageFindDemo.printFindData();

        Boolean bianli = bianli(getImageGRB(originImgBi), getImageGRB(brickImgBi));
        System.out.println(bianli);
    }

    public static Boolean bianli(int[][] originArr, int[][] brickArr) {
        for (int i = 0; i < originArr.length; i++) {
            for (int j = 0; j < originArr[i].length; j++) {
                if (originArr[i][j] != brickArr[i][j]) {
                    System.out.println("originArr[i][j]:" + originArr[i][j] + "brickArr[i][j]:" + brickArr[i][j]);
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 查找图片
     */
    public void findImage() {
        findImgData = new int[keyImgHeight][keyImgWidth][2];
        //遍历屏幕截图像素点数据
        for (int y = 0; y < scrShotImgHeight - keyImgHeight; y++) {
            for (int x = 0; x < scrShotImgWidth - keyImgWidth; x++) {
                //根据目标图的尺寸，得到目标图四个角映射到屏幕截图上的四个点，
                //判断截图上对应的四个点与图B的四个角像素点的值是否相同，
                //如果相同就将屏幕截图上映射范围内的所有的点与目标图的所有的点进行比较。
                if ((keyImageRGBData[0][0] ^ screenShotImageRGBData[y][x]) == 0
                        && (keyImageRGBData[0][keyImgWidth - 1] ^ screenShotImageRGBData[y][x + keyImgWidth - 1]) == 0
                        && (keyImageRGBData[keyImgHeight - 1][keyImgWidth - 1] ^ screenShotImageRGBData[y + keyImgHeight - 1][x + keyImgWidth - 1]) == 0
                        && (keyImageRGBData[keyImgHeight - 1][0] ^ screenShotImageRGBData[y + keyImgHeight - 1][x]) == 0) {

                    System.out.println("匹配到指定区域");

                    boolean isFinded = isMatchAll(y, x);
                    System.out.println("是否匹配：" + isFinded);
                    //如果比较结果完全相同，则说明图片找到，填充查找到的位置坐标数据到查找结果数组。
                    if (isFinded) {
                        for (int h = 0; h < keyImgHeight; h++) {
                            for (int w = 0; w < keyImgWidth; w++) {
                                findImgData[h][w][0] = y + h;
                                findImgData[h][w][1] = x + w;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /**
     * 对字节数组字符串进行Base64解码并生成图片
     */
    public static BufferedImage generateImage(String imgStr, String filePath) {
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

            BufferedImage imageFileBi = ImageIO.read(imgFile);
            return imageFileBi;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * * 根据BufferedImage获取图片RGB数组
     * * @param bfImage
     * * @return
     */
    public static int[][] getImageGRB(BufferedImage bfImage) {
        int width = bfImage.getWidth();
        int height = bfImage.getHeight();
        int[][] result = new int[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                //使用getRGB(w, h)获取该点的颜色值是ARGB，而在实际应用中使用的是RGB，所以需要将ARGB转化成RGB，即bufImg.getRGB(w, h) & 0xFFFFFF。
                result[h][w] = bfImage.getRGB(w, h) & 0xFFFFFF;
            }
        }
        return result;
    }


    /**
     * 判断屏幕截图上目标图映射范围内的全部点是否全部和小图的点一一对应。
     *
     * @param y - 与目标图左上角像素点想匹配的屏幕截图y坐标
     * @param x - 与目标图左上角像素点想匹配的屏幕截图x坐标
     * @return
     */
    public boolean isMatchAll(int y, int x) {
        int biggerY = 0;
        int biggerX = 0;
        int xor = 0;
        for (int smallerY = 0; smallerY < keyImgHeight; smallerY++) {
            biggerY = y + smallerY;
            for (int smallerX = 0; smallerX < keyImgWidth; smallerX++) {
                biggerX = x + smallerX;
                if (biggerY >= scrShotImgHeight || biggerX >= scrShotImgWidth) {
                    return false;
                }
                xor = keyImageRGBData[smallerY][smallerX] ^ screenShotImageRGBData[biggerY][biggerX];
                if (xor != 0) {
                    return false;
                }
            }
            biggerX = x;
        }
        return true;
    }

    /**
     * 输出查找到的坐标数据
     */
    private void printFindData() {
        for (int y = 0; y < keyImgHeight; y++) {
            for (int x = 0; x < keyImgWidth; x++) {
                System.out.print("(" + this.findImgData[y][x][0] + ", " + this.findImgData[y][x][1] + ")");
            }
            System.out.println();
        }
    }
}
