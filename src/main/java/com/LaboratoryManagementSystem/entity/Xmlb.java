package com.LaboratoryManagementSystem.entity;

public class Xmlb {
    private String xmlbId;

    private String xmlbXmmc;

    private String xmlbMs;

    private String xmlbZq;

    public String getXmlbId() {
        return xmlbId;
    }

    public void setXmlbId(String xmlbId) {
        this.xmlbId = xmlbId == null ? null : xmlbId.trim();
    }

    public String getXmlbXmmc() {
        return xmlbXmmc;
    }

    public void setXmlbXmmc(String xmlbXmmc) {
        this.xmlbXmmc = xmlbXmmc == null ? null : xmlbXmmc.trim();
    }

    public String getXmlbMs() {
        return xmlbMs;
    }

    public void setXmlbMs(String xmlbMs) {
        this.xmlbMs = xmlbMs == null ? null : xmlbMs.trim();
    }

    public String getXmlbZq() {
        return xmlbZq;
    }

    public void setXmlbZq(String xmlbZq) {
        this.xmlbZq = xmlbZq == null ? null : xmlbZq.trim();
    }
}