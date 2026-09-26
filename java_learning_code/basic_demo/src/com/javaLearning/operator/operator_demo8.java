package com.javaLearning.operator;

import java.util.Scanner;

public class operator_demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean result = num >= 1 & num <= 10;
        System.out.println(!result);

    }
}
