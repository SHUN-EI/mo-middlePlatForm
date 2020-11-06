package com.mo.middlePlatform.service.impl;

import com.mo.middlePlatform.entity.MPMember;
import com.mo.middlePlatform.mapper.MemberAdminMapper;
import com.mo.middlePlatform.service.MemberAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.provider.MD5;

import java.util.Date;

/**
 * Created by mo on 2020/11/6
 */
@Service
public class MemberAdminServiceImpl implements MemberAdminService {

    @Autowired
    private MemberAdminMapper memberAdminMapper;

    @Override
    public void register(String username, String password, String phone) {

        MPMember mpMember = new MPMember();
        mpMember.setUsername(username);
        mpMember.setPassword(password);
        mpMember.setPhone(phone);
        mpMember.setCreateTime(new Date());
        mpMember.setStatus(1);
        memberAdminMapper.addMember(mpMember);
    }
}
