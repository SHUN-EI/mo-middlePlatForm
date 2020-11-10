package com.mo.middlePlatform.controller;

import com.mo.middlePlatform.command.ProductCategoryCommand;
import com.mo.middlePlatform.dto.DtoMPProductCategoryInfo;
import com.mo.middlePlatform.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mo on 2020/11/10
 */
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public DtoMPProductCategoryInfo create(@RequestBody ProductCategoryCommand command) {
        DtoMPProductCategoryInfo dtoMPProductCategoryInfo = productCategoryService.create(command);
        return dtoMPProductCategoryInfo;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public DtoMPProductCategoryInfo update(@RequestBody ProductCategoryCommand command) {
        DtoMPProductCategoryInfo dtoMPProductCategoryInfo = productCategoryService.update(command);
        return dtoMPProductCategoryInfo;
    }
}
