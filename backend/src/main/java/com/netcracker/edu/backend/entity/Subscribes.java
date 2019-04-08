package com.netcracker.edu.backend.entity;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Subscribes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Users userId;

    @ManyToMany
    private Collection<Services> services;

    @ManyToMany
    private Collection<BillingAccounts> billingAccounts;

    private Date subscribeDate;

    private int subsribePeriod;

    public Subscribes() {
    }

    public Subscribes(Users userId, Collection<Services> services, Collection<BillingAccounts> billingAccounts, Date subscribeDate, int subsribePeriod) {
        this.userId = userId;
        this.services = services;
        this.billingAccounts = billingAccounts;
        this.subscribeDate = subscribeDate;
        this.subsribePeriod = subsribePeriod;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Collection<Services> getServices() {
        return services;
    }

    public void setServices(Collection<Services> services) {
        this.services = services;
    }

    public Collection<BillingAccounts> getBillingAccounts() {
        return billingAccounts;
    }

    public void setBillingAccounts(Collection<BillingAccounts> billingAccounts) {
        this.billingAccounts = billingAccounts;
    }

    public Date getSubscribeDate() {
        return subscribeDate;
    }

    public void setSubscribeDate(Date subscribeDate) {
        this.subscribeDate = subscribeDate;
    }

    public int getSubsribePeriod() {
        return subsribePeriod;
    }

    public void setSubsribePeriod(int subsribePeriod) {
        this.subsribePeriod = subsribePeriod;
    }
}
