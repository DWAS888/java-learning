package com.javaLearning.variable;

public class variable_demo3 {
    static void main(String[] args) {
        //  变量的使用
        //  BMI体重 / 身高的平方

        //  体重：65kg
        //  身高：1.63m
        double weight = 65;
        double height = 1.63;
        double bmi = weight / (height * height);
        System.out.println("BMI：" + bmi);
        System.out.println("BMI值的范围：" + (bmi >= 24.7 ? "异常" : "正常"));

        //计算出你当前的身高，在标准BMI下，最多是多少千克
        double maxWeight = 24.7 * height * height;
        System.out.println("你当前的身高，在标准BMI下，最多是：" + maxWeight + "千克");
    }
}
