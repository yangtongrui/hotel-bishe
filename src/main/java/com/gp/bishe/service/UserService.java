package com.gp.bishe.service;



import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    User findUserById(String userId);

    User login(String username);

    User selectByName(String username);

    void insertUser(User user);
}
