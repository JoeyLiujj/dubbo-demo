package cn.joey.demo.impl;

import cn.joey.demo.Robot;
import org.apache.dubbo.common.URL;

/**
 * @auther liujiji
 * @date 2019/6/3 10:49
 */
public class Bumblebee implements Robot {
    @Override
    public void sayHello(URL url) {
        System.out.println(url);
        System.out.println("Hello I am Bumblebee.");
    }
}
