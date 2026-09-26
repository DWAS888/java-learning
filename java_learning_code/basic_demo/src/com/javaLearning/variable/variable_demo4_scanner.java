package com.javaLearning.variable;

import java.util.Scanner;   //输入scanner后会自动导入Scanner类

public class variable_demo4_scanner {
    static void main(String[] args) {
        //找到Scanner类
        Scanner sc = new Scanner(System.in);

        //调用Scanner类的方法
        //  从键盘台输入一个整数
        /*int num1 = sc.nextInt();
        System.out.println(num1);*/

        //  从键盘台输入一个浮点数
        /*double num2 = sc.nextDouble();
        System.out.println(num2);*/

        //  从键盘台输入一个字符串
        String str = sc.next();
        System.out.println(str);
    }
}
