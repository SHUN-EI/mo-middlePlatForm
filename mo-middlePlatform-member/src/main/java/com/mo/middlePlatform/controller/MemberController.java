package com.mo.middlePlatform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mo on 2020/11/5
 */
@RestController
public class MemberController {

    @RequestMapping(value = "/hello")
    public String hello(String name) {
        return "欢迎来到middle platform " + name;
    }
}
