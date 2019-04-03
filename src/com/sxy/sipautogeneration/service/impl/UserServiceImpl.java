package com.sxy.sipautogeneration.service.impl;

import com.sxy.sipautogeneration.dao.County_defineDao;
import com.sxy.sipautogeneration.dao.User_infoDao;
import com.sxy.sipautogeneration.domain.County_define;
import com.sxy.sipautogeneration.domain.User_info;
import com.sxy.sipautogeneration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private User_infoDao user_infoDao;
    @Autowired
    private County_defineDao county_defineDao;

    @Transactional(readOnly = true)
    @Override
    public User_info login(String user_name, String login_password) {
        return user_infoDao.findByNameAndPassword(user_name,login_password);
    }

    @Override
    public List<User_info> findAllUser() {
        return user_infoDao.findAll();
    }

    @Override
    public List<User_info> findUser(User_info user_info) {
        return user_infoDao.find(user_info);
    }

    @Override
    public Integer addUser(User_info user_info) {
        user_infoDao.save(user_info);
        return new Integer("1");
    }

    @Override
    public Integer updateUser(User_info user_info) {
        user_infoDao.update(user_info);
        return new Integer("1");
    }

    @Override
    public List<County_define> findAllCounty() {
        return county_defineDao.findAll();
    }
}
