package com.ssmTest.demo.entity.crawlerEntity.nbedi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.List;

public class ImportOrExportQuery {
    /**
     * 宁波港口船舶周计划查询链接
     */
    private String getEdiScodecoURL = "http://www.npedi.com/ediportal-web/scodeco/getEdiScodeco.action";

    private HttpClient httpClient;
    /**
     * 提运单号
     */
    private String blNo;

    public ImportOrExportQuery(HttpClient httpClient, String blNo) {
        this.httpClient = httpClient;
        this.blNo = blNo;
    }

    /**
     * 根据提运单号查询进口信息
     */
    public String getEdiScodeco() {
        //模拟发起post请求，设置头信息，设置参数
        HttpPost httpRequest = new HttpPost(getEdiScodecoURL);

        httpRequest.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");

        httpRequest.setHeader("Accept-Encoding", "gzip, deflate");

        httpRequest.setHeader("Accept-Language", "zh-CN,zh;q=0.9");

        httpRequest.setHeader("Cache-Control", "no-cache");

        httpRequest.setHeader("Connection", "keep-alive");

        httpRequest.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");

        httpRequest.setHeader("Host", "www.npedi.com");

        httpRequest.setHeader("refer", "http://www.npedi.com/ediportal-web/ediweb/EdiScodeco.jsp");

        httpRequest.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");

        //设置参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("vesselname", ""));
        nvps.add(new BasicNameValuePair("blNo", blNo));
        nvps.add(new BasicNameValuePair("ctnNo", ""));
        nvps.add(new BasicNameValuePair("inOrOut", "in"));
        nvps.add(new BasicNameValuePair("ctnOperatorCode", ""));
        nvps.add(new BasicNameValuePair("vesselcode", ""));
        nvps.add(new BasicNameValuePair("voyage", ""));
        nvps.add(new BasicNameValuePair("gotoPage", 1 + ""));
        nvps.add(new BasicNameValuePair("pageCount", 500 + ""));
        String responseBody = null;
        try {
            //将POST参数以UTF-8编码并包装成表单实体对象
            httpRequest.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));
//            //创建响应处理器处理服务器响应内容
//            ResponseHandler<String> responseHandler = new BasicResponseHandler();

            HttpResponse httpResponse = httpClient.execute(httpRequest);
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                HttpEntity entity = httpResponse.getEntity();
                //执行请求并获取结果
                responseBody = EntityUtils.toString(entity, "UTF-8");
                EntityUtils.consume(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseBody;
    }
}
