package com.ssmTest.demo.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VoyageInfo {
    private Integer id;

    private Date arrivalDate;

    private String chnDescription;

    private Date ctnApplyBeginDate;

    private Date ctnApplyEndDate;

    private Date ctnEnd;

    private Date ctnStart;

    private String direction;

    private Date dischargeDate;

    private String engDescription;

    private Date etaArrivedDate;

    private Date etaSailingDate;

    private Date portCloseDate;

    private String ports;

    private String termainalCode;

    private String vesselCode;

    private String voyage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getChnDescription() {
        return chnDescription;
    }

    public void setChnDescription(String chnDescription) {
        this.chnDescription = chnDescription == null ? null : chnDescription.trim();
    }

    public Date getCtnApplyBeginDate() {
        return ctnApplyBeginDate;
    }

    public void setCtnApplyBeginDate(Date ctnApplyBeginDate) {
        this.ctnApplyBeginDate = ctnApplyBeginDate;
    }

    public Date getCtnApplyEndDate() {
        return ctnApplyEndDate;
    }

    public void setCtnApplyEndDate(Date ctnApplyEndDate) {
        this.ctnApplyEndDate = ctnApplyEndDate;
    }

    public Date getCtnEnd() {
        return ctnEnd;
    }

    public void setCtnEnd(Date ctnEnd) {
        this.ctnEnd = ctnEnd;
    }

    public Date getCtnStart() {
        return ctnStart;
    }

    public void setCtnStart(Date ctnStart) {
        this.ctnStart = ctnStart;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getEngDescription() {
        return engDescription;
    }

    public void setEngDescription(String engDescription) {
        this.engDescription = engDescription == null ? null : engDescription.trim();
    }

    public Date getEtaArrivedDate() {
        return etaArrivedDate;
    }

    public void setEtaArrivedDate(Date etaArrivedDate) {
        this.etaArrivedDate = etaArrivedDate;
    }

    public Date getEtaSailingDate() {
        return etaSailingDate;
    }

    public void setEtaSailingDate(Date etaSailingDate) {
        this.etaSailingDate = etaSailingDate;
    }

    public Date getPortCloseDate() {
        return portCloseDate;
    }

    public void setPortCloseDate(Date portCloseDate) {
        this.portCloseDate = portCloseDate;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports == null ? null : ports.trim();
    }

    public String getTermainalCode() {
        return termainalCode;
    }

    public String getVesselCode() {
        return vesselCode;
    }

    public void setVesselCode(String vesselCode) {
        this.vesselCode = vesselCode == null ? null : vesselCode.trim();
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage == null ? null : voyage.trim();
    }

    @Override
    public String toString() {
        return "VoyageInfo{" +
                "id=" + id +
                ", arrivalDate=" + arrivalDate +
                ", chnDescription='" + chnDescription + '\'' +
                ", ctnApplyBeginDate=" + ctnApplyBeginDate +
                ", ctnApplyEndDate=" + ctnApplyEndDate +
                ", ctnEnd=" + ctnEnd +
                ", ctnStart=" + ctnStart +
                ", direction='" + direction + '\'' +
                ", dischargeDate=" + dischargeDate +
                ", engDescription='" + engDescription + '\'' +
                ", etaArrivedDate=" + etaArrivedDate +
                ", etaSailingDate=" + etaSailingDate +
                ", portCloseDate=" + portCloseDate +
                ", ports='" + ports + '\'' +
                ", termainalCode='" + termainalCode + '\'' +
                ", vesselCode='" + vesselCode + '\'' +
                ", voyage='" + voyage + '\'' +
                '}';
    }

    public void setTermainalCode(String termainalCode) {
        if (termainalCode == null) {
            this.termainalCode = null;
        } else {
            termainalCode = termainalCode.trim();
        }
        if ("ALTCNB".equals(termainalCode)) {
            this.termainalCode = "安联储运";
        } else if ("B2SCT".equals(termainalCode)) {
            this.termainalCode = "北仑山码头";
        } else if ("BDNLPG".equals(termainalCode)) {
            this.termainalCode = "百地年";
        } else if ("BLCT".equals(termainalCode)) {
            this.termainalCode = "NBCT(二期)";
        } else if ("BLCT2".equals(termainalCode)) {
            this.termainalCode = "北二集司(三期)";
        } else if ("BLCT3".equals(termainalCode)) {
            this.termainalCode = "港吉(四期)";
        } else if ("BLCTCFS".equals(termainalCode)) {
            this.termainalCode = "通达公司";
        } else if ("BLCTMS".equals(termainalCode)) {
            this.termainalCode = "梅山码头";
        } else if ("BLCTMSCFS".equals(termainalCode)) {
            this.termainalCode = "四海物流";
        } else if ("BLCTYD".equals(termainalCode)) {
            this.termainalCode = "远东(五期)";
        } else if ("BLCTZS".equals(termainalCode)) {
            this.termainalCode = "大榭招商(CMICT)";
        } else if ("BLHH2".equals(termainalCode)) {
            this.termainalCode = "北二司(BLHH2)";
        } else if ("CSCFS".equals(termainalCode)) {
            this.termainalCode = "长胜堆场";
        } else if ("DXCTE".equals(termainalCode)) {
            this.termainalCode = "大榭信业码头";
        } else if ("JIAYANG".equals(termainalCode)) {
            this.termainalCode = "佳洋物流";
        } else if ("LONGZHOU".equals(termainalCode)) {
            this.termainalCode = "龙洲物流";
        } else if ("NBAD".equals(termainalCode)) {
            this.termainalCode = "安达堆场";
        } else if ("NBDNL".equals(termainalCode)) {
            this.termainalCode = "东南物流";
        } else if ("NBNX".equals(termainalCode)) {
            this.termainalCode = "宁翔储运";
        } else if ("NBRY".equals(termainalCode)) {
            this.termainalCode = "瑞源堆场";
        } else if ("NBZR".equals(termainalCode)) {
            this.termainalCode = "宁波中燃";
        } else if ("NDCC".equals(termainalCode)) {
            this.termainalCode = "大港堆场";
        } else if ("NHCC".equals(termainalCode)) {
            this.termainalCode = "和欣货柜";
        } else if ("NSSL".equals(termainalCode)) {
            this.termainalCode = "新世洋物流";
        } else if ("SXZG".equals(termainalCode)) {
            this.termainalCode = "三星重工";
        } else if ("WHMT".equals(termainalCode)) {
            this.termainalCode = "万华码头";
        } else if ("WZCT".equals(termainalCode)) {
            this.termainalCode = "温州港区";
        } else if ("XUNDA".equals(termainalCode)) {
            this.termainalCode = "迅达仓储";
        } else if ("YGHAL".equals(termainalCode)) {
            this.termainalCode = "永港海安";
        } else if ("YZCT".equals(termainalCode)) {
            this.termainalCode = "甬舟码头";
        } else if ("ZHCT".equals(termainalCode)) {
            this.termainalCode = "镇司(ZHCT)";
        } else if ("ZIT".equals(termainalCode)) {
            this.termainalCode = "乍浦码头";
        } else if ("ZRCCJHC".equals(termainalCode)) {
            this.termainalCode = "中石化镇海";
        } else if ("ZHGC".equals(termainalCode)) {
            this.termainalCode = "镇司(ZHGC)";
        } else {
            this.termainalCode = termainalCode;
        }
    }
}