package com.javaLearning.operator;

import java.util.Scanner;

public class operator_demo6 {
    public static void main(String[] args) {
        //录入一个三位数
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        //拆分
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        //判断是否能被3整除
        int sum = hundreds + tens + ones;
        /*if(sum % 3 == 0){
            System.out.println("该数字能被3整除");
        }else{
            System.out.println("该数字不能被3整除");
        }*/

        boolean result = sum % 3 == 0;
        System.out.println(result);

    }
}
