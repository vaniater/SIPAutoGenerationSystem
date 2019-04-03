package com.sxy.sipautogeneration.service;


import com.sxy.sipautogeneration.domain.Sip_define;

import java.util.List;

public interface SipService {

    /**
     * 根据创建者ID查询SIP
     * @param user_id 创建者ID
     * @return SIP信息列表
     */
    List<Sip_define> findByUser_id(Integer user_id);

    /**
     * 根据SIP编码查询完整SIP信息
     * @param sip_code SIP编码
     * @return 完整SIP信息
     */
    Sip_define findBySip_code(String sip_code);

    /**
     * 查询所有SIP
     * @return SIP信息的列表
     */
    List<Sip_define> findall();

    /**
     * 保存SIP信息
     * @param sip_define SIP信息
     * @return 保存结果
     */
    Integer saveSip(Sip_define sip_define);

    /**
     * 保存SIP信息
     * @return 保存结果
     */
    Integer updateSip(Sip_define sip_define);

    /**
     * 删除SIP信息
     * @return 删除结果
     */
    Integer deleteSip(String sip_id);

}
