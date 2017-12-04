import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestIO {
    @Test
    public void testIO() {
        long startTime = System.currentTimeMillis();
        File groundImg = new File("groundImg.png");
        File newGroundImg = new File("newGroundImg.png");
        //创建输入流，输出流
        try {
            FileInputStream inputStream = new FileInputStream(groundImg);
            FileOutputStream outputStream = new FileOutputStream(newGroundImg);

            //复制文件
            int length = 0;
            while ((length = inputStream.read()) != -1) {
                outputStream.write(length);
            }

            outputStream.close();
            inputStream.close();

            long endTime = System.currentTimeMillis();
            System.out.println("总计用时：" + (endTime - startTime) + " 毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testIO02() {
        long startTime = System.currentTimeMillis();
        File groundImg = new File("groundImg.png");
        File newGroundImg = new File("newGroundImg.png");

        try {
            FileInputStream inputStream = new FileInputStream(groundImg);
            FileOutputStream outputStream = new FileOutputStream(newGroundImg);

            //定义缓冲数组
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, length);
            }

            outputStream.close();
            inputStream.close();

            long endTime = System.currentTimeMillis();
            System.out.println("总计用时：" + (endTime - startTime) + " 毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
