package com.netcracker.edu.backend.dto;

public class BillingAccountDto {
    String type;
    String number;
    Integer money;
    String userLogin;

    public BillingAccountDto(String type, String number, Integer money, String userLogin) {
        this.type = type;
        this.number = number;
        this.money = money;
        this.userLogin = userLogin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }
}
