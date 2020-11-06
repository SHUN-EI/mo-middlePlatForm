package com.mo.middlePlatform.service;

import com.mo.middlePlatform.command.MemberLoginCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mo on 2020/11/6
 */
public interface MemberAdminService {

    /**
     * 用户注册
     *
     * @param username
     * @param password
     * @param phone
     */
    @Transactional
    void register(String username, String password, String phone);


    /**
     * 用户登录
     * @param command
     * @return
     */
    DtoMPMemberInfo login(MemberLoginCommand command);
}
