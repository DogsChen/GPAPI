package com.wxs.gp.mapper;

import com.wxs.gp.domain.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> getMenuList(int usertype);

    List<Menu> getMenuListByname(String username);
}
