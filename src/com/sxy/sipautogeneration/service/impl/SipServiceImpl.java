package com.sxy.sipautogeneration.service.impl;

import com.sxy.sipautogeneration.dao.Sip_defineDao;
import com.sxy.sipautogeneration.domain.Sip_define;
import com.sxy.sipautogeneration.service.SipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
@Service("sipService")
public class SipServiceImpl implements SipService {

    @Autowired
    private Sip_defineDao sip_defineDao;


    @Override
    public List<Sip_define> findByUser_id(Integer user_id) {
        return sip_defineDao.findByUser_id(user_id);
    }

    @Override
    public Sip_define findBySip_code(String sip_code) {
        return sip_defineDao.findBySip_code(sip_code);
    }

    @Override
    public List<Sip_define> findall() {
        return sip_defineDao.findAll();
    }

    @Override
    public Integer saveSip(Sip_define sip_define) {
        sip_defineDao.save(sip_define);
        return new Integer("1");
    }

    @Override
    public Integer updateSip(Sip_define sip_define) {
        sip_defineDao.update(sip_define);
        return new Integer("1");
    }

    @Override
    public Integer deleteSip(String sip_id) {
        sip_defineDao.delete(sip_id);
        return new Integer("1");
    }
}
