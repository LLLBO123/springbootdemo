package com.lagou;

import com.lagou.bean.User;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("拉勾-元敬");
        System.out.println(user);
    }
}
