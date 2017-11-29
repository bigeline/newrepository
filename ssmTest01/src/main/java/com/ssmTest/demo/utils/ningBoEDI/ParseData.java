package com.ssmTest.demo.utils.ningBoEDI;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * 用于解析爬取回来的数据
 */
public class ParseData {
    //解船舶周计划数据
    public static List<VoyageInfo> parseShipWeeklyPlanInfo(String shipWeeklyPlanInfo) {
        //先获取jsonobject对象
        JSONObject jobj = JSON.parseObject(shipWeeklyPlanInfo);
        //把对象转换成jsonArray数组
        String result = jobj.getJSONArray("result").toString();
        //将字符串转成list集合
        List<VoyageInfo> voyageInfoList = JSON.parseArray(result,VoyageInfo.class);

        return voyageInfoList;
    }
}
