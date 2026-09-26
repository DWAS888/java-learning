package com.javaLearning.ifyuju;

import java.util.Scanner;

public class if_demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个充值金额");
        int money = sc.nextInt();
        int balance = 0;

        if(money >= 50000)  balance = money + 15000;
        else if(money >= 20000) balance = money + 6000;
        else if(money >= 10000) balance = money + 2500;
        else if(money >= 5000) balance = money + 1300;
        else if(money >= 3000) balance = money + 500;
        else if(money >= 2000) balance = money + 500;
        else if(money >= 1000) balance = money + 200;
        else balance = money;

        System.out.println("余额为：" + balance);

    }
}
