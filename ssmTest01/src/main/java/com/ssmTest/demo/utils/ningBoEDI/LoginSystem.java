package com.ssmTest.demo.utils.ningBoEDI;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * 用于宁波EDI的模拟登陆
 */
public class LoginSystem {
    private HttpClient httpClient;
    private String loginSystemURL;
    private String userId;
    private String password;

    public LoginSystem(HttpClient httpClient, String loginSystemURL, String userId, String password) {
        this.httpClient = httpClient;
        this.loginSystemURL = loginSystemURL;
        this.userId = userId;
        this.password = password;
    }

    //模拟登陆
    public Boolean login() {
        //模拟发起post请求，设置头信息，设置参数
        HttpPost httpRequest = new HttpPost(loginSystemURL);

        httpRequest.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");

        httpRequest.setHeader("Accept-Encoding", "gzip, deflate");

        httpRequest.setHeader("Accept-Language", "zh-CN,zh;q=0.9");

        httpRequest.setHeader("Cache-Control", "no-cache");

        httpRequest.setHeader("Connection", "keep-alive");

        httpRequest.setHeader("Host", "www.npedi.com");

        httpRequest.setHeader("refer", "http://www.npedi.com/ediportal-web/ediweb/index.jsp");

        httpRequest.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");

        //设置参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("userId", userId));
        nvps.add(new BasicNameValuePair("password", password));

        try {
            //将POST参数以UTF-8编码并包装成表单实体对象
            httpRequest.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
            //创建响应处理器处理服务器响应内容
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            //执行请求并获取结果
            String responseBody = httpClient.execute(httpRequest, responseHandler);
            //如果返回数据中包含userId和userName说明登录成功
            if (responseBody.indexOf("userId") > 0 && responseBody.indexOf("userName") > 0) {
                System.out.println("模拟登陆成功。");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
