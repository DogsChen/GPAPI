package com.wxs.gp.service.impl;

import com.wxs.gp.domain.Menu;
import com.wxs.gp.mapper.MenuMapper;
import com.wxs.gp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service()
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    void printlist(List<Menu> list) {
        for (Menu item : list) {
            System.out.println(item);
        }
        System.out.println("**************");
    }

    List<Menu> parseMenulist(List<Menu> menuList, int parentid) {
        //父級菜單
        List<Menu> resparent = menuList.stream().filter(item -> item.getParentid() == parentid).collect(Collectors.toList());
        if (resparent.size() == 0)
            return null;
        System.out.println(resparent.size() + "|" + parentid);
//        準備結果集
        List<Menu> resList = new ArrayList<>();
        for (Menu item : resparent) {
            List<Menu> children = new ArrayList<>();
            List<Menu> list1 = menuList.stream().filter(s -> item.getId() == s.getParentid()).collect(Collectors.toList());
            for (Menu child : list1) {
                Menu m = new Menu(child);
                m.setChildren(parseMenulist(menuList, child.getId()));
                children.add(m);
            }
            item.setChildren(children);
            resList.add(new Menu(item));
        }
        return resList;
    }

    @Override
    public List<Menu> getMenuList(String username) {
        List<Menu> list = menuMapper.getMenuListByname(username);
        return parseMenulist(list, 0);
    }
}
