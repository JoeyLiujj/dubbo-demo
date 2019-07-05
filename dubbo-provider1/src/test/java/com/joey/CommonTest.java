package com.joey;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @auther liujiji
 * @date 2019/6/24 9:15
 */
public class CommonTest {
    public static void main(String[] args) {
        Protocol adaptiveExtension = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();

        Protocol dubbo = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("registry");
        System.out.println(dubbo);

        System.out.println(adaptiveExtension);
    }
}
