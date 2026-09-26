package com.javaLearning.operator;

import java.util.Scanner;

public class operator_demo2 {
    static void main(String[] args) {

        //输入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num = sc.nextInt();

        //拆分
        int ge = num  % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位数为：" + ge);
        System.out.println("十位数为：" + shi);
        System.out.println("百位数为：" + bai);

    }
}
