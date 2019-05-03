package com.netcracker.edu.fapi.models;

import java.sql.Date;

public class Subscribe {

    private long id;
    private long serviceId;
    private String userLogin;
    private String servicesName;
    private String billingAccountNumber;
    private java.sql.Date createDate;
    private int period;


    public Subscribe() {
    }

    public Subscribe(long id, long serviceId, String userLogin, String servicesName, String billingAccountNumber, Date createDate, int period) {
        this.id = id;
        this.serviceId = serviceId;
        this.userLogin = userLogin;
        this.servicesName = servicesName;
        this.billingAccountNumber = billingAccountNumber;
        this.createDate = createDate;
        this.period = period;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}