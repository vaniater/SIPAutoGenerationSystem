package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.domain.Permission_define;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Permission_defineDao {
    @Select("select * from permission_define where role_id =#{role_id} and module_id=#{module_id}")
    Permission_define findByrole_idAndmodule_id(@Param("role_id") String role_id, @Param("module_id") String module_id);

    @Select("select * from permission_define")
    List<Permission_define> findAll();
}
