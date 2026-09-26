package com.javaLearning.loop;

public class continue_demo1 {
    public static void main(String[] args) {
        for(int n = 1;n < 101;n++){
            if( n % 10 == 7 || n/10 % 10 == 7||n % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(n);
        }
    }
}