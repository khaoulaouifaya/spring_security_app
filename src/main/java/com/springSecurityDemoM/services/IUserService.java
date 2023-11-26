package com.springSecurityDemoM.services;

import com.springSecurityDemoM.dto.RoleDto;
import com.springSecurityDemoM.dto.UserDto;

import java.util.List;

public interface IUserService {
    public void saveUser(UserDto userDTO);
    void saveRole(RoleDto roleDTO);
    List<UserDto>  getAllUsers();
    List<RoleDto> getAllRoles();
    boolean isEmailExist(String email);
    UserDto getById(Long id);
    void remove(Long id);
    void cleanDataBase();
    RoleDto getRoleByName(String role);
    boolean existsByName(String username); // New
    UserDto findByUsername(String username); // New
    List<UserDto> search(String username);
    UserDto findUserByCode(String code);

    void editUser(UserDto userDTO);

    UserDto resetPassword(String code, String newPassword) throws Exception;
}
