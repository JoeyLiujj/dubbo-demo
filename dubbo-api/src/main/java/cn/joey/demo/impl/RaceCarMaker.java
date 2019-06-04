package cn.joey.demo.impl;

import cn.joey.demo.*;
import cn.joey.demo.entity.Car;
import cn.joey.demo.entity.RaceCar;
import cn.joey.demo.entity.Wheel;
import org.apache.dubbo.common.URL;

/**
 * @auther liujiji
 * @date 2019/6/3 14:53
 */
public class RaceCarMaker implements CarMaker {
    WheelMaker wheelMaker;

    public void setWheelMaker(WheelMaker wheelMaker) {
        this.wheelMaker = wheelMaker;
    }
    @Override
    public Car makeCar(URL url) {
        Wheel wheel = wheelMaker.makeWheel(url);
        return new RaceCar(wheel);
    }
}
