package com.javaLearning.operator;

import java.util.Scanner;
public class operator_demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //录入一个四位数
        System.out.println("请输入一个四位数");
        int num = sc.nextInt();

        //判断是否是回文数
        int ge = num / 1000;
        int shi = (num % 1000) / 100;
        int bai = (num % 100) / 10;
        int qian = num % 10;
        if(ge == qian && shi == bai) {
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }
}
/*用栈做👇
import java.util.Stack;

public class Main {
    public static boolean isPalindrome(int n) {
        if (n < 0) return false;     // 负数不是回文数
        if (n < 10) return true;     // 一位数一定是回文数

        Stack<Integer> stack = new Stack<>();
        int temp = n;

        // 1. 把每一位压栈
        while (temp > 0) {
            stack.push(temp % 10);
            temp /= 10;
        }

        // 2. 逆序构造反转数
        int reverse = 0;
        while (!stack.isEmpty()) {
            reverse = reverse * 10 + stack.pop();
        }

        return reverse == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321)); // true
        System.out.println(isPalindrome(12345)); // false
    }
}
*/