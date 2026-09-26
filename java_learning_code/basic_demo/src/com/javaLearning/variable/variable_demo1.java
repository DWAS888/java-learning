package com.javaLearning.variable;

public class variable_demo1 {
    static void main(String[] args) {
        /*微信余额：80元
        支付宝余额：10元
        银行卡余额：20元
        问题一：请问现在一共有多少钱？
        问题二：微信收了10元红包，又发了2元红包，余额多少?*/

            //问题一：请问现在一共有多少钱？
            double a = 80;   //微信余额
            double b = 10;  //支付宝余额
            double c = 20;  //银行卡余额
            double d = a + b + c; //总余额
            System.out.println(d);

            //问题二：微信收了10元红包，又发了2元红包，余额多少?
            double e = a + 10 - 2;
            System.out.println(e);
    }
}
