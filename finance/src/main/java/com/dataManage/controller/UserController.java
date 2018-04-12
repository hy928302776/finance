package com.dataManage.controller;

import com.dataManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public String index(){
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
