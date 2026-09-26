package com.javaLearning.chooce;

public class switch_demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        char operator = '-';

        int result = switch (operator) {
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            default -> 0;
        };
        System.out.println(result);
    }
}