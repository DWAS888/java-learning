package com.javaLearning.array;

public class arrayDemo4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,3,5,1,9,6,7,4};
        int max = arr[0];
        //细节：不能初始化为0（全是负数时就会输出0）
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
