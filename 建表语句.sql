create database sipgeneration;

use sipgeneration;

drop table if exists module_define;

/*==============================================================*/
/* Table: 模块定义表                                            */
/*==============================================================*/
create table module_define
(
   module_id            int(4) not null auto_increment,
   module_name          varchar(10),
   module_parent        int(4),
   module_hierarchy     varchar(512),
   module_level         int(2),
   icon_name            varchar(64),
   module_url           varchar(512),
   field1               varchar(64),
   field2               varchar(64),
   field3               varchar(64),
   primary key (module_id)
);

drop table if exists county_define;

/*==============================================================*/
/* Table: 县市信息表                                            */
/*==============================================================*/
create table county_define
(
   county_id            int(4) not null auto_increment,
   county_name          Varchar(64),
   county_code          int(64),
   county_shortname     Varchar(32),
   field1               Varchar(64),
   field2               Varchar(64),
   field3               Varchar(64),
   primary key (county_id)
);



drop table if exists role_define;

/*==============================================================*/
/* Table: 角色定义表                                            */
/*==============================================================*/
create table role_define
(
   role_id              int(4) not null auto_increment,
   role_name            varchar(20),
   role_description     varchar(256),
   role_priv_level      int(1),
   field1               varchar(64),
   field2               varchar(64),
   field3               varchar(64),
   primary key (role_id)
);


drop table if exists permission_define;

/*==============================================================*/
/* Table: 授权定义表                                            */
/*==============================================================*/
create table permission_define
(
   permission_id        int(4) not null auto_increment,
   role_id              int(4) not null,
   module_id            int(4) not null,
   crud_operation       int(4),
   field1               varchar(64),
   field2               varchar(64),
   field3               varchar(64),
   primary key (permission_id)
);

alter table permission_define add constraint FK_Reference_4 foreign key (role_id)
   references role_define (role_id) on delete restrict on update restrict;

alter table permission_define add constraint FK_Reference_5 foreign key (module_id)
   references module_define (module_id) on delete restrict on update restrict;



drop table if exists user_info;

/*==============================================================*/
/* Table: 系统用户表                                            */
/*==============================================================*/
create table user_info
(
   user_id              int(4) not null auto_increment,
   user_name            varchar(20),
   login_password       varchar(32),
   role_priv_level      int(1),
   role_id              int(4),
   county_id            int(4),
   if_online            int(1),
   is_locked            int(1),
   user_mobile          varchar(11),
   user_email           varchar(64),
   filed1               varchar(64),
   filed2               varchar(64),
   filed3               varchar(64),
   primary key (user_id)
);

alter table user_info add constraint FK_Reference_2 foreign key (county_id)
   references county_define (county_id) on delete restrict on update restrict;

alter table user_info add constraint FK_Reference_3 foreign key (role_id)
   references role_define (role_id) on delete restrict on update restrict;




drop table if exists sip_define;

/*==============================================================*/
/* Table: SIP ID表                                              */
/*==============================================================*/
create table sip_define
(
   sip_id               int(7) not null auto_increment,
   user_id              int(4),
   create_date          timestamp,
   sip_ip               varchar(20),
   sip_pwd              varchar(32),
   sip_name             varchar(32),
   sip_addr             varchar(128),
   sip_admincode        varchar(4),
   sip_districtcode     varchar(2),
   sip_industycode      varchar(3),
   sip_typecode         varchar(1),
   sip_devicecode       varchar(3),
   sip_accesscode       varchar(3),
   sip_networkcode      varchar(1),
   sip_serialcode       varchar(3),
   sip_code             varchar(20),
   field1               varchar(64),
   field2               varchar(64),
   field3               varchar(64),
   primary key (sip_id)
);

alter table sip_define add constraint FK_Reference_1 foreign key (user_id)
   references user_info (user_id) on delete restrict on update restrict;
