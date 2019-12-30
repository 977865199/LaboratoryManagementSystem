package com.LaboratoryManagementSystem.entity;

import java.util.Date;

public class Zxlb {
    private String zxlbId;

    private String zxlbZyjhid;

    private Date zxlbDatetime;

    private String zxlbDescription;

    public String getZxlbId() {
        return zxlbId;
    }

    public void setZxlbId(String zxlbId) {
        this.zxlbId = zxlbId == null ? null : zxlbId.trim();
    }

    public String getZxlbZyjhid() {
        return zxlbZyjhid;
    }

    public void setZxlbZyjhid(String zxlbZyjhid) {
        this.zxlbZyjhid = zxlbZyjhid == null ? null : zxlbZyjhid.trim();
    }

    public Date getZxlbDatetime() {
        return zxlbDatetime;
    }

    public void setZxlbDatetime(Date zxlbDatetime) {
        this.zxlbDatetime = zxlbDatetime;
    }

    public String getZxlbDescription() {
        return zxlbDescription;
    }

    public void setZxlbDescription(String zxlbDescription) {
        this.zxlbDescription = zxlbDescription == null ? null : zxlbDescription.trim();
    }
}