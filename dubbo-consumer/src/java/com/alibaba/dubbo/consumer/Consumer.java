package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import com.alibaba.dubbo.demo.DemoService2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(1L));

        DemoService2 demoService2 = context.getBean(DemoService2.class);
        System.out.println("consumer2");
        System.out.println(demoService2.getPermissions(1L));

    }
}
