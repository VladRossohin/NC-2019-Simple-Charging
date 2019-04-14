package com.netcracker.edu.fapi.models;

import java.util.Collection;
import java.util.Date;

public class Subscribe {

    private Long id;
    private User user;
    private Service service;
    private BillingAccount billingAccount;
    private Date date;
    private int period;


    public Subscribe() {
    }

    public Subscribe(Long id, User user, Service service, BillingAccount billingAccount, Date date, int period) {
        this.id = id;
        this.user = user;
        this.service = service;
        this.billingAccount = billingAccount;
        this.date = date;
        this.period = period;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public BillingAccount getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccount billingAccount) {
        this.billingAccount = billingAccount;
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