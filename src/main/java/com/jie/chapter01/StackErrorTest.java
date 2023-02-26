package com.jie.chapter01;

/**
 * 测试 StackOverFlowError
 * 不做任何配置本机溢出段为count=10045
 * 1.   -Xss256k  设置栈的最大大小为256k     出现异常段为count=2313
 */
public class StackErrorTest {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
