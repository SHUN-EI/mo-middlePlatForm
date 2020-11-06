package com.mo.middlePlatform.command;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by mo on 2020/11/7
 */
public class MemberRegisterCommand {

    private String username;

    private String password;

    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
