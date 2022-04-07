package com.wxs.gp.domain;

import java.util.List;

public class Menu {
    private int id;
    private String path;
    private String icon;
    private String sclass;
    private String title;
    private int orderidx;
    private int parentid;
    private int isshow;
    private String remark;
    private int usertype;
    private List<Menu> children;

    public Menu() {
    }

    public Menu(Menu menu) {
        this.id = menu.getId();
        this.path = menu.getPath();
        this.icon = menu.getIcon();
        this.sclass = menu.getSclass();
        this.title = menu.getTitle();
//        this.orderidx =     menu.getOrderidx();
        this.parentid = menu.getParentid();
//        this.isshow =       menu.getIsshow();
//        this.remark =       menu.getRemark();
//        this.usertype =     menu.getUsertype();
        this.children = menu.getChildren();
    }

    public Menu(int id, String path, String icon, String sclass, String title, int orderidx, int parentid, int isshow, String remark, int usertype) {
        this.id = id;
        this.path = path;
        this.icon = icon;
        this.sclass = sclass;
        this.title = title;
        this.orderidx = orderidx;
        this.parentid = parentid;
        this.isshow = isshow;
        this.remark = remark;
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", path='" + path + '\'' +
                ", icon='" + icon + '\'' +
                ", sclass='" + sclass + '\'' +
                ", title='" + title + '\'' +
                ", orderidx=" + orderidx +
                ", parentid=" + parentid +
                ", isshow=" + isshow +
                ", remark='" + remark + '\'' +
                ", usertype=" + usertype +
//                ", children=" + children +
                '}';
    }

    public int getUsertype() {
        return usertype;
    }

    public void setUsertype(int usertype) {
        this.usertype = usertype;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public int getIsshow() {
        return isshow;
    }

    public void setIsshow(int isshow) {
        this.isshow = isshow;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        if (path.equals(""))
            path = "/";
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrderidx() {
        return orderidx;
    }

    public void setOrderidx(int orderidx) {
        this.orderidx = orderidx;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
