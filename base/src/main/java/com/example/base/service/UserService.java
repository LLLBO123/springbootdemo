package com.example.base.service;

import com.example.base.pojo.User;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    User findById(Integer id);

    void deleteByID(Integer id);

    public void update(User user);
}
