package com.jie.chapterB04.two;

import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 11:08
 */
public class LoopRun {
    public static void main(String args[]) {
        while (true) {
            try {
                //1. 创建自定义类加载器的实例
                MyClassLoader loader = new MyClassLoader("C:\\Users\\35017\\Desktop\\study\\jvm\\target\\classes");
                //2. 加载指定的类
                Class clazz = loader.findClass("com.jie.chapterB04.two.Demo1");
                //3. 创建运行时类的实例
                Object demo = clazz.newInstance();
                //4. 获取运行时类中指定的方法
                Method m = clazz.getMethod("hot");
                //5. 调用指定的方法
                m.invoke(demo);
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("not find");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }

}
