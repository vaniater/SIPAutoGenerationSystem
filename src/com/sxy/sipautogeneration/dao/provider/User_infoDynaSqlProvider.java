package com.sxy.sipautogeneration.dao.provider;

import com.sxy.sipautogeneration.domain.User_info;
import org.apache.ibatis.jdbc.SQL;

import static com.sxy.sipautogeneration.util.common.USERTABLE;

public class User_infoDynaSqlProvider {

    //动态插入
    public String insertUser(final User_info user_info){
        return new SQL(){
            {
                INSERT_INTO(USERTABLE);
                //user_id 自增，不用赋值
                VALUES("user_name","#{user_name}");
                VALUES("login_password","#{login_password}");
                VALUES("role_priv_level","#{role_priv_level}");
                VALUES("role_id","#{role_id}");
                VALUES("county_id","#{county_id}");
                VALUES("if_online","#{if_online}");
                VALUES("is_locked","#{is_locked}");
                VALUES("user_mobile","#{user_mobile}");
                VALUES("user_email","#{user_email}");
                if (user_info.getField1() != null && !user_info.getField1().equals("")){
                    VALUES("field1","#{field1}");
                }
                if (user_info.getField2() != null && !user_info.getField2().equals("")){
                    VALUES("field2","#{field2}");
                }
                if (user_info.getField3() != null && !user_info.getField3().equals("")){
                    VALUES("field3","#{field3}");
                }

            }
        }.toString();
    }

    //动态更新
    public String updateUser(final User_info user_info){
        return new SQL(){
            {
                UPDATE(USERTABLE);
                if (user_info.getUser_name() != null && !user_info.getUser_name().equals("")){
                    SET("user_name = #{user_name}");
                }
                if (user_info.getLogin_password() != null && !user_info.getLogin_password().equals("")){
                    SET("login_password = #{login_password}");
                }
                if (user_info.getRole_define() != null){
                    SET("role_id = #{role_id}");
                }
                if (user_info.getCounty_define() != null){
                    SET("county_id = #{county_id}");
                }
                if (user_info.getIf_online() != null){
                    SET("if_online = #{if_online}");
                }
                if (user_info.getIs_locked() != null){
                    SET("is_locked = #{is_locked}");
                }
                if (user_info.getUser_mobile() != null && !user_info.getUser_mobile().equals("")){
                    SET("user_mobile = #{user_mobile}");
                }
                if (user_info.getUser_email() != null && !user_info.getUser_email().equals("")){
                    SET("user_email = #{user_email}");
                }
                if (user_info.getField1() != null && !user_info.getField1().equals("")){
                    SET("field1 = #{field1}");
                }
                if (user_info.getField2() != null && !user_info.getField2().equals("")){
                    SET("field2 = #{field2}");
                }
                if(user_info.getField3() != null && !user_info.getField3().equals("")){
                    SET("field3 = #{field3}");
                }

            }
        }.toString();
    }


    //动态查询
    public String findUser(final User_info user_info){
        return new SQL(){
            {
                SELECT("*");
                FROM(USERTABLE);
                if (user_info.getUser_id() !=null){
                    WHERE("user_id = #{user_id}");
                }
                if (user_info.getUser_name() != null && !user_info.getUser_name().equals("")){
                    WHERE("user_name = #{user_name}");
                }
                if (user_info.getLogin_password() != null && !user_info.getLogin_password().equals("")){
                    WHERE("login_password = #{login_password}");
                }
                if (user_info.getRole_define() != null && user_info.getRole_define().getRoel_id() != null && user_info.getRole_define().getRoel_id() != 0){
                    WHERE("role_id = #{role_id}");
                }
                if (user_info.getCounty_define() != null && user_info.getCounty_define().getCounty_id() != null && user_info.getCounty_define().getCounty_id() != 0){
                    WHERE("county_id = #{county_id}");
                }
                if (user_info.getIf_online() != null){
                    WHERE("if_online = #{if_online}");
                }
                if (user_info.getIs_locked() != null){
                    WHERE("is_locked = #{is_locked}");
                }
                if (user_info.getUser_mobile() != null && !user_info.getUser_mobile().equals("")){
                    WHERE("user_mobile = #{user_mobile}");
                }
                if (user_info.getUser_email() != null && !user_info.getUser_email().equals("")){
                    WHERE("user_email = #{user_email}");
                }
                if (user_info.getField1() != null && !user_info.getField1().equals("")){
                    WHERE("field1 like concat  ('%',#{field1},'%')");
                }
                if (user_info.getField2() != null && !user_info.getField2().equals("")){
                    WHERE("field1 like concat  ('%',#{field1},'%')");
                }
                if(user_info.getField3() != null && !user_info.getField3().equals("")){
                    WHERE("field1 like concat  ('%',#{field1},'%')");
                }
            }
        }.toString();
    }

}
