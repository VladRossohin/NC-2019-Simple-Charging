package com.netcracker.edu.backend.dto;

import java.sql.Date;

public class SubscribeDto {
    private long id;
    private String userLogin;
    private String billingAccountNumber;
    private long serviceId;
    private String serviceName;
    private Date createDate;
    private int period;


    public SubscribeDto() {
    }

    public SubscribeDto(long id, String userLogin, String billingAccountNumber, long serviceId, String serviceName, Date createDate, int period) {
        this.id = id;
        this.userLogin = userLogin;
        this.billingAccountNumber = billingAccountNumber;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.createDate = createDate;
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

    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    public void setBillingAccountNumber(String billingAccountNumber) {
        this.billingAccountNumber = billingAccountNumber;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
