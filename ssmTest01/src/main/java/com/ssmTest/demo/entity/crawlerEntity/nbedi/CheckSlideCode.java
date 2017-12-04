package com.ssmTest.demo.entity.crawlerEntity.nbedi;

import org.apache.http.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 该类用于检查验证码的位移量
 */
public class CheckSlideCode {
    /**
     * 宁波港口EDI检查滑块验证码链接
     */
    private String checkSlideCodeURL;

    private HttpClient httpClient;

    public CheckSlideCode(String checkSlideCodeURL, HttpClient httpClient) {
        this.checkSlideCodeURL = checkSlideCodeURL;
        this.httpClient = httpClient;
    }

    //发起检查验证码的请求，验证位移量是否正确。
    public String checkDisplacement(int displacement) {

        HttpPost httpRequest = new HttpPost(checkSlideCodeURL);
        //设置代理ip
//        HttpHost proxy = new HttpHost("60.215.194.73", 8888);
//        RequestConfig requestConfig = RequestConfig.custom().setProxy(proxy).build();
//        httpRequest.setConfig(requestConfig);

        httpRequest.setHeader("Accept", "*/*");

        httpRequest.setHeader("Accept-Encoding", "gzip, deflate");

        httpRequest.setHeader("Accept-Language", "zh-CN,zh;q=0.9");

        httpRequest.setHeader("Cache-Control", "no-cache");

        httpRequest.setHeader("Connection", "keep-alive");

        httpRequest.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

        httpRequest.setHeader("Host", "www.npedi.com");

        httpRequest.setHeader("refer", "http://www.npedi.com/ediportal-web/ediweb/index.jsp");

        httpRequest.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");

        //设置参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("x", displacement + ""));
        String strResult = null;
        try {
            //设置post请求的参数
            httpRequest.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            HttpResponse httpResponse = httpClient.execute(httpRequest);
            //请求成功
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //取得返回的字符串
                //5.获取HttpEntity消息载体对象  可以接收和发送消息
                HttpEntity entity = httpResponse.getEntity();
                //EntityUtils中的toString()方法转换服务器的响应数据
                strResult = EntityUtils.toString(entity, "utf-8");
                System.out.println("验证是否通过:" + strResult);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strResult;
    }

}
