package com.javaLearning.operator;

import java.util.Scanner;

public class operator_demo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //输入秒数
        System.out.println("请输入秒数");
        int seconds = sc.nextInt();

        //转换为时分秒
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds1 = seconds % 60;

        System.out.println("转换为时分秒为：" + hours + "时" + minutes + "分" + seconds1 + "秒");
    }
}
