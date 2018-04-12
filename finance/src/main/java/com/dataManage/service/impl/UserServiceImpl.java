package com.dataManage.service.impl;

import com.dataManage.entry.User;
import com.dataManage.mapper.UserMapper;
import com.dataManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String name, String password, String phone) {
    }

    @Override
    public void insertList() {
        List<User> list = new ArrayList<User>();
        User user1 = new User();
        user1.setName("aaaa3");
        user1.setPassword("aaa3");
        user1.setPhone("aa3");
        User user2 = new User();
        user2.setName("bbb2");
        user2.setPassword("bbb2");
        user2.setPhone("bbbb2");
        list.add(user1);
        list.add(user2);
        userMapper.insertList(list);
    }

    @Override
    public User findUserByPhone(String phone) {
        return null;
    }
}
