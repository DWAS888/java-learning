package com.javaLearning.array;

import java.util.Random;

public class arrayDemo6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; ) {
            boolean duplicated = false;
            arr[i] = random.nextInt(0,100 );
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    duplicated = true;
                    break;
                }
            }
            if(duplicated == false){
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
