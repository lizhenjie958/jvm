package com.jie.chapter05;

public class OperandStackTest {
    public static void main(String[] args) {
        byte i = 15;
        int j = 8;
        int k = i + j;
    }


    public int getSum(){
        int m = 10;
        int n = 20;
        int  k = m + n;
        return k;
    }

    public void testGetSum(){
        int i = getSum();
        int j = 10;
    }
}
