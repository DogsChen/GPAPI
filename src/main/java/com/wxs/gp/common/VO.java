package com.wxs.gp.common;

import com.wxs.gp.domain.Producttype;

import java.util.List;

public class VO {

    private List<Producttype> pList;

    public List<Producttype> getpList() {
        return pList;
    }

    public void setpList(List<Producttype> pList) {
        this.pList = pList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "pList=" + pList +
                '}';
    }
}
