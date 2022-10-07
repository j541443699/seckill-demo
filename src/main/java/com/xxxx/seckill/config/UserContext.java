package com.xxxx.seckill.config;

import com.xxxx.seckill.pojo.User;

/**
 * Date:2022/10/7 9:54
 * Author:jyq
 * Description:
 */
public class UserContext {

    private static ThreadLocal<User> userHolder = new ThreadLocal<>();

    public static void setUser(User user) {
        userHolder.set(user);
    }

    public static User getUser() {
        return userHolder.get();
    }
}
