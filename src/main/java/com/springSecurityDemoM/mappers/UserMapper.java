package com.springSecurityDemoM.mappers;

import com.springSecurityDemoM.dto.UserDto;
import com.springSecurityDemoM.entities.User;
import org.springframework.stereotype.Component;
@Component
public class UserMapper {
    public User toUser(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setLastname(userDto.getLastname());
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPassword());
        return user;
    }
}
