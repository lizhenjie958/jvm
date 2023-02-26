package com.jie.chapter05;

public class DynamicLinkingTest {
    public int num = 1;
    public void methodA(){
        System.out.println("methodA().....");
    }
    public void methodB(){
        System.out.println("methodB().......");
        methodA();
        num ++;
    }
}
