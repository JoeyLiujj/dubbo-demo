package cn.joey.demo;

import cn.joey.demo.entity.Car;
import org.apache.dubbo.common.URL;

/**
 * @auther liujiji
 * @date 2019/6/3 14:51
 */
public interface CarMaker {
    Car makeCar(URL url);
}
