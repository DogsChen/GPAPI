package com.wxs.gp.mapper;

import com.wxs.gp.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    @Insert("insert user values(#{id},#{username},#{password},#{email},#{phoneNum},#{gender})")
    void saveOne(User u);


    List<User> getUserByContent(User u);

    List<User> findUserByIds(@Param("ids") List<Integer> ids);
//    List<User> findUserByIds(Long[] list);


}
