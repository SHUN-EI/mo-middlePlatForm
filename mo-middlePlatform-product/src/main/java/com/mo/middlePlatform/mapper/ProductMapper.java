package com.mo.middlePlatform.mapper;

import com.mo.middlePlatform.entity.MPProduct;
import com.mo.middlePlatform.entity.MPProductCategory;

import java.util.List;
import java.util.Map;

/**
 * Created by mo on 2020/11/11
 */
public interface ProductMapper {

    int addProduct(MPProduct product);

    int updateProductVerifyStatus(Map map);

    MPProduct queryById(Long id);

}
