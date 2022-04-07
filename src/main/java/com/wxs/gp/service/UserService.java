package com.wxs.gp.service;

import com.wxs.gp.domain.User;

import java.util.List;

public interface UserService {
    void addOne(User u);

    List<User> findUserByIds(Integer[] id);

    User getUserByContent(User u);
}
