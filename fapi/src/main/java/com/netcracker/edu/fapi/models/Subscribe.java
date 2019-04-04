package com.netcracker.edu.fapi.models;

import java.util.Collection;
import java.util.Date;

public class Subscribe {

    private Long id;
    private User user;
    private Collection<Service> services;
    private Collection<BillingAccount> billingAccounts;
    private Date subscribeDate;
    private int subscribePeriod;


    public Subscribe() {
    }

    public Subscribe(Long id, User user, Collection<Service> services, Collection<BillingAccount> billingAccounts, Date subscribeDate, int subscribePeriod) {
        this.id = id;
        this.user = user;
        this.services = services;
        this.billingAccounts = billingAccounts;
        this.subscribeDate = subscribeDate;
        this.subscribePeriod = subscribePeriod;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
