package com.wxs.gp.mapper;


import com.wxs.gp.domain.Producttype;

import java.util.List;

public interface ProductTypeMapper {
    //添加商品规格
    void addProductType(Producttype ptype);

    //添加商品规格
    void addProductTypes(List<Producttype> ptype);

    //    删除商品规格
    void deleteProductType(int ptype_id);

    //    删除商品的所有规格
    void deleteProductTypeByProductid(int Productid);

    List<Producttype> getProductTypeByProductid(int pid);

}
