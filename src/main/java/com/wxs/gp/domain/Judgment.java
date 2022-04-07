package com.wxs.gp.domain;

import java.util.Date;

public class Judgment {
    private int id;
    private String content;
    private Date settime;
    private int uid;
    private int productsale_id;
//    private ProductSale productSale;

    public Judgment() {
    }

    public Judgment(int id, String content, Date settime, int uid, int productsale_id) {
        this.id = id;
        this.content = content;
        this.settime = settime;
        this.uid = uid;
        this.productsale_id = productsale_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

//    public ProductSale getProductSale() {
//        return productSale;
//    }

//    public void setProductSale(ProductSale productSale) {
//        this.productSale = productSale;
//    }

    public int getProductsale_id() {
        return productsale_id;
    }

    public void setProductsale_id(int productsale_id) {
        this.productsale_id = productsale_id;
    }
}
