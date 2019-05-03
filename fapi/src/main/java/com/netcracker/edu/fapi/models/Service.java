package com.netcracker.edu.fapi.models;


import java.sql.Date;

public class Service {

    private long id;
    private String name;
    private String description;
    private String userLogin;
    private int cost;
    private String createDate;

    public Service() {
    }

    public Service(long id, String name, String description, String userLogin, int cost, String createDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.userLogin = userLogin;
        this.cost = cost;
        this.createDate = createDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getUserLogin() {
        return userLogin;
    }

    public void setUser(String userLogin) {
        this.userLogin = userLogin;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
