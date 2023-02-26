package com.jie.chapter02;

public class ClinitTest {
    private static int num = 1;
    static {
        num = 2;
        number = 20;
        // 报错，非法的前向引用
//        System.out.println(number);
    }

    // linking之prepare: number = 0 ----> initial:20  --> 10
    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(number);     // 10
    }
}
