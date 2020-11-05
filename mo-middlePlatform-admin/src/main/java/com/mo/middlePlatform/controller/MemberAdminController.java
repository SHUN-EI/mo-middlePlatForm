package com.mo.middlePlatform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

/**
 * Created by mo on 2020/11/6
 */
@Controller
@RequestMapping("/admin")
public class MemberAdminController {

    @RequestMapping(value = "/register")
    public String register() {
        return "register";
    }
}
