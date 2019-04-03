package com.sxy.sipautogeneration.dao;

import com.sxy.sipautogeneration.dao.provider.User_infoDynaSqlProvider;
import com.sxy.sipautogeneration.domain.User_info;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.sxy.sipautogeneration.util.common.USERTABLE;

@Repository
@Mapper
public interface User_infoDao {
    /**
     * 通过用户名和密码查询用户
     * @param user_name 用户名
     * @param login_password 密码
     * @return 用户信息
     */
    @Select("select * from "+ USERTABLE +" where user_name = #{user_name} and login_password = #{login_password}")
    User_info findByNameAndPassword(@Param("user_name") String user_name, @Param("login_password") String login_password);

    /**
     * 查询所有的用户信息
     * @return 所有用户信息的列表
     */
    @Select("select * from "+ USERTABLE)
    List<User_info> findAll();

    /**
     * 查新用户信息
     * @param user_info 查询的用户条件
     * @return 满足条件的用户信息列表
     */
    @SelectProvider(type = User_infoDynaSqlProvider.class,method = "updateUser")
    @Results({
            @Result(column = "user_id",property = "user_id"),
            @Result(column = "user_name",property = "user_name"),
            @Result(column = "login_password",property = "login_password"),
            @Result(column = "role_id",property = "role_define",one = @One(select = "com.sxy.sipautogeneration.domain.Role_define",fetchType = FetchType.EAGER)),
            @Result(column = "county_id",property = "county_define",one = @One(select = "com.sxy.sipautogeneration.domain.County_define",fetchType = FetchType.EAGER)),
            @Result(column = "if_online",property = "if_online"),
            @Result(column = "is_locked",property = "is_locked"),
            @Result(column = "user_mobile",property = "user_mobile"),
            @Result(column = "user_email",property = "user_email"),
            @Result(column = "filed1",property = "filed1"),
            @Result(column = "filed2",property = "filed2"),
            @Result(column = "filed3",property = "filed3")
    })
    List<User_info> find(User_info user_info);

    /**
     * 保存新用户
     * @param user_info 新用户信息
     */
    @SelectProvider(type = User_infoDynaSqlProvider.class,method = "insertUser")
    void save(User_info user_info);

    /**
     * 删除用户
     * @param user_id 用户id
     */
    @Delete("delete from "+ USERTABLE + "where user_id = #{user_id}")
    void deleteById(Integer user_id);

    /**
     * 更新用户信息
     * @param user_info 用户信息
     */
    @SelectProvider(type = User_infoDynaSqlProvider.class,method = "updateUser")
    void update(User_info user_info);
}
