package com.netcracker.edu.fapi.models;

import java.util.Collection;
import java.util.Date;

public class Subscribe {

    private long id;
    private String userLogin;
    private String serviceName;
    private String billingAccountNumber;
    private Date date;
    private int period;


    public Subscribe() {
    }

    public Subscribe(long id, String userLogin, String serviceName, String billingAccountNumber, Date date, int period) {
        this.id = id;
        this.userLogin = userLogin;
        this.serviceName = serviceName;
        this.billingAccountNumber = billingAccountNumber;
        this.date = date;
        this.period = period;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}