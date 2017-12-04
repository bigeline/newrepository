package com.ssmTest.demo.entity;

import java.util.Date;

public class ImportOrExport {
    private String blNo;

    private Double ctnGrossWeight;

    private String ctnNo;

    private String ctnOperatorCode;

    private String ctnSizeType;

    private String ctnStatus;

    private String direct;

    private String dlPortCode;

    private String id;

    private Date inGateTime;

    private Date msgReceiveTime;

    private String sealNo;

    private String senderCode;

    private String vessel;

    private String voyage;

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo == null ? null : blNo.trim();
    }

    public Double getCtnGrossWeight() {
        return ctnGrossWeight;
    }

    public void setCtnGrossWeight(Double ctnGrossWeight) {
        this.ctnGrossWeight = ctnGrossWeight;
    }

    public String getCtnNo() {
        return ctnNo;
    }

    public void setCtnNo(String ctnNo) {
        this.ctnNo = ctnNo == null ? null : ctnNo.trim();
    }

    public String getCtnOperatorCode() {
        return ctnOperatorCode;
    }

    public void setCtnOperatorCode(String ctnOperatorCode) {
        this.ctnOperatorCode = ctnOperatorCode == null ? null : ctnOperatorCode.trim();
    }

    public String getCtnSizeType() {
        return ctnSizeType;
    }

    public void setCtnSizeType(String ctnSizeType) {
        this.ctnSizeType = ctnSizeType == null ? null : ctnSizeType.trim();
    }

    public String getCtnStatus() {
        return ctnStatus;
    }

    public void setCtnStatus(String ctnStatus) {
        this.ctnStatus = ctnStatus == null ? null : ctnStatus.trim();
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct == null ? null : direct.trim();
    }

    public String getDlPortCode() {
        return dlPortCode;
    }

    public void setDlPortCode(String dlPortCode) {
        this.dlPortCode = dlPortCode == null ? null : dlPortCode.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getInGateTime() {
        return inGateTime;
    }

    public void setInGateTime(Date inGateTime) {
        this.inGateTime = inGateTime;
    }

    public Date getMsgReceiveTime() {
        return msgReceiveTime;
    }

    public void setMsgReceiveTime(Date msgReceiveTime) {
        this.msgReceiveTime = msgReceiveTime;
    }

    public String getSealNo() {
        return sealNo;
    }

    public void setSealNo(String sealNo) {
        this.sealNo = sealNo == null ? null : sealNo.trim();
    }

    public String getSenderCode() {
        return senderCode;
    }


    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel == null ? null : vessel.trim();
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage == null ? null : voyage.trim();
    }

    @Override
    public String toString() {
        return "ImportOrExport{" +
                "blNo='" + blNo + '\'' +
                ", ctnGrossWeight=" + ctnGrossWeight +
                ", ctnNo='" + ctnNo + '\'' +
                ", ctnOperatorCode='" + ctnOperatorCode + '\'' +
                ", ctnSizeType='" + ctnSizeType + '\'' +
                ", ctnStatus='" + ctnStatus + '\'' +
                ", direct='" + direct + '\'' +
                ", dlPortCode='" + dlPortCode + '\'' +
                ", id='" + id + '\'' +
                ", inGateTime=" + inGateTime +
                ", msgReceiveTime=" + msgReceiveTime +
                ", sealNo='" + sealNo + '\'' +
                ", senderCode='" + senderCode + '\'' +
                ", vessel='" + vessel + '\'' +
                ", voyage='" + voyage + '\'' +
                '}';
    }

    public void setSenderCode(String senderCode) {
        if (senderCode == null) {
            this.senderCode = null;
        } else {
            senderCode = senderCode.trim();
        }
        if ("ALTCNB".equals(senderCode)) {
            this.senderCode = "安联储运";
        } else if ("B2SCT".equals(senderCode)) {
            this.senderCode = "北仑山码头";
        } else if ("BDNLPG".equals(senderCode)) {
            this.senderCode = "百地年";
        } else if ("BLCT".equals(senderCode)) {
            this.senderCode = "NBCT(二期)";
        } else if ("BLCT2".equals(senderCode)) {
            this.senderCode = "北二集司(三期)";
        } else if ("BLCT3".equals(senderCode)) {
            this.senderCode = "港吉(四期)";
        } else if ("BLCTCFS".equals(senderCode)) {
            this.senderCode = "通达公司";
        } else if ("BLCTMS".equals(senderCode)) {
            this.senderCode = "梅山码头";
        } else if ("BLCTMSCFS".equals(senderCode)) {
            this.senderCode = "四海物流";
        } else if ("BLCTYD".equals(senderCode)) {
            this.senderCode = "远东(五期)";
        } else if ("BLCTZS".equals(senderCode)) {
            this.senderCode = "大榭招商(CMICT)";
        } else if ("BLHH2".equals(senderCode)) {
            this.senderCode = "北二司(BLHH2)";
        } else if ("CSCFS".equals(senderCode)) {
            this.senderCode = "长胜堆场";
        } else if ("DXCTE".equals(senderCode)) {
            this.senderCode = "大榭信业码头";
        } else if ("JIAYANG".equals(senderCode)) {
            this.senderCode = "佳洋物流";
        } else if ("LONGZHOU".equals(senderCode)) {
            this.senderCode = "龙洲物流";
        } else if ("NBAD".equals(senderCode)) {
            this.senderCode = "安达堆场";
        } else if ("NBDNL".equals(senderCode)) {
            this.senderCode = "东南物流";
        } else if ("NBNX".equals(senderCode)) {
            this.senderCode = "宁翔储运";
        } else if ("NBRY".equals(senderCode)) {
            this.senderCode = "瑞源堆场";
        } else if ("NBZR".equals(senderCode)) {
            this.senderCode = "宁波中燃";
        } else if ("NDCC".equals(senderCode)) {
            this.senderCode = "大港堆场";
        } else if ("NHCC".equals(senderCode)) {
            this.senderCode = "和欣货柜";
        } else if ("NSSL".equals(senderCode)) {
            this.senderCode = "新世洋物流";
        } else if ("SXZG".equals(senderCode)) {
            this.senderCode = "三星重工";
        } else if ("WHMT".equals(senderCode)) {
            this.senderCode = "万华码头";
        } else if ("WZCT".equals(senderCode)) {
            this.senderCode = "温州港区";
        } else if ("XUNDA".equals(senderCode)) {
            this.senderCode = "迅达仓储";
        } else if ("YGHAL".equals(senderCode)) {
            this.senderCode = "永港海安";
        } else if ("YZCT".equals(senderCode)) {
            this.senderCode = "甬舟码头";
        } else if ("ZHCT".equals(senderCode)) {
            this.senderCode = "镇司(ZHCT)";
        } else if ("ZIT".equals(senderCode)) {
            this.senderCode = "乍浦码头";
        } else if ("ZRCCJHC".equals(senderCode)) {
            this.senderCode = "中石化镇海";
        } else if ("ZHGC".equals(senderCode)) {
            this.senderCode = "镇司(ZHGC)";
        } else {
            this.senderCode = senderCode;
        }
    }
}
