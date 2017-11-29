package com.ssmTest.demo.utils.ningBoEDI;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.List;

/**
 * 该类用于宁波EDI数据爬取方法总调用，维持Httpclient的统一
 */
public class CrawForNiBoEDI {
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
    private static String getEdiVoyageInfoURL = "http://www.npedi.com/ediportal-web/cqtest/getEdiVoyageInfo.action";
    /**
     * 账号信息
     */
    private static String userId = "8615327270";
    private static String password = "hello123";

    /**
     * 船舶航次查询条件
     * vesselname：英文船名
     * voyage：航次
     */
    private static String vesselname = "XINGTONGHAI";
    private static String voyage = "7093S";


    private static HttpClient httpClient = HttpClients.createDefault();

    public static void main(String[] args) {
        crawTest();
    }

    public static void crawTest() {
        //获取验证图片
        System.out.println("开始获取验证图片");
        GetSlideCode getSlideCode = new GetSlideCode(slideCodeURL, httpClient);
        //返回位移量数组
        int[] pixelArr = getSlideCode.getPixelArr();

        //验证位移量
        System.out.println("开始验证位移量");
        CheckSlideCode checkSlideCode = new CheckSlideCode(checkSlideCodeURL, httpClient);
        Boolean flag = false;
        for (int i = 0; i < pixelArr.length; i++) {
            String result = checkSlideCode.checkDisplacement(pixelArr[i]);
            if ("ok".equals(result)) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            //flag依然为false,说明验证未通过，递归验证
            crawTest();
        }

        //模拟登陆
        System.out.println("开始模拟登陆");
        LoginSystem loginSystem = new LoginSystem(httpClient, loginSystemURL, userId, password);
        if (!loginSystem.login()) {
            //登录不成功，递归登录
            crawTest();
        }

        //开始爬取数据
        System.out.println("开始爬取数据");
        ShipWeeklyPlanQuery shipWeeklyPlanQuery = new ShipWeeklyPlanQuery(httpClient, getEdiVoyageInfoURL, vesselname, voyage);
        String shipWeeklyPlanInfo = shipWeeklyPlanQuery.getShipWeeklyPlan();
        System.out.println("爬取到的数据：" + shipWeeklyPlanInfo);
        if (shipWeeklyPlanInfo == null) {
            //爬取数据失败，递归爬取
            crawTest();
        }
        //分析数据
        System.out.println("开始解析数据：");
        List<VoyageInfo> voyageInfoList = ParseData.parseShipWeeklyPlanInfo(shipWeeklyPlanInfo);
        for (VoyageInfo voyageInfo : voyageInfoList) {
            System.out.println(voyageInfo);
        }
        System.out.println("最新一条信息为：" + voyageInfoList.get(0).toString());
    }
}
