package com.wxs.gp.controller;

import com.alibaba.fastjson.JSON;
import com.wxs.gp.common.ReturnFormat;
import com.wxs.gp.domain.ProductSale;
import com.wxs.gp.domain.Producttype;
import com.wxs.gp.service.impl.ProductSaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@CrossOrigin
@Controller()
@RequestMapping(value = "/api/product")
public class ProdcutSaleController {
    @Autowired
    private ProductSaleServiceImpl productSaleService;


    @RequestMapping("/add1")
    @ResponseBody
    public Object addOneProductsale(ProductSale productSale) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        productSale.setSettime(new Date());
        System.out.println(productSale);
        int i = productSaleService.addOne(productSale);
        return ReturnFormat.retData(i);
    }

    @RequestMapping(value = "/add2")
    @ResponseBody
    public Object addProducttype(String pList) {
        List<Producttype> types = JSON.parseArray(pList, Producttype.class);
        productSaleService.addTypes(types);

        return ReturnFormat.retData(types);
    }

    /**
     * 查询数据 top count
     *
     * @param count
     * @return
     */
    @RequestMapping(value = "/listtable/{count}")
    @ResponseBody
    public Object addProducttype(@PathVariable(value = "count", required = false) Integer count) {
        List<ProductSale> list;
        list = productSaleService.getProdcutSaleListAll();
        return ReturnFormat.retData(list);
    }

    /**
     * 查询类型数据根据id
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/getproductype/{pid}")
    @ResponseBody
    public Object getPtypesByPid(@PathVariable(value = "pid", required = false) Integer id) {
        List<Producttype> list;
        list = productSaleService.getProductTypeByProductid(id);
        return ReturnFormat.retData(list);
    }

}
