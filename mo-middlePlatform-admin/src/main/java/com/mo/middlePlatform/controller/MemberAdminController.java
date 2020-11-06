package com.mo.middlePlatform.controller;

import com.mo.middlePlatform.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mo on 2020/11/6
 * 用户注册登陆管理
 */
@Controller
@RequestMapping("/admin")
public class MemberAdminController {

    @Autowired
    private MemberAdminService memberAdminService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public void register(@RequestParam String username,
                         @RequestParam String password,
                         @RequestParam String phone) {
        memberAdminService.register(username, password, phone);
    }
}
