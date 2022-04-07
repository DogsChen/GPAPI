package com.wxs.gp.service.impl;

import com.wxs.gp.domain.ProductSale;
import com.wxs.gp.domain.Producttype;
import com.wxs.gp.mapper.ProductSaleMapper;
import com.wxs.gp.mapper.ProductTypeMapper;
import com.wxs.gp.service.ProductSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSaleServiceImpl implements ProductSaleService {


    @Autowired
    ProductSaleMapper productSaleMapper;

    @Autowired
    ProductTypeMapper productTypeMapper;


    @Override
    public int addOne(ProductSale productSale) {
        productSaleMapper.addProductSale(productSale);
        return productSale.getId();
    }

    @Override
    public List<ProductSale> getProdcutSaleListTop(int number) {

        return productSaleMapper.getProdcutSaleListTop();

    }

    @Override
    public List<ProductSale> getProdcutSaleListByBegEnd(int begin, int end) {
        return null;
    }

    @Override
    public List<ProductSale> getProdcutSaleListAll() {

        return productSaleMapper.getProductAll();

    }


    //   添加商品规格
    @Override
    public void addTypes(List<Producttype> producttypes) {
        productTypeMapper.addProductTypes(producttypes);
    }

    @Override
    public List<Producttype> getProductTypeByProductid(Integer pid) {
        return productTypeMapper.getProductTypeByProductid(pid);
    }

}
