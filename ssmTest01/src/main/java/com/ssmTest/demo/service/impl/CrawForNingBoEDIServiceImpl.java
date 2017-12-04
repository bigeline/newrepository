package com.ssmTest.demo.service.impl;

import com.ssmTest.demo.entity.ImportOrExport;
import com.ssmTest.demo.entity.VoyageInfo;
import com.ssmTest.demo.entity.VoyageInfoExample;
import com.ssmTest.demo.entity.crawlerEntity.nbedi.ImportOrExportQuery;
import com.ssmTest.demo.entity.crawlerEntity.nbedi.ShipWeeklyPlanQuery;
import com.ssmTest.demo.mapper.ImportOrExportMapper;
import com.ssmTest.demo.mapper.VoyageInfoMapper;
import com.ssmTest.demo.service.CrawForNingBoEDIService;
import com.ssmTest.demo.utils.forCrawler.ParseData;
import com.ssmTest.demo.utils.forCrawler.VerifyAndLoginNingBoEDI;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CrawForNingBoEDIServiceImpl implements CrawForNingBoEDIService {
    @Resource
    private VoyageInfoMapper voyageInfoMapper;
    @Resource
    private ImportOrExportMapper ImportOrExportMapper;

    /**
     * 爬取进出门信息
     */
    public List<ImportOrExport> crawImportOrExportInfo(String blNo) {
        //保持Httpclient对象的一致。
        HttpClient httpClient = HttpClients.createDefault();
        List<ImportOrExport> importOrExportList = null;
        //如果登录成功，进行下一步操作
        if (VerifyAndLoginNingBoEDI.verifyAndLogin(httpClient)) {
            //开始爬取数据
            System.out.println("开始爬取数据");
            ImportOrExportQuery importOrExportQuery = new ImportOrExportQuery(httpClient, blNo);
            String ediScodeco = importOrExportQuery.getEdiScodeco();
            System.out.println("爬取到的数据：" + ediScodeco);
            //分析数据
            System.out.println("开始解析数据：");
            importOrExportList = ParseData.parseScodeInfo(ediScodeco);

            System.out.println("查询到的记录：");
            for (ImportOrExport importOrExport : importOrExportList) {
                int i = ImportOrExportMapper.insert(importOrExport);
                System.out.println(importOrExport);
            }

            //爬取完毕，删除本地临时图片
        }

        return importOrExportList;
    }

    /**
     * 爬取船舶周计划信息
     */
    public VoyageInfo crawShipWeeklyPlan(String vesselname, String voyage) {
        //保持Httpclient对象的一致。
        HttpClient httpClient = HttpClients.createDefault();
        List<VoyageInfo> voyageInfoList = null;
        //如果登录成功，进行下一步操作
        if (VerifyAndLoginNingBoEDI.verifyAndLogin(httpClient)) {
            //开始爬取数据
            System.out.println("开始爬取数据");
            ShipWeeklyPlanQuery shipWeeklyPlanQuery = new ShipWeeklyPlanQuery(httpClient, vesselname, voyage);
            String shipWeeklyPlanInfo = shipWeeklyPlanQuery.getShipWeeklyPlan();
            System.out.println("爬取到的数据：" + shipWeeklyPlanInfo);
            //分析数据
            System.out.println("开始解析数据：");
            voyageInfoList = ParseData.parseShipWeeklyPlanInfo(shipWeeklyPlanInfo);
            for (VoyageInfo voyageInfo : voyageInfoList) {
                System.out.println(voyageInfo);
            }
            System.out.println("最新一条信息为：" + voyageInfoList.get(0).toString());

            //爬取完毕，删除本地临时图片
        }
        //查询数据库有无该记录
        Boolean isExist = voyageInfoIsExist(voyageInfoList.get(0));
        if (!isExist) {
            //如果不存在，则将该条数据存储数据库
            int i = voyageInfoMapper.insert(voyageInfoList.get(0));
        }

        return voyageInfoList.get(0);
    }


    public static void main(String[] args) {
        CrawForNingBoEDIServiceImpl crawForNingBoService = new CrawForNingBoEDIServiceImpl();
        //英文船名
        String vesselname = "XINGTONGHAI";
        //航次
        String voyage = "7093S";
        crawForNingBoService.crawShipWeeklyPlan(vesselname, voyage);

//        //测试爬取进出门信息
//        String blNo = "591108930";
//        crawForNingBoService.crawImportOrExportInfo(blNo);
    }

    /**
     * 用于判断数据库有无该记录
     */
    public Boolean voyageInfoIsExist(VoyageInfo voyageInfo) {
        VoyageInfoExample voyageInfoExample = new VoyageInfoExample();
        VoyageInfoExample.Criteria criteria = voyageInfoExample.createCriteria();

        criteria.andArrivalDateEqualTo(voyageInfo.getArrivalDate());
        criteria.andChnDescriptionEqualTo(voyageInfo.getChnDescription());
        if (voyageInfo.getCtnApplyBeginDate() != null) {
            criteria.andCtnApplyBeginDateEqualTo(voyageInfo.getCtnApplyBeginDate());
        }
        if (voyageInfo.getCtnApplyEndDate() != null) {
            criteria.andCtnApplyEndDateEqualTo(voyageInfo.getCtnApplyEndDate());
        }
        if (voyageInfo.getCtnEnd() != null) {
            criteria.andCtnEndEqualTo(voyageInfo.getCtnEnd());
        }
        if (voyageInfo.getCtnStart() != null) {
            criteria.andCtnStartEqualTo(voyageInfo.getCtnStart());
        }

        criteria.andDirectionEqualTo(voyageInfo.getDirection());
        criteria.andDischargeDateEqualTo(voyageInfo.getDischargeDate());
        criteria.andEngDescriptionEqualTo(voyageInfo.getEngDescription());
        criteria.andEtaArrivedDateEqualTo(voyageInfo.getEtaArrivedDate());
        criteria.andEtaSailingDateEqualTo(voyageInfo.getEtaSailingDate());
        if (voyageInfo.getPortCloseDate() != null) {
            criteria.andPortCloseDateEqualTo(voyageInfo.getPortCloseDate());
        }
        if (voyageInfo.getPorts() != null) {
            criteria.andPortsEqualTo(voyageInfo.getPorts());
        }
        criteria.andTermainalCodeEqualTo(voyageInfo.getTermainalCode());
        criteria.andVesselCodeEqualTo(voyageInfo.getVesselCode());
        criteria.andVoyageEqualTo(voyageInfo.getVoyage());

        List<VoyageInfo> voyageInfoList = voyageInfoMapper.selectByExample(voyageInfoExample);
        if (voyageInfoList.size() > 0 && voyageInfoList != null) {
            return true;
        }
        return false;
    }
}
