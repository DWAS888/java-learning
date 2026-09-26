package com.javaLearning.array;

public class arrayDemo8 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15,1,8};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] + nums[j] == target)
                    System.out.println(j+","+i+"  ");
            }
        }
    }
}
