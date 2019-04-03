package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.domain.Module_define;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Module_defineDao {
    @Select("select * from module_define where module_name = #{module_name}")
    Module_define findBymodule_name(String module_name);

    @Select("select *from module_define")
    List<Module_define> findAll();
}
