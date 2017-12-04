package com.ssmTest.demo.utils.forCrawler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssmTest.demo.entity.ImportOrExport;
import com.ssmTest.demo.entity.VoyageInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 用于解析爬取回来的数据
 */
public class ParseData {
    //解析进口查询返回结果
    public static List<ImportOrExport> parseScodeInfo(String scodeInfo) {
        if (scodeInfo == null || "".equals(scodeInfo)) {
            return null;
        }
        //先获取jsonobject对象
        JSONObject jobj = JSON.parseObject(scodeInfo);
        //把对象转换成jsonArray数组
        JSONArray resultJsonArray = jobj.getJSONArray("result");
        //遍历jsonArray,将需要转换的字符串属性转换为date类型。
        List<ImportOrExport> importOrExportList = new ArrayList<>();
        Iterator<Object> resultJsonArrayIterator = resultJsonArray.iterator();
        while (resultJsonArrayIterator.hasNext()) {
            JSONObject ob = (JSONObject) resultJsonArrayIterator.next();

            ImportOrExport importOrExport = new ImportOrExport();
            importOrExport.setBlNo(ob.get("blNo").toString());
            importOrExport.setCtnGrossWeight(Double.parseDouble(ob.get("ctnGrossWeight").toString()));
            importOrExport.setCtnNo(ob.get("ctnNo").toString());
            importOrExport.setCtnOperatorCode(ob.get("ctnOperatorCode").toString());
            importOrExport.setCtnSizeType(ob.get("ctnSizeType").toString());
            importOrExport.setCtnStatus(ob.get("ctnStatus").toString());
            importOrExport.setDirect(ob.get("direct").toString());
            importOrExport.setDlPortCode(ob.get("dlPortCode").toString());
            importOrExport.setId(ob.get("id").toString());
            importOrExport.setSealNo(ob.get("sealNo").toString());
            importOrExport.setSenderCode(ob.get("senderCode").toString());
            importOrExport.setVessel(ob.get("vessel").toString());
            importOrExport.setVoyage(ob.get("voyage").toString());

            importOrExport.setInGateTime(strToDateForInGateTime(ob.get("inGateTime").toString()));
            importOrExport.setMsgReceiveTime(strToDate(ob.get("msgReceiveTime").toString()));

            importOrExportList.add(importOrExport);
        }

        return importOrExportList;
    }

    //解析船舶周计划数据
    public static List<VoyageInfo> parseShipWeeklyPlanInfo(String shipWeeklyPlanInfo) {
        if (shipWeeklyPlanInfo == null || "".equals(shipWeeklyPlanInfo)) {
            return null;
        }
        //先获取jsonobject对象
        JSONObject jobj = JSON.parseObject(shipWeeklyPlanInfo);
        //把对象转换成jsonArray数组
        JSONArray resultJsonArray = jobj.getJSONArray("result");

        //遍历jsonArray,将需要转换的字符串属性转换为date类型。
        List<VoyageInfo> voyageInfoList = new ArrayList<>();
        Iterator<Object> resultJsonArrayIterator = resultJsonArray.iterator();
        while (resultJsonArrayIterator.hasNext()) {
            JSONObject ob = (JSONObject) resultJsonArrayIterator.next();

            VoyageInfo voyageInfo = new VoyageInfo();
            //设置普通属性
            voyageInfo.setChnDescription(ob.get("chndescription").toString());
            voyageInfo.setDirection(ob.get("direction").toString());
            voyageInfo.setEngDescription(ob.get("engdescription").toString());
            voyageInfo.setPorts(ob.get("ports").toString());
            voyageInfo.setTermainalCode(ob.get("termainalCode").toString());
            voyageInfo.setVesselCode(ob.get("vesselcode").toString());
            voyageInfo.setVoyage(ob.get("voyage").toString());

            //设置需要转换的属性
            voyageInfo.setArrivalDate(strToDate(ob.get("arrivaldate").toString()));
            voyageInfo.setCtnApplyBeginDate(strToDate(ob.get("ctnapplybeginadate").toString()));
            voyageInfo.setCtnApplyEndDate(strToDate(ob.get("ctnapplyenddate").toString()));
            voyageInfo.setCtnEnd(strToDate(ob.get("ctnend").toString()));
            voyageInfo.setCtnStart(strToDate(ob.get("ctnstart").toString()));
            voyageInfo.setDischargeDate(strToDate(ob.get("dischargedate").toString()));
            voyageInfo.setEtaArrivedDate(strToDate(ob.get("etaarriveddate").toString()));
            voyageInfo.setEtaSailingDate(strToDate(ob.get("etasailingdate").toString()));
            voyageInfo.setPortCloseDate(strToDate(ob.get("portclosedate").toString()));

            voyageInfoList.add(voyageInfo);
        }

        return voyageInfoList;
    }

    /**
     * 转换字符串为指定格式的日期
     */
    public static Date strToDate(String dateStr) {
        if ("".equals(dateStr) || dateStr == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 用于转换字符串为指定格式日期：专为进出口返回信息中的进出门时间，因为他的时间格式为yyyyMMddHHmm
     *
     * @param
     */
    public static Date strToDateForInGateTime(String dateStr) {
        if ("".equals(dateStr) || dateStr == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        try {
            Date date = sdf.parse("201706052017");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
