package com.javaLearning.array;

import java.util.Scanner;

public class arrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[8];        //动态初始化
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
