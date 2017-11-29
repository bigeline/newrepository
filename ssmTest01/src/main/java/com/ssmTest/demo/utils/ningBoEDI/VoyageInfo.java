package com.ssmTest.demo.utils.ningBoEDI;

/**
 * 船舶周计划信息类
 */
public class VoyageInfo {
    /**
     * 挂靠码头代码
     */
    private String termainalCode;
    /**
     * 英文船名
     */
    private String engdescription;
    /**
     * 中文船名
     */
    private String chndescription;
    /**
     * 航次
     */
    private String voyage;
    /**
     * 进出口标识
     */
    private String direction;
    /**
     * UN代码
     */
    private String vesselcode;
    /**
     * 预计抵港
     */
    private String etaarriveddate;
    /**
     * 实际抵港
     */
    private String arrivaldate;
    /**
     * 预计离港时间
     */
    private String etasailingdate;
    /**
     * 实际离港时间
     */
    private String dischargedate;

    @Override
    public String toString() {
        return "VoyageInfo{" +
                "termainalCode='" + termainalCode + '\'' +
                ", engdescription='" + engdescription + '\'' +
                ", chndescription='" + chndescription + '\'' +
                ", voyage='" + voyage + '\'' +
                ", direction='" + direction + '\'' +
                ", vesselcode='" + vesselcode + '\'' +
                ", etaarriveddate='" + etaarriveddate + '\'' +
                ", arrivaldate='" + arrivaldate + '\'' +
                ", etasailingdate='" + etasailingdate + '\'' +
                ", dischargedate='" + dischargedate + '\'' +
                '}';
    }

    public String getTermainalCode() {
        return termainalCode;
    }

    public String getEngdescription() {
        return engdescription;
    }

    public void setEngdescription(String engdescription) {
        this.engdescription = engdescription;
    }

    public String getChndescription() {
        return chndescription;
    }

    public void setChndescription(String chndescription) {
        this.chndescription = chndescription;
    }

    public String getVoyage() {
        return voyage;
    }

    public void setVoyage(String voyage) {
        this.voyage = voyage;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getVesselcode() {
        return vesselcode;
    }

    public void setVesselcode(String vesselcode) {
        this.vesselcode = vesselcode;
    }

    public String getEtaarriveddate() {
        return etaarriveddate;
    }

    public void setEtaarriveddate(String etaarriveddate) {
        this.etaarriveddate = etaarriveddate;
    }

    public String getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(String arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public String getEtasailingdate() {
        return etasailingdate;
    }

    public void setEtasailingdate(String etasailingdate) {
        this.etasailingdate = etasailingdate;
    }

    public String getDischargedate() {
        return dischargedate;
    }

    public void setDischargedate(String dischargedate) {
        this.dischargedate = dischargedate;
    }

    public void setTermainalCode(String termainalCode) {
        if (termainalCode == "ALTCNB") {
            this.termainalCode = "安联储运";
        } else if (termainalCode == "B2SCT") {
            this.termainalCode = "北仑山码头";
        } else if (termainalCode == "BDNLPG") {
            this.termainalCode = "百地年";
        } else if (termainalCode == "BLCT") {
            this.termainalCode = "NBCT(二期)";
        } else if (termainalCode == "BLCT2") {
            this.termainalCode = "北二集司(三期)";
        } else if (termainalCode == "BLCT3") {
            this.termainalCode = "港吉(四期)";
        } else if (termainalCode == "BLCTCFS") {
            this.termainalCode = "通达公司";
        } else if (termainalCode == "BLCTMS") {
            this.termainalCode = "梅山码头";
        } else if (termainalCode == "BLCTMSCFS") {
            this.termainalCode = "四海物流";
        } else if (termainalCode == "BLCTYD") {
            this.termainalCode = "远东(五期)";
        } else if (termainalCode == "BLCTZS") {
            this.termainalCode = "大榭招商(CMICT)";
        } else if (termainalCode == "BLHH2") {
            this.termainalCode = "北二司(BLHH2)";
        } else if (termainalCode == "CSCFS") {
            this.termainalCode = "长胜堆场";
        } else if (termainalCode == "DXCTE") {
            this.termainalCode = "大榭信业码头";
        } else if (termainalCode == "JIAYANG") {
            this.termainalCode = "佳洋物流";
        } else if (termainalCode == "LONGZHOU") {
            this.termainalCode = "龙洲物流";
        } else if (termainalCode == "NBAD") {
            this.termainalCode = "安达堆场";
        } else if (termainalCode == "NBDNL") {
            this.termainalCode = "东南物流";
        } else if (termainalCode == "NBNX") {
            this.termainalCode = "宁翔储运";
        } else if (termainalCode == "NBRY") {
            this.termainalCode = "瑞源堆场";
        } else if (termainalCode == "NBZR") {
            this.termainalCode = "宁波中燃";
        } else if (termainalCode == "NDCC") {
            this.termainalCode = "大港堆场";
        } else if (termainalCode == "NHCC") {
            this.termainalCode = "和欣货柜";
        } else if (termainalCode == "NSSL") {
            this.termainalCode = "新世洋物流";
        } else if (termainalCode == "SXZG") {
            this.termainalCode = "三星重工";
        } else if (termainalCode == "WHMT") {
            this.termainalCode = "万华码头";
        } else if (termainalCode == "WZCT") {
            this.termainalCode = "温州港区";
        } else if (termainalCode == "XUNDA") {
            this.termainalCode = "迅达仓储";
        } else if (termainalCode == "YGHAL") {
            this.termainalCode = "永港海安";
        } else if (termainalCode == "YZCT") {
            this.termainalCode = "甬舟码头";
        } else if (termainalCode == "ZHCT") {
            this.termainalCode = "镇司(ZHCT)";
        } else if (termainalCode == "ZIT") {
            this.termainalCode = "乍浦码头";
        } else if (termainalCode == "ZRCCJHC") {
            this.termainalCode = "中石化镇海";
        } else if (termainalCode == "ZHGC") {
            this.termainalCode = "镇司(ZHGC)";
        } else {
            this.termainalCode = termainalCode;
        }
    }
}
