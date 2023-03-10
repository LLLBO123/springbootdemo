package com.lagou.service;

import com.lagou.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<User> queryAll();

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 新增
     * @param user
     */
    void insert(User user);

    /**
     * 通过ID删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 修改
     * @param user
     */
    void update(User user);
}
