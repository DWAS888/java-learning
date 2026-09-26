package com.javaLearning.operator;

public class operator_demo4 {
    static void main(String[] args) {

        //练习一：
        byte b = 100;
        short s = 200;
        double d = 20.3;

        //请说出下面代码在计算的时候，类型转换的情况
        double result1 = (double)b + (double)s + d;
        System.out.println(result1);// 320.3I
    }
}
