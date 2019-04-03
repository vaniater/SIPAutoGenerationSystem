package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.dao.provider.Sip_defineDynaSqlProvider;
import com.sxy.sipautogeneration.domain.Sip_define;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Sip_defineDao {
    /**
     * 根据创建者IP查询SIP信息
     * @param user_id 创建者ID
     * @return 完整SIP信息
     */
    @Select("select * from sip_define where user_id = #{user_id}")
    List<Sip_define> findByUser_id(@Param("user_id") Integer user_id);

    /**
     * 根据SIP编码查询SIP信息
     * @param sip_code SIP编码
     * @return 完整SIP信息
     */
    @Select("select * from sip_define where sip_code = #{sip_code}")
    Sip_define findBySip_code(@Param("sip_code") String sip_code);

    /**
     * 查询所有SIP信息
     * @return 所有SIP信息列表
     */
    @Select("select * from sip_define")
    List<Sip_define> findAll();

    /**
     * 保存设备SIP信息
     * @param sip_define 新的设备SIP信息
     */
    @SelectProvider(type = Sip_defineDynaSqlProvider.class,method = "insertSip")
    void save(Sip_define sip_define);

    /**
     * 更新设备SIP信息
     * @param sip_define 新的SIP信息
     */
    @SelectProvider(type = Sip_defineDynaSqlProvider.class,method = "updateSip")
    void update(Sip_define sip_define);

    /**
     * 删除
     * @param sip_id
     */
    void delete(String sip_id);
}
