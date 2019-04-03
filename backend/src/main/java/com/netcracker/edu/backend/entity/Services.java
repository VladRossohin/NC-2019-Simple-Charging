package com.netcracker.edu.backend.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Users user;

    private String name;

    private String description;

    private int cost;

    private Date createDate;

    @ManyToMany
    private Collection<Subscribes> subscribes;

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

    public Collection<Subscribes> getSubscribes() {
        return subscribes;
    }

    public void setSubscribes(Collection<Subscribes> subscribes) {
        this.subscribes = subscribes;
    }

    public Services() {
    }


    public Services(Users user, String name, String description, int cost, Date createDate, Collection<Subscribes> subscribes) {
        this.user = user;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.createDate = createDate;
        this.subscribes = subscribes;
    }
}
