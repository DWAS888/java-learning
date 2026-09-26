package com.javaLearning.array;

import java.util.Scanner;

public class arrayDemo3 {
    public static void main(String[] args) {
        int[] arr = new int[]{20,58,39,63,28};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("未找到");
        }
    }
}
