package com.wxs.gp.service.impl;

import com.wxs.gp.domain.User;
import com.wxs.gp.mapper.UserMapper;
import com.wxs.gp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public void addOne(User u) {
        userMapper.saveOne(u);
    }


    public List<User> findUserByIds(Integer[] id) {
//        return userMapper.findUserByIds((id));
        List<Integer> li = Arrays.asList(id);
        List arrList = new ArrayList(li);
        return userMapper.findUserByIds(arrList);

    }

    public User getUserByContent(User u) {
        List<User> li = userMapper.getUserByContent(u);
        if (li.size() >= 1)
            return li.get(0);
        return null;
    }


}
