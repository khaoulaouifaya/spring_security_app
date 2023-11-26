package com.springSecurityDemoM.services;


import com.springSecurityDemoM.dto.RoleDto;
import com.springSecurityDemoM.dto.UserDto;
import com.springSecurityDemoM.entities.Role;
import com.springSecurityDemoM.entities.User;
import com.springSecurityDemoM.mappers.UserMapper;
import com.springSecurityDemoM.repositories.RoleDao;
import com.springSecurityDemoM.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class userServiceImplement implements IUserService , UserDetailsService {

    @Autowired
    private UserDao dao;

    private UserMapper mapper;

    @Autowired
    private RoleDao roleDao;


    @Transactional
    @Override
    public void saveUser(UserDto userDTO) {
        User user = mapper.toUser(userDTO);

        //Set Role
        Role role = roleDao.findByRole("user");
        List<Role> roles = new ArrayList<>();
        roles.add(role);
        user.setRoles(roles);
        //Save user
        dao.save(user);
    }

    @Override
    public void saveRole(RoleDto roleDTO) {

    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return null;
    }

    @Override
    public boolean isEmailExist(String email) {
        return false;
    }

    @Override
    public UserDto getById(Long id) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void cleanDataBase() {

    }

    @Override
    public RoleDto getRoleByName(String role) {
        return null;
    }

    @Override
    public boolean existsByName(String username) {
        return false;
    }

    @Override
    public UserDto findByUsername(String username) {
        return null;
    }

    @Override
    public List<UserDto> search(String username) {
        return null;
    }

    @Override
    public UserDto findUserByCode(String code) {
        return null;
    }

    @Override
    public void editUser(UserDto userDTO) {

    }

    @Override
    public UserDto resetPassword(String code, String newPassword) throws Exception {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
