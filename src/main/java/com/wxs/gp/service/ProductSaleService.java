package com.wxs.gp.service;

import com.wxs.gp.domain.ProductSale;
import com.wxs.gp.domain.Producttype;

import java.util.List;

public interface ProductSaleService {
    //添加商品
    int addOne(ProductSale productSale);

    List<ProductSale> getProdcutSaleListTop(int number);

    List<ProductSale> getProdcutSaleListByBegEnd(int begin, int end);

    List<ProductSale> getProdcutSaleListAll();


    //   添加商品规格
    void addTypes(List<Producttype> productSale);

    List<Producttype> getProductTypeByProductid(Integer pid);
}
