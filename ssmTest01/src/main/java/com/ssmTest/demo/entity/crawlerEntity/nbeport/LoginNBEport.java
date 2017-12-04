package com.ssmTest.demo.entity.crawlerEntity.nbeport;

import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.*;
import com.gargoylesoftware.htmlunit.util.Cookie;

import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 用于登录宁波电子口岸
 */
public class LoginNBEport {
    public LoginNBEport() {

    }

    public static void testGetNBEportPage() {
        try {
            String url = "http://www.nbeport.com/";//想采集的网址
            URL link = new URL(url);
            WebClient wc = new WebClient();
            WebRequest request = new WebRequest(link);
            request.setCharset("UTF-8");
            ////设置请求报文头里的User-Agent字段
            request.setAdditionalHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.75 Safari/537.36");
            //wc.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:6.0.2) Gecko/20100101 Firefox/6.0.2");
            //wc.addRequestHeader和request.setAdditionalHeader功能应该是一样的。选择一个即可。
            //其他报文头字段可以根据需要添加
            wc.getCookieManager().setCookiesEnabled(true);//开启cookie管理
            // 这里是配置一下不加载css和javaScript,配置起来很简单，是不是
            wc.getOptions().setCssEnabled(false);
            wc.getOptions().setJavaScriptEnabled(false);
            wc.getOptions().setThrowExceptionOnFailingStatusCode(false);
            wc.getOptions().setThrowExceptionOnScriptError(false);
            wc.getOptions().setTimeout(10000);
            //设置cookie。如果你有cookie，可以在这里设置
            Set<Cookie> cookies = null;
            if (cookies != null) {
                Iterator<Cookie> i = cookies.iterator();
                while (i.hasNext()) {
                    wc.getCookieManager().addCookie(i.next());
                }
            }
            //准备工作已经做好了
            HtmlPage page = null;
            page = wc.getPage(request);

            //使用xpath方式获取页面元素
            HtmlAnchor anchor = (HtmlAnchor) page.getByXPath("//a[@href='javascript:CALogin()']").get(0);
            // 输入好了，我们点一下这个按钮
            final HtmlPage nextPage = anchor.click();
            // 我把结果转成String
            String result = nextPage.asXml();
            System.out.println(result);
            if (page == null) {
                System.out.println("采集 " + url + " 失败!!!");
                return;
            }
            String content = page.asText();//网页内容保存在content里
            if (content == null) {
                System.out.println("采集 " + url + " 失败!!!");
                return;
            }
            //搞定了
            CookieManager CM = wc.getCookieManager(); //WC = Your WebClient's name
            Set<Cookie> cookies_ret = CM.getCookies();//返回的Cookie在这里，下次请求的时候可能可以用上啦。

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testGetNBEportPage();
//        testHttmlUnit();
    }

    public static void testHttmlUnit() {
        try {
            // 得到浏览器对象，直接New一个就能得到，现在就好比说你得到了一个浏览器了
            WebClient webclient = new WebClient();

            // 这里是配置一下不加载css和javaScript,配置起来很简单，是不是
            webclient.getOptions().setCssEnabled(false);
            webclient.getOptions().setJavaScriptEnabled(false);

            // 做的第一件事，去拿到这个网页，只需要调用getPage这个方法即可
            HtmlPage htmlpage = webclient.getPage("http://news.baidu.com/advanced_news.html");

            // 根据名字得到一个表单，查看上面这个网页的源代码可以发现表单的名字叫“f”
            final HtmlForm form = htmlpage.getFormByName("f");
            // 同样道理，获取”百度一下“这个按钮
            final HtmlSubmitInput button = form.getInputByValue("百度一下");
            // 得到搜索框
            final HtmlTextInput textField = form.getInputByName("q1");
            // 最近周星驰比较火呀，我这里设置一下在搜索框内填入”周星驰“
            textField.setValueAttribute("周星驰");
            // 输入好了，我们点一下这个按钮
            final HtmlPage nextPage = button.click();
            // 我把结果转成String
            String result = nextPage.asXml();

            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
