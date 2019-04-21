package com.netcracker.edu.fapi.models;


import java.sql.Date;

public class Service {

    private String name;
    private String description;
    private String user;
    private int cost;
    private Date createDate;

    public Service() {
    }

    public Service(String name, String description, String user, int cost, Date createDate) {
        this.name = name;
        this.description = description;
        this.user = user;
        this.cost = cost;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
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
