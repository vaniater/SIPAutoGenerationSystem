package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.domain.Role_define;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Role_defineDao {
    @Select("select * from role_define where role_name = #{role_name}")
    Role_define findByrole_name(@Param("role_name") String role_name);

    @Select("select * from role_define where role_id =#{role_id}")
    Role_define findByrole_id(@Param("role_id") String role_id);

    @Select("select * from role_define")
    List<Role_define> findAll();
}
