package com.wxs.gp.controller;

import com.wxs.gp.common.ReturnFormat;
import com.wxs.gp.domain.User;
import com.wxs.gp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin()
@Controller()
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/add")
    @ResponseBody
    public Object addOne(User u) {
        //是否重复
        User t = new User();
        t.setUsername(u.getUsername());
        User userByContent = userService.getUserByContent(t);
        if (userByContent != null)
            return ReturnFormat.retParam(401, "用户名已被注册！");
        else {
            userService.addOne(u);
            return ReturnFormat.retData(200);
        }
    }

    @ResponseBody
    @RequestMapping("/get")
    public List<User> findUserByIds(Integer[] id) {
        //查无此人时的提示
        return userService.findUserByIds(id);
    }

    @ResponseBody
    @RequestMapping(value = "/login")
    public Object getUserByContent(String username, String password) {
        User u = new User();
        u.setUsername(username);
        u.setPassword(password);
        u = userService.getUserByContent(u);
        if (u != null) {
            u.setPassword("*");
            return ReturnFormat.retData(u);
        } else {
            String msg = "用户账户密码不正确！";
            return ReturnFormat.retParam(401, msg);
        }

    }


}
