package com.wxs.gp.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProductSale {
    private int id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date settime;
    private int uid;
    private User user;

    public ProductSale() {
    }

    public ProductSale(int id, String name, Date settime, int uid, User user) {
        this.id = id;
        this.name = name;
        this.settime = settime;
        this.uid = uid;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSettime() {
        return settime;
    }

    public void setSettime(Date settime) {
        this.settime = settime;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "ProductSale{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", settime=" + settime +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}
