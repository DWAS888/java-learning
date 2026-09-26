package com.javaLearning.method;

public class methodDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,7,9,1};
        printArr(arr.length, arr);
    }

    public static void printArr(int n,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
