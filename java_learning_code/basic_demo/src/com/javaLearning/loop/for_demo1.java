package com.javaLearning.loop;

public class for_demo1 {
    static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();   //换行
        }
    }
}