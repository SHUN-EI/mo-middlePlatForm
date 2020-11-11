package com.mo.middlePlatform.controller;

import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.command.ProductCommand;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import com.mo.middlePlatform.dto.DtoMPProductInfo;
import com.mo.middlePlatform.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mo on 2020/11/11
 * 商品管理
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public DtoMPProductInfo create(@RequestBody ProductCommand command) {
        DtoMPProductInfo dtoMPProductInfo = productService.create(command);
        return dtoMPProductInfo;
    }

}
