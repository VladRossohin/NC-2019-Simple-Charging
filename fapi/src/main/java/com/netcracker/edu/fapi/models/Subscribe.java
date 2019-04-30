package com.netcracker.edu.fapi.models;

import java.sql.Date;

public class Subscribe {

    /*
        private long id;
    */
    private String userLogin;
    private String servicesName;
    private String billingAccountsNumber;
    private java.sql.Date createDate;
    private int period;


    public Subscribe() {
    }

    public Subscribe(String userLogin, String servicesName, String billingAccountsNumber, java.sql.Date createDate, int period) {
        this.userLogin = userLogin;
        this.servicesName = servicesName;
        this.billingAccountsNumber = billingAccountsNumber;
        this.createDate = createDate;
        this.period = period;
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

    public String getBillingAccountsNumber() {
        return billingAccountsNumber;
    }

    public void setBillingAccountsNumber(String billingAccountsNumber) {
        this.billingAccountsNumber = billingAccountsNumber;
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