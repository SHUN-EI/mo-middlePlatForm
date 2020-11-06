package com.mo.middlePlatform.controller;

import com.mo.middlePlatform.command.MemberLoginCommand;
import com.mo.middlePlatform.command.MemberRegisterCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
import com.mo.middlePlatform.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public DtoMPMemberInfo register(@RequestBody MemberRegisterCommand command) {
        return memberAdminService.register(command);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DtoMPMemberInfo login(@RequestBody MemberLoginCommand command) {
        return memberAdminService.login(command);
    }
}
