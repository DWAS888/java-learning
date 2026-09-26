package com.javaLearning.method;

import java.util.Scanner;

public class methodDemo3 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if(num > 100 || num < 1){
                System.out.println("请重新录入1-100的整数");
                i--;
            }else{
                arr[i] = num;
            }
        }

        double Score = latestScore(5,arr);
        System.out.println(Score);
    }

    public static double latestScore(int l,int[] arr){
        int max = arr[0],min = arr[0];
        int sum = 0;
        for(int i = 0;i < 5; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            sum += arr[i];
        }
        return (double)(sum - max - min) / 3;
    }

}
