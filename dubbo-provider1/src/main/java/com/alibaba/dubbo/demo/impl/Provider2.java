package com.alibaba.dubbo.demo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider2.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("Provider2服务已经启动...");
        System.in.read();
    }
}
