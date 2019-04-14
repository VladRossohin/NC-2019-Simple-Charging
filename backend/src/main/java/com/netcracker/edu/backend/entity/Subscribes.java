package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Subscribes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private long baId;
    private long serviceId;
    private Date date;
    private int period;
    private Services servicesByServiceId;

    public Subscribes() {
    }

    public Subscribes(long userId, long baId, long serviceId, Date date, int period, Services servicesByServiceId) {
        this.userId = userId;
        this.baId = baId;
        this.serviceId = serviceId;
        this.date = date;
        this.period = period;
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
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ba_id", nullable = false)
    public long getBaId() {
        return baId;
    }

    public void setBaId(long baId) {
        this.baId = baId;
    }

    @Basic
    @Column(name = "service_id", nullable = false, insertable = false, updatable = false)
    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
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
                userId == that.userId &&
                baId == that.baId &&
                serviceId == that.serviceId &&
                period == that.period &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, baId, serviceId, date, period);
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
