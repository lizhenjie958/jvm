package com.jie.chapter02;

import sun.misc.Launcher;

import java.net.URL;
import java.security.Provider;

public class ClassLoaderTest01 {
    public static void main(String[] args) {
        System.out.println("启动类加载器");
        // 启动类加载器可以加载的所有路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

        // 从上面路径中随意选择一个类，来看看他的类加载器是什么: 引导类加载器
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);


        // 扩展类加载器
        System.out.println("扩展类加载器");
        String property = System.getProperty("java.ext.dirs");
        System.out.println(property);
        String[] split = property.split(";");
        for (String s : split) {
            System.out.println(s);
        }

    }
}
