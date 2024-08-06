package com.yc.yc;


import com.yc.springframework.annotation.YcResource;
import com.yc.springframework.annotation.YcService;

@YcService
public class UserBiz {
    @YcResource("userDao")
    private UserDao userDao;

    public void showAll() {
        userDao.showAll();
    }
}
