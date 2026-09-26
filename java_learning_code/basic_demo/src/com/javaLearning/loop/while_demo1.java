package com.javaLearning.loop;

public class while_demo1 {
    static void main(String[] args) {
        double num = 100000;
        int year = 0;
        while(num < 200000){
            num = num * 1.017;
            year++;
        }
        System.out.println(num);
        System.out.println(year);
    }
}
