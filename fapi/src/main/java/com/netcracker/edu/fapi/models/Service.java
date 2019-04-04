package com.netcracker.edu.fapi.models;


import java.util.Date;

public class Service {

    private Long id;
    private String name;
    private String desctiption;
    private User user;
    private int cost;
    private Date createDate;

    public Service() {
    }

    public Service(Long id, String name, String desctiption, User user, int cost, Date createDate) {
        this.id = id;
        this.name = name;
        this.desctiption = desctiption;
        this.user = user;
        this.cost = cost;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
