package com.dataManage.service;

import com.dataManage.entry.User;

public interface UserService {
    public User findUserByPhone(String phone);

    public void insert(String name, String password, String phone);

    void insertList();
}
