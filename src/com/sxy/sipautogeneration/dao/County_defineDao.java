package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.domain.County_define;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.sxy.sipautogeneration.util.common.COUNTYTABLE;

@Repository
@Mapper
public interface County_defineDao {
    @Select("select * from "+COUNTYTABLE+" where county_name = #{county_name}")
    County_define findBycounty_name(@Param("county_name") String county_name);

    @Select("select * from "+COUNTYTABLE+" county_define where county_code = #{county_code}")
    County_define findBycounty_code(@Param("county_code")String county_code);

    @Select("select *from "+COUNTYTABLE)
    List<County_define> findAll();
}
