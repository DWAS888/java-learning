package com.javaLearning.variable;

import java.util.Scanner;

public class variable_demo5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //录入两个整数
        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();

        //计算两个整数的和
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
