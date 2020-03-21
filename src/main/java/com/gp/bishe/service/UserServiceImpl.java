package com.gp.bishe.service;


import com.gp.bishe.dao.UserMapper;
import com.gp.bishe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }


    @Override
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public User login(String username) {
        return userMapper.login(username);
    }

    @Override
    public User selectByName(String username) {
        return userMapper.selectByName(username);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


}
