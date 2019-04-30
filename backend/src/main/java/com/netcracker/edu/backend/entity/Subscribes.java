package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Subscribes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private int period;
    private Users usersByUserId;
    private BillingAccounts billingAccountsByBaId;
    private Services servicesByServiceId;

    public Subscribes() {
    }

    public Subscribes(Date date, int period, Users usersByUserId, BillingAccounts billingAccountsByBaId, Services servicesByServiceId) {
        this.date = date;
        this.period = period;
        this.usersByUserId = usersByUserId;
        this.billingAccountsByBaId = billingAccountsByBaId;
        this.servicesByServiceId = servicesByServiceId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "period", nullable = false)
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscribes that = (Subscribes) o;
        return id == that.id &&
                period == that.period &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, period);
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @ManyToOne
    @JoinColumn(name = "ba_id", referencedColumnName = "id", nullable = false)
    public BillingAccounts getBillingAccountsByBaId() {
        return billingAccountsByBaId;
    }

    public void setBillingAccountsByBaId(BillingAccounts billingAccountsByBaId) {
        this.billingAccountsByBaId = billingAccountsByBaId;
    }

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id", nullable = false)
    public Services getServicesByServiceId() {
        return servicesByServiceId;
    }

    public void setServicesByServiceId(Services servicesByServiceId) {
        this.servicesByServiceId = servicesByServiceId;
    }
}
