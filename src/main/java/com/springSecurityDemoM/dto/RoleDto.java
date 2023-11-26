package com.springSecurityDemoM.dto;

import org.springframework.security.core.GrantedAuthority;

public class RoleDto implements GrantedAuthority {
    private Long id;
    private String role;
    @Override
    public String getAuthority() {
        return role;
    }
}
