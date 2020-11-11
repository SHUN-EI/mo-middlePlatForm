package com.mo.middlePlatform.service.impl;

import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import com.mo.middlePlatform.entity.MPProductCategory;
import com.mo.middlePlatform.mapper.ProductCategoryMapper;
import com.mo.middlePlatform.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by mo on 2020/11/10
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public DtoMPProductCategoryInfo create(ProductCategoryCommand command) {

        MPProductCategory productCategory = new MPProductCategory();
        productCategory.setParentId(command.getParentId());
        productCategory.setName(command.getName());
        productCategory.setLevel(command.getLevel());
        productCategory.setDescription(command.getDescription());
        productCategory.setCreateTime(new Date());
        productCategory.setUpdateTime(new Date());
        productCategoryMapper.addProductCategory(productCategory);

        DtoMPProductCategoryInfo dtoMPProductCategoryInfo = new DtoMPProductCategoryInfo(productCategory);

        return dtoMPProductCategoryInfo;
    }

    @Override
    public DtoMPProductCategoryInfo update(ProductCategoryCommand command) {

        MPProductCategory productCategory = productCategoryMapper.queryById(command.getId());
        productCategory.setName(command.getName());
        productCategory.setDescription(command.getDescription());
        productCategory.setLevel(command.getLevel());
        productCategory.setParentId(command.getParentId());
        productCategory.setUpdateTime(new Date());

        productCategoryMapper.updateProductCategory(productCategory);

        DtoMPProductCategoryInfo dtoMPProductCategoryInfo = new DtoMPProductCategoryInfo(productCategory);

        return dtoMPProductCategoryInfo;
    }
}
