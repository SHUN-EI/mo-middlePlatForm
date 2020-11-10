package com.mo.middlePlatform.service;

import com.mo.middlePlatform.command.MemberLoginCommand;
import com.mo.middlePlatform.command.MemberRegisterCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mo on 2020/11/10
 */
public interface MemberService {

    /**
     * 用户注册
     *
     * @param command
     */
    @Transactional
    DtoMPMemberInfo register(MemberRegisterCommand command);


    /**
     * 用户登录
     *
     * @param command
     * @return
     */
    DtoMPMemberInfo login(MemberLoginCommand command);
}
