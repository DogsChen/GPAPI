package com.wxs.gp.mapper;

import com.wxs.gp.domain.ProductSale;

import java.util.List;

public interface ProductSaleMapper {
    //添加商品规格
    int addProductSale(ProductSale Product);

    //添加商品s
    void addProductSales(ProductSale[] Product);

    //    删除商品
    void deleteProductSale(int id);

    //    删除商品s
    void deleteProductTypeByids(int[] Productids);

    List<ProductSale> getProductByid(int id);

    List<ProductSale> getProductAll();

    List<ProductSale> getProdcutSaleListTop();
}
