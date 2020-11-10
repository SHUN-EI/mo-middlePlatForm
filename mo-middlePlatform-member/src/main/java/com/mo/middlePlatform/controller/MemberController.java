package com.mo.middlePlatform.controller;

import com.mo.middlePlatform.command.MemberLoginCommand;
import com.mo.middlePlatform.command.MemberRegisterCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
import com.mo.middlePlatform.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mo on 2020/11/5
 * 会员注册登录管理
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public DtoMPMemberInfo register(@RequestBody MemberRegisterCommand command) {
        return memberService.register(command);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DtoMPMemberInfo login(@RequestBody MemberLoginCommand command) {
        return memberService.login(command);
    }
}
