package com.sxy.sipautogeneration.dao.provider;

import com.sxy.sipautogeneration.domain.Sip_define;
import org.apache.ibatis.jdbc.SQL;

import static com.sxy.sipautogeneration.util.common.SIPTABLE;

public class Sip_defineDynaSqlProvider {

    public String insertSip(final Sip_define sip_define){
        return new SQL(){
            {
                INSERT_INTO(SIPTABLE);
                    VALUES("user_id","#{user_id}");
                    VALUES("create_date","#{create_date}");
                    VALUES("sip_ip","#{sip_ip}");
                    VALUES("sip_pwd","#{sip_pwd}");
                    VALUES("sip_name","#{sip_name}");
                    VALUES("sip_addr","#{sip_addr}");
                    VALUES("sip_admincode","#{sip_admincode}");
                    VALUES("sip_districtcode","#{sip_districtcode}");
                    VALUES("sip_typecode","#{sip_typecode}");
                    VALUES("sip_devicecode","#{sip_devicecode}");
                    VALUES("sip_accesscode","#{sip_accesscode}");
                    VALUES("sip_networkcode","#{sip_networkcode}");
                    VALUES("sip_serialcode","#{sip_serialcode}");
                    VALUES("sip_code","#{sip_code}");
                if(sip_define.getField1() != null && !sip_define.getField1().equals("")){
                    VALUES("field1","field1");
                }
                if(sip_define.getField2() != null && !sip_define.getField2().equals("")){
                    VALUES("field2","field2");
                }
                if(sip_define.getField3() != null && !sip_define.getField3().equals("")){
                    VALUES("field3","field3");
                }
            }
        }.toString();
    }

    public String updateSip(final Sip_define sip_define){
        return new SQL(){
            {
                UPDATE(SIPTABLE);
                if (sip_define.getUser_info() != null){
                    SET("user_id = #{user_id}");
                }
                if (sip_define.getCreate_date() != null){
                SET("create_date = #{create_date}");
                }
                if (sip_define.getSip_ip() != null && !sip_define.getSip_ip().equals("")){
                    SET("sip_ip = #{sip_ip}");
                }
                if (sip_define.getSip_pwd() != null && !sip_define.getSip_pwd().equals("")){
                    SET("sip_pwd = #{sip_pwd}");
                }
                if (sip_define.getSip_name() != null && !sip_define.getSip_name().equals("")){
                    SET("sip_name = #{sip_name}");
                }
                if (sip_define.getSip_addr() != null && !sip_define.getSip_addr().equals("")){
                    SET("sip_addr = #{sip_addr}");
                }
                if (sip_define.getSip_adminicode() != null && !sip_define.getSip_adminicode().equals("")){
                    SET("sip_admincode = #{sip_admincode}");
                }
                if (sip_define.getSip_districtcode() != null && !sip_define.getSip_districtcode().equals("")){
                    SET("sip_districtcode = #{sip_districtcode}");
                }
                if (sip_define.getSip_industycode() != null && !sip_define.getSip_industycode().equals("")){
                    SET("sip_industycode = #{sip_industycode}");
                }
                if (sip_define.getSip_typecode() != null && !sip_define.getSip_typecode().equals("")){
                    SET("sip_typecode = #{sip_typecode}");
                }
                if (sip_define.getSip_devicecode() != null && !sip_define.getSip_devicecode().equals("")){
                    SET("sip_devicecode = #{sip_devicecode}");
                }
                if (sip_define.getSip_accesscode() != null && !sip_define.getSip_accesscode().equals("")){
                    SET("sip_accesscode = #{sip_accesscode}");
                }
                if (sip_define.getSip_networkcode() != null && !sip_define.getSip_networkcode().equals("")){
                    SET("sip_networkcode = #{sip_networkcode}");
                }
                if (sip_define.getSip_serialcode() != null && !sip_define.getSip_serialcode().equals("")){
                    SET("sip_serialcode = #{sip_serialcode}");
                }
                if (sip_define.getSip_code() != null && !sip_define.getSip_code().equals("")){
                    SET("sip_code = #{sip_code}");
                }
                if (sip_define.getField1() != null && !sip_define.getField1().equals("")){
                    SET("field1 = #{field1}");
                }
                if (sip_define.getField2() != null && !sip_define.getField2().equals("")){
                    SET("field2 = #{field2}");
                }
                if (sip_define.getField3() != null && !sip_define.getField3().equals("")){
                    SET("field3 = #{field3}");
                }
            }
        }.toString();
    }
}
