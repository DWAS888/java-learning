package com.javaLearning.loop;

import java.util.Scanner;

public class while_demo2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        if(num < 0) num = -num;
        while(num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
