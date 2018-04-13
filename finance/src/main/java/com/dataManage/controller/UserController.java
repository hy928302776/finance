package com.dataManage.controller;

import com.dataManage.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class UserController {
    @Autowired
    private UserService userService;

    private final Logger log = LoggerFactory.getLogger(UserController.class);
    @RequestMapping("/")
    public String index(){
        log.info("index page");
        return "index";
    }

    @RequestMapping("/findUserByPhone")
    public @ResponseBody String findUserByPhone(String phone){
        return userService.findUserByPhone(phone).getName();
    }

    @RequestMapping("/insert")
    public void insert(String name,String password,String phone){
     userService.insert(name, password, phone);
    }

    @RequestMapping("/insertlist")
    public void insertList(String name,String password,String phone){
        userService.insertList();
    }


}
