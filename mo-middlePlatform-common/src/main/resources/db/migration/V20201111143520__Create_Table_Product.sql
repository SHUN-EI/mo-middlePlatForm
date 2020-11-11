drop table if exists mp_product;
create table  mp_product(
    id bigint(20) not null auto_increment,
    product_category_id bigint(20) default null comment '商品类目编号',
    name varchar(64) default null comment '商品名称',
    title varchar(200) default null  comment '商品标题',
    price decimal(10,2) default null  comment '商品价格',
    verify_time datetime default  null comment '审核时间',
    verify_status int(1) default  null comment '审核状态：0->未审核；1->审核通过',
    stock_nums  int(11)  default  null comment '库存数量',
    sale_nums   int(11)  default  null comment '销售数量',
    picture varchar(255) default  null comment '商品图片',
    delete_status int(1) default  null comment '删除状态：0->未删除；1->已删除',
    create_time datetime default  null comment '创建时间',
    update_time datetime default  null comment '修改时间',
    primary key(id)
);

drop table if exists mp_product_detail;
create table mp_product_detail(
    id bigint(20) not null auto_increment,
    product_id bigint(20) not null comment '商品编号',
    product_name varchar(64) default null comment '商品名称',
    brand_id bigint(20) default  null  comment '商品品牌编号',
    brand_name varchar(64) default null comment '商品品牌名称',
    weight decimal(10,2) default  null  comment '商品重量',
    unit   varchar(16) default  null  comment '商品单位',
    picture varchar(255) default  null comment '商品详情图片',
    create_time datetime default  null comment '创建时间',
    update_time datetime default  null comment '修改时间',
    primary key(id)
);