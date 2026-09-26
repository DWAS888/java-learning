package com.javaLearning.loop;

import java.util.Scanner;

public class infinite_demo1 {
    public static void main(String[] args) {
        int num;
        while(true){
            num = new Scanner(System.in).nextInt();
            if(num <2){
                System.out.println("输入的数字大于等于2");
                num = new Scanner(System.in).nextInt();
            }else{
                break;
            }
        }
        int count = 0;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(num + "是素数");
        }else{
            System.out.println(num + "不是素数");
        }
    }
}
