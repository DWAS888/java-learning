package com.javaLearning.method;


public class methodDemo1 {
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = getSum(10,20);
        System.out.println(sum);
    }
}
