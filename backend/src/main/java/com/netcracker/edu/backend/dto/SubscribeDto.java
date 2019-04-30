package com.netcracker.edu.backend.dto;

import com.netcracker.edu.backend.entity.Services;

import java.sql.Date;

public class SubscribeDto {
    private String userLogin;
    private String billingAccountsNumber;
    private String ServicesName;
    private Date createDate;
    private int period;


    public SubscribeDto() {
    }

    public SubscribeDto(String userLogin, String billingAccountsNumber, String servicesName, Date createDate, int period) {
        this.userLogin = userLogin;
        this.billingAccountsNumber = billingAccountsNumber;
        ServicesName = servicesName;
        this.createDate = createDate;
        this.period = period;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getBillingAccountsNumber() {
        return billingAccountsNumber;
    }

    public void setBillingAccountsNumber(String billingAccountsNumberNumber) {
        this.billingAccountsNumber = billingAccountsNumber;
    }

    public String getServicesName() {
        return ServicesName;
    }

    public void setServicesName(String servicesName) {
        ServicesName = servicesName;
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
