package com.netcracker.edu.backend.dto;


import java.sql.Date;

public class ServiceDto {
    String name;
    String description;
    String userLogin;
    int cost;
    Date createDate;

    public ServiceDto() {
    }

    public ServiceDto(String name, String description, String userLogin, int cost, Date createDate) {
        this.name = name;
        this.description = description;
        this.userLogin = userLogin;
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

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
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
