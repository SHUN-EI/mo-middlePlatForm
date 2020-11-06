package com.mo.middlePlatform.dto;

import com.mo.middlePlatform.entity.MPMember;

import java.util.Date;

/**
 * Created by mo on 2020/11/7
 */
public class DtoMPMemberInfo {

    private Long id;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private Integer age;

    private Integer gender;

    private String icon;

    private String city;

    private String personalizedSign;

    private Date birthday;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public DtoMPMemberInfo() {
    }

    public DtoMPMemberInfo(MPMember member) {
        this.id = member.getId();
        this.username = member.getUsername();
        this.password = member.getPassword();
        this.nickname = member.getNickname();
        this.phone = member.getPhone();
        this.age = member.getAge();
        this.gender = member.getGender();
        this.icon = member.getIcon();
        this.city = member.getCity();
        this.personalizedSign = member.getPersonalizedSign();
        this.birthday = member.getBirthday();
        this.status = member.getStatus();
        this.createTime = member.getCreateTime();
        this.updateTime = member.getUpdateTime();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPersonalizedSign() {
        return personalizedSign;
    }

    public void setPersonalizedSign(String personalizedSign) {
        this.personalizedSign = personalizedSign;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
