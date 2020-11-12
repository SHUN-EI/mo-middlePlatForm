package com.mo.middlePlatform.service.impl;

import com.mo.middlePlatform.command.ProductCommand;
import com.mo.middlePlatform.dto.DtoMPProductInfo;
import com.mo.middlePlatform.entity.MPProduct;
import com.mo.middlePlatform.mapper.ProductMapper;
import com.mo.middlePlatform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by mo on 2020/11/11
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public DtoMPProductInfo create(ProductCommand command) {

        MPProduct product = new MPProduct();
        product.setProductCategoryId(command.getProductCategoryId());
        product.setName(command.getName());
        product.setTitle(command.getTitle());
        product.setPrice(command.getPrice());
        product.setVerifyStatus(0);
        product.setStockNums(command.getStockNums());
        product.setPicture(command.getPicture());
        product.setDeleteStatus(0);
        product.setCreateTime(new Date());
        product.setUpdateTime(new Date());

        productMapper.addProduct(product);
        DtoMPProductInfo dtoMPProductInfo = new DtoMPProductInfo(product);

        return dtoMPProductInfo;
    }

    @Override
    public List<DtoMPProductInfo> updateVerifyStatus(ProductCommand command) {
        List<DtoMPProductInfo> dtoMPProductInfos = new ArrayList<>();
        List<Long> ids = command.getIds();
        Map<String, Object> map = new HashMap<>();
        map.put("ids", ids);
        map.put("verifyStatus", command.getVerifyStatus());
        map.put("verifyTime", new Date());
        map.put("updateTime", new Date());

        productMapper.updateProductVerifyStatus(map);

        ids.forEach(id -> {
            MPProduct product = productMapper.queryById(id);
            dtoMPProductInfos.add(new DtoMPProductInfo(product));
        });

        return dtoMPProductInfos;
    }
}
