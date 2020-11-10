package com.mo.middlePlatform.service;

import com.mo.middlePlatform.command.MemberRegisterCommand;
import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mo on 2020/11/10
 */
public interface ProductCategoryService {

    /**
     * 创建商品类别
     *
     * @return
     */
    @Transactional
    DtoMPProductCategoryInfo create(ProductCategoryCommand command);

    @Transactional
    DtoMPProductCategoryInfo update(ProductCategoryCommand command);


}
