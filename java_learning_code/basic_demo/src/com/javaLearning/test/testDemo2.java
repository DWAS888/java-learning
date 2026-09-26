package com.javaLearning.test;

public class testDemo2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,1,2,3,4,5,6,6,7};
        int[] arrLast = new int[arr1.length+arr2.length];
        int index1 = 0;
        int index2 = 0;
        int flag = 0;
        for(int i = 0;i < arrLast.length;i++){
            if(flag == 1){
                arrLast[i] = arr2[index2];
                if(index2 == arr2.length-1)       flag = 2;
                else    index2 ++;
            }
            else if(flag == 2){
                arrLast[i] = arr1[index1++];
                if(index1 == arr1.length-1)       break;
                else    index1 ++;
            }else{
                if(arr1[index1] > arr2[index2]){
                    arrLast[i] = arr2[index2];
                    if(index2 == arr2.length-1)       break;
                    else    index2 ++;
                }else{
                    arrLast[i] = arr1[index1];
                    if(index1 == arr1.length-1)       flag = 1;
                    else    index1 ++;
                }
            }
        }
        for(int i = 0; i < arrLast.length; i++) {
            System.out.print(arrLast[i]+" ");
        }
    }
}
