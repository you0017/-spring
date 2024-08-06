package com.yc;


import com.yc.springframework.annotation.YcBean;
import com.yc.springframework.annotation.YcComponentScan;
import com.yc.springframework.annotation.YcConfiguration;
import com.yc.springframework.context.YcAnnotationConfigApplicationContext;
import com.yc.springframework.context.YcApplicationContext;
import com.yc.yc.UserBiz;

@YcConfiguration
//@YcComponentScan
//@YcComponentScan(value = {"com.yc.project2","com.yc.project1"})
@YcComponentScan(basePackages = {"com.yc.di","com.yc.project2.yc"})
public class AppConfig {
    @YcBean(value = "a")
    public Apple apple()
    {
        return new Apple();
    }
    @YcBean
    public SnakeApple snakeApple()
    {
        return new SnakeApple();
    }

    public static void main(String[] args) throws Exception {
        YcApplicationContext ac = new YcAnnotationConfigApplicationContext(AppConfig.class);
        Apple bean = (Apple) ac.getBean("a");
        SnakeApple bean1 = (SnakeApple) ac.getBean("snakeApple");
        System.out.println(bean);
        System.out.println(bean1);

        //UserBiz ub = (UserBiz) ac.getBean("userBiz");
        //ub.showAll();
    }
}
