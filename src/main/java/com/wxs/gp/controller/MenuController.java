package com.wxs.gp.controller;

import com.wxs.gp.common.ReturnFormat;
import com.wxs.gp.domain.Menu;
import com.wxs.gp.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin()
@Controller()
@RequestMapping(value = "/api/menu")
public class MenuController {
    @Autowired(required = true)
    private MenuServiceImpl menuService;


    @ResponseBody
    @RequestMapping(value = "/getmenu")
    public Object getUserByContent(String username) {
        List<Menu> list = menuService.getMenuList(username);
        return ReturnFormat.retData(list);
    }
}
