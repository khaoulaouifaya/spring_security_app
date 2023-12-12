package com.springSecurityDemoM.controllers;

import com.springSecurityDemoM.annotation.MyLogger;
import com.springSecurityDemoM.dto.UserDto;
import com.springSecurityDemoM.entities.User;
import com.springSecurityDemoM.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class homeController {

    @Autowired
    private static IUserService userService;

    @GetMapping
    @MyLogger
    public String getIndex(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/process_inscription")
    public static String saveUser(@ModelAttribute("user") UserDto user , Model model){
       userService.saveUser(user);
       model.addAttribute("message" , "user ajouté avec succés ");
        return "index";
    }


}
