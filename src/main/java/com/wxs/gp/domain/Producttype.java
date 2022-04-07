package com.wxs.gp.domain;

public class Producttype {

    private int id;
    private String name;
    private Double price;
    private int number;
    private String photopath;
    private int productsaleid;

    public Producttype() {
    }

    public Producttype(int id, String name, Double price, int number, String photopath, int productsaleid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
        this.photopath = photopath;
        this.productsaleid = productsaleid;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    public int getProductsaleid() {
        return productsaleid;
    }

    public void setProductsaleid(int productsaleid) {
        this.productsaleid = productsaleid;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Producttype{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", photopath='" + photopath + '\'' +
                ", productsaleid=" + productsaleid +
                '}';
    }
}
