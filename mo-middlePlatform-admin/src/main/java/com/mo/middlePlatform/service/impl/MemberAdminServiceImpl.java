package com.mo.middlePlatform.service.impl;

import com.mo.middlePlatform.command.MemberLoginCommand;
import com.mo.middlePlatform.command.MemberRegisterCommand;
import com.mo.middlePlatform.dto.DtoMPMemberInfo;
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
    public DtoMPMemberInfo register(MemberRegisterCommand command) {

        MPMember mpMember = new MPMember();
        mpMember.setUsername(command.getUsername());
        mpMember.setPassword(command.getPassword());
        mpMember.setPhone(command.getPhone());
        mpMember.setCreateTime(new Date());
        mpMember.setStatus(1);
        memberAdminMapper.addMember(mpMember);

        DtoMPMemberInfo dtoMPMemberInfo = new DtoMPMemberInfo(mpMember);
        return dtoMPMemberInfo;
    }

    @Override
    public DtoMPMemberInfo login(MemberLoginCommand command) {
        MPMember mpMember = new MPMember();
        mpMember.setUsername(command.getUsername());
        mpMember.setPassword(command.getPassword());

        MPMember member = memberAdminMapper.getMPMemberByUserNameAndPassword(mpMember);

        DtoMPMemberInfo dtoMPMemberInfo = new DtoMPMemberInfo(member);
        return dtoMPMemberInfo;
    }
}
