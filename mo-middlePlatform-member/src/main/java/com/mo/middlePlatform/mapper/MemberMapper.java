package com.mo.middlePlatform.mapper;

import com.mo.middlePlatform.entity.MPMember;

/**
 * Created by mo on 2020/11/10
 */
public interface MemberMapper {

    int addMember(MPMember mpMember);

    MPMember getMPMemberByUserNameAndPassword(MPMember mpMember);
}
