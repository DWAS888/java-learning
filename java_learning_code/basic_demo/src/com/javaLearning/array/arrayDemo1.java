package com.javaLearning.array;

public class arrayDemo1 {
    static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};        //静态初始化
        int[] arr2 = {1,2,3,4,5,8,9,6};

        arr1[3] = 100;
        arr2[2] = 2000;

        for(int i = 0; i < 5; i++){
            System.out.print(arr1[i]+" ");
        }

        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}