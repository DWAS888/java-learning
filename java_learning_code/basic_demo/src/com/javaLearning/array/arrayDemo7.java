package com.javaLearning.array;

public class arrayDemo7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,3,3,4,5,6,6};
        int pf;
        int ps = 0;
        for (pf = 1; pf < arr.length; pf++) {
            if(arr[ps] != arr[pf] ){
                ps++;
                arr[ps] = arr[pf];
            }
        }

        for (int i = 0; i <= ps; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
