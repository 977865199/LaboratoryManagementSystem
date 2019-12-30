package com.LaboratoryManagementSystem.entity;

public class Yzyjh {
    private String yzyjhId;

    private String yzyjhYear;

    private String yzyjhMonth;

    private String yzyjhXmlbid;

    private String jzyjhStatus;

    private String yzyjhTeacherid;

    public String getYzyjhId() {
        return yzyjhId;
    }

    public void setYzyjhId(String yzyjhId) {
        this.yzyjhId = yzyjhId == null ? null : yzyjhId.trim();
    }

    public String getYzyjhYear() {
        return yzyjhYear;
    }

    public void setYzyjhYear(String yzyjhYear) {
        this.yzyjhYear = yzyjhYear == null ? null : yzyjhYear.trim();
    }

    public String getYzyjhMonth() {
        return yzyjhMonth;
    }

    public void setYzyjhMonth(String yzyjhMonth) {
        this.yzyjhMonth = yzyjhMonth == null ? null : yzyjhMonth.trim();
    }

    public String getYzyjhXmlbid() {
        return yzyjhXmlbid;
    }

    public void setYzyjhXmlbid(String yzyjhXmlbid) {
        this.yzyjhXmlbid = yzyjhXmlbid == null ? null : yzyjhXmlbid.trim();
    }

    public String getJzyjhStatus() {
        return jzyjhStatus;
    }

    public void setJzyjhStatus(String jzyjhStatus) {
        this.jzyjhStatus = jzyjhStatus == null ? null : jzyjhStatus.trim();
    }

    public String getYzyjhTeacherid() {
        return yzyjhTeacherid;
    }

    public void setYzyjhTeacherid(String yzyjhTeacherid) {
        this.yzyjhTeacherid = yzyjhTeacherid == null ? null : yzyjhTeacherid.trim();
    }
}