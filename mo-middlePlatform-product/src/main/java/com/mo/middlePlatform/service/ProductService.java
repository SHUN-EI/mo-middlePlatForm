package com.mo.middlePlatform.service;

import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.command.ProductCommand;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import com.mo.middlePlatform.dto.DtoMPProductInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mo on 2020/11/11
 */
public interface ProductService {

    /**
     * 创建商品
     *
     * @param command
     * @return
     */
    @Transactional
    DtoMPProductInfo create(ProductCommand command);

    /**
     * 批量修改商品审核状态
     *
     * @param command
     * @return
     */
    @Transactional
    List<DtoMPProductInfo> updateVerifyStatus(ProductCommand command);

}
