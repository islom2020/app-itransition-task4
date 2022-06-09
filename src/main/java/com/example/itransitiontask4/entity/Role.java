package com.example.itransitiontask4.entity;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {
    private final RoleEnum roleEnum = RoleEnum.USER;

    @Override
    public String getAuthority() {
        return roleEnum.name();
    }
}