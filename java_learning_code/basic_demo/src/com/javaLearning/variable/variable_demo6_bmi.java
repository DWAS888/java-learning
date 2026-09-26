package com.javaLearning.variable;

import java.util.Scanner;

public class variable_demo6_bmi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //录入身高和体重
        System.out.println("请输入身高（米）");
        double height = sc.nextDouble();
        System.out.println("请输入体重（千克）");
        double weight = sc.nextDouble();

        //计算BMI
        double bmi = weight / (height * height);
        System.out.println("您的BMI值为：" + bmi);

        //判断BMI值
        if (bmi < 18.5) {
            System.out.println("您的体重过轻");
        } else if (bmi < 24) {
            System.out.println("您的体重正常");
        } else if (bmi < 27) {
            System.out.println("您的体重过重");
        } else {
            System.out.println("您的体重肥胖");
        }
    }
}
