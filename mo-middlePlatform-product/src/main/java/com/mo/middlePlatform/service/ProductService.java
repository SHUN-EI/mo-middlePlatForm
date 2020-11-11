package com.mo.middlePlatform.service;

import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.command.ProductCommand;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import com.mo.middlePlatform.dto.DtoMPProductInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mo on 2020/11/11
 */
public interface ProductService {

    /**
     * 创建商品
     * @param command
     * @return
     */
    @Transactional
    DtoMPProductInfo create(ProductCommand command);

}
