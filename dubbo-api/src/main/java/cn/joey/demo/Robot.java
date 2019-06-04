package cn.joey.demo;

import org.apache.dubbo.common.extension.SPI;

/**
 * @auther liujiji
 * @date 2019/6/3 10:48
 */
@SPI
public interface Robot {
    void sayHello();
}
