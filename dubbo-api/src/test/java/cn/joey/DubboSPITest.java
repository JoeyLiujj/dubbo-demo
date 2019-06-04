package cn.joey;

import cn.joey.demo.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @auther liujiji
 * @date 2019/6/3 10:45
 */
public class DubboSPITest {

    public static void main(String[] args) {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);

        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();

        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }

}
