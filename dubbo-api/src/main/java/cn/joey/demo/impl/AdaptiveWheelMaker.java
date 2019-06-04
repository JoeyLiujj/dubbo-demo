package cn.joey.demo.impl;

import cn.joey.demo.entity.Wheel;
import cn.joey.demo.WheelMaker;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;


/**
 * @auther liujiji
 * @date 2019/6/3 14:45
 */
public class AdaptiveWheelMaker implements WheelMaker {
    @Override
    public Wheel makeWheel(URL url) {
        if (url == null) {
            throw new IllegalArgumentException("url == null");
        }

        String wheelMakerName = url.getParameter("Wheel.maker");

        if (wheelMakerName == null) {
            throw new IllegalArgumentException("wheelMakerName == null");
        }

        WheelMaker wheelMaker = ExtensionLoader.getExtensionLoader(WheelMaker.class).getExtension(wheelMakerName);
        return wheelMaker.makeWheel(url);
    }
}
