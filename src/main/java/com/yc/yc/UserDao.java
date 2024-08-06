package com.yc.yc;


import com.yc.springframework.annotation.YcRepository;

@YcRepository
public class UserDao {
    public void showAll() {
        System.out.println("showAll");
    }
}
