package com.netcracker.edu.backend.entity;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class BillingAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Users user;

    @ManyToMany
    private Collection<Subscribes>subscribes;

    private String name;

    private int money;

    public BillingAccounts() {
    }

    public BillingAccounts(Users user, Collection<Subscribes> subscribes, String name, int money) {
        this.user = user;
        this.subscribes = subscribes;
        this.name = name;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Collection<Subscribes> getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Collection<Subscribes> subscribes) {
        this.subscribes = subscribes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
