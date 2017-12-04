package com.ssmTest.demo.utils.forCrawler;

import com.ssmTest.demo.entity.crawlerEntity.nbedi.CheckSlideCode;
import com.ssmTest.demo.entity.crawlerEntity.nbedi.GetSlideCode;
import com.ssmTest.demo.entity.crawlerEntity.nbedi.LoginNBEDI;
import org.apache.http.client.HttpClient;

public class VerifyAndLoginNingBoEDI {
    /**
     * 宁波港口EDI获取滑块验证码链接
     */
    private static String slideCodeURL = "http://www.npedi.com/ediportal-web/createSlideCode.action";
    /**
     * 宁波港口EDI检查滑块验证码链接
     */
    private static String checkSlideCodeURL = "http://www.npedi.com/ediportal-web/checkSlideCode.action";
    /**
     * 宁波港口EDI登录链接
     */
    private static String loginSystemURL = "http://www.npedi.com/ediportal-web/loginSystem.action";
    /**
     * 宁波港口EDI登录链接
     */
    private String getEdiVoyageInfoURL = "http://www.npedi.com/ediportal-web/cqtest/getEdiVoyageInfo.action";
    /**
     * 账号信息
     */
    private static String userId = "8615327270";
    private static String password = "hello123";

    private static int count = 0;

    //抽取的验证和登录的模块
    public static Boolean verifyAndLogin(HttpClient httpClient) {
        //获取验证图片
        System.out.println("开始获取验证图片");
        GetSlideCode getSlideCode = new GetSlideCode(slideCodeURL, httpClient);
        //返回位移量数组
        int[] pixelArr = getSlideCode.getPixelArr();

        //验证位移量
        System.out.println("开始验证位移量");
        CheckSlideCode checkSlideCode = new CheckSlideCode(checkSlideCodeURL, httpClient);
        for (int i = 0; i < pixelArr.length; i++) {
            String result = checkSlideCode.checkDisplacement(pixelArr[i]);
            if ("ok".equals(result)) {
                break;
            }
        }

        //模拟登陆
        System.out.println("开始模拟登陆");
        LoginNBEDI loginNBEDI = new LoginNBEDI(httpClient, loginSystemURL, userId, password);
        //进行登录
        Boolean isLogin = loginNBEDI.login();

        //如果第一次登录失败，接着尝试两次；
        if (!isLogin) {
            count++;
            if (count < 3) {
                verifyAndLogin(httpClient);
            }
        }

        return isLogin;
    }
}
