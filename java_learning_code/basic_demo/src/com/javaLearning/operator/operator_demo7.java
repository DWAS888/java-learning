package com.javaLearning.operator;

import java.util.Scanner;
public class operator_demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //录入两个身高
        System.out.println("请输入我的身高");
        double height1 = sc.nextDouble();
        System.out.println("请输入你的好友身高");
        double height2 = sc.nextDouble();

        //判断哪个身高更高
        boolean result = height1 > height2;
        System.out.println("我更高吗？" + result);
    }
}
