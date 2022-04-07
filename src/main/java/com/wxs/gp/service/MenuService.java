package com.wxs.gp.service;

import com.wxs.gp.domain.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getMenuList(String username);
}
