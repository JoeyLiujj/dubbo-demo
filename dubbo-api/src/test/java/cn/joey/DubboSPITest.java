package cn.joey;

import cn.joey.demo.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

/**
 * @auther liujiji
 * @date 2019/6/3 10:45
 */
public class DubboSPITest {

    public static void main(String[] args) {
        Robot adaptiveExtension = ExtensionLoader.getExtensionLoader(Robot.class).getAdaptiveExtension();
        System.out.println(adaptiveExtension);
        Map map=new HashMap();
        map.put("robot","bumblebee");
        URL url=new URL("dubbo","localhost",9000,map);
        adaptiveExtension.sayHello(url);
//        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
//        optimusPrime.sayHello();
//        Robot bumblebee = extensionLoader.getExtension("bumblebee");
//        bumblebee.sayHello();
    }

}
