package com.sxy.sipautogeneration.service;

import com.sxy.sipautogeneration.domain.County_define;
import com.sxy.sipautogeneration.domain.User_info;

import java.util.List;

public interface UserService {

    /**
     * 用户登录
     * @param user_name 用户名
     * @param login_password 用户登录密码
     * @return 用户信息
     */
    User_info login(String user_name,String login_password);

    /**
     * 查询所有用户信息
     * @return 所有用户信息列表
     */
    List<User_info> findAllUser();

    /**
     * 根据用户ID查找用户
     * @param user_info 查找信息
     * @return 用户信息
     */
    List<User_info> findUser(User_info user_info);

    /**
     * 添加用户
     * @param user_info 用户信息
     * @return 是否成功
     */
    Integer addUser(User_info user_info);

    /**
     * 更新用户
     * @param user_info 用户信息
     * @return 是否成功
     */
    Integer updateUser(User_info user_info);

    /**
     * 查询所有县市信息
     * @return 县市信息表
     */
    List<County_define> findAllCounty();
}
