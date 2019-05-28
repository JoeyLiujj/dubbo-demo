package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService2;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl2 implements DemoService2{
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 2));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 2));
        return demo;
    }
}
