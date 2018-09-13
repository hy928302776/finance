package com.dataManage;



import com.dataManage.entry.User;
import com.dataManage.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getListSecond() {
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
    
    private void status(){}

}
