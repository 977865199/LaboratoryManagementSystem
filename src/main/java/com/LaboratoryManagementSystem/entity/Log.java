package com.LaboratoryManagementSystem.entity;

import java.util.Date;

public class Log {
    private String logId;

    private String logDescription;

    private String logTeacherid;

    private Date logTime;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription == null ? null : logDescription.trim();
    }

    public String getLogTeacherid() {
        return logTeacherid;
    }

    public void setLogTeacherid(String logTeacherid) {
        this.logTeacherid = logTeacherid == null ? null : logTeacherid.trim();
    }

    public Date getLogTime() {
        return logTime;
    }

    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}