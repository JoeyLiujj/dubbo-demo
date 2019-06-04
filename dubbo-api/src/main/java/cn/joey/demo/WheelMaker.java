package cn.joey.demo;


import cn.joey.demo.entity.Wheel;
import org.apache.dubbo.common.URL;

/**
 * @auther liujiji
 * @date 2019/6/3 14:44
 */
public interface WheelMaker {
    Wheel makeWheel(URL url);
}
