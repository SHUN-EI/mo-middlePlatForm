drop table if exists mp_product_category;
create table mp_product_category(
    id bigint(20) not null auto_increment,
    parent_id bigint(20) default null comment '商品上级分类编号:0表示一级分类',
    name varchar(64) default null comment '商品类别名称',
    level int(1) default null comment '商品类别等级,分类级别: 0->1级;1->2级',
    description text default null comment '描述',
    create_time datetime default  null comment '创建时间',
    update_time datetime default  null comment '修改时间',
    primary key(id)
);