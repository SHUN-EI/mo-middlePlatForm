drop  table  if exists mp_member;
create  table mp_member(
    id bigint(20) not null auto_increment,
    username varchar(64) default null comment '用户名',
    password varchar(64) default  null comment '密码',
    nickname varchar(64) default null  comment '昵称',
    phone varchar(20) default  null comment '手机号码',
    age int(3)  default  null comment '年龄',
    gender int(1) default null comment '性别:0->未知;1->男;2->女',
    icon varchar(500) default  null comment '头像',
    city varchar(64) default null comment '城市',
    personalized_sign varchar(200) default null comment '个性签名',
    birthday datetime default null comment '生日',
    status int(1) default null comment '账号启用状态:0->禁用;1->启用',
    create_time datetime default  null comment '创建时间',
    update_time datetime default  null comment '修改时间',
    primary key (id)
);