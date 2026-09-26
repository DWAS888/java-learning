package com.javaLearning.test;

import java.util.Random;

public class testDemo1 {
    public static void main(String[] args) {
        int M = 2000;
        int N = 5;
        int randomNum;
        if(M < N){
            System.out.println("金额不足，请充值~");
        }else{
            Random r = new Random();
            for (int i = 0; i < N-1; i++) {
                //第i轮，第i+1个人，至少有N-i-1分，边界为M-N+i+1分，取不到，+1
                int myMoney = r.nextInt(M - N + i+1 )+1 ;
                System.out.println("第" + (i+1) + "个人的金额为：" + myMoney+"分");
                M -= myMoney;
            }
            System.out.println("第" + N + "个人的金额为：" + M+"分");
        }
    }
}
