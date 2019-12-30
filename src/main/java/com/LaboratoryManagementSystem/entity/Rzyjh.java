package com.LaboratoryManagementSystem.entity;

public class Rzyjh {
    private String rzyjhId;

    private String rzyjhYear;

    private String rzyjhMonth;

    private String rzyjhDay;

    private String rzyjhXmlbid;

    private String zzyjhStatus;

    private String rzyjhTeacherid;

    public String getRzyjhId() {
        return rzyjhId;
    }

    public void setRzyjhId(String rzyjhId) {
        this.rzyjhId = rzyjhId == null ? null : rzyjhId.trim();
    }

    public String getRzyjhYear() {
        return rzyjhYear;
    }

    public void setRzyjhYear(String rzyjhYear) {
        this.rzyjhYear = rzyjhYear == null ? null : rzyjhYear.trim();
    }

    public String getRzyjhMonth() {
        return rzyjhMonth;
    }

    public void setRzyjhMonth(String rzyjhMonth) {
        this.rzyjhMonth = rzyjhMonth == null ? null : rzyjhMonth.trim();
    }

    public String getRzyjhDay() {
        return rzyjhDay;
    }

    public void setRzyjhDay(String rzyjhDay) {
        this.rzyjhDay = rzyjhDay == null ? null : rzyjhDay.trim();
    }

    public String getRzyjhXmlbid() {
        return rzyjhXmlbid;
    }

    public void setRzyjhXmlbid(String rzyjhXmlbid) {
        this.rzyjhXmlbid = rzyjhXmlbid == null ? null : rzyjhXmlbid.trim();
    }

    public String getZzyjhStatus() {
        return zzyjhStatus;
    }

    public void setZzyjhStatus(String zzyjhStatus) {
        this.zzyjhStatus = zzyjhStatus == null ? null : zzyjhStatus.trim();
    }

    public String getRzyjhTeacherid() {
        return rzyjhTeacherid;
    }

    public void setRzyjhTeacherid(String rzyjhTeacherid) {
        this.rzyjhTeacherid = rzyjhTeacherid == null ? null : rzyjhTeacherid.trim();
    }
}