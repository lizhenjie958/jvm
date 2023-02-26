package com.jie.chapter08;

public class HeapDemo {
    // -Xms10m -Xmx10m    最小和最大的堆内存为10m
    // -XX:PrintGCDetails  打印gca详细信息
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end....");
    }
}
