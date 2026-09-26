package com.javaTraining.luogu;

import java.util.Scanner;

public class B4034 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = n / (a + b);
        System.out.println(res);

    }
}