package com.javaTraining.luogu;

import java.util.Scanner;

public class B4489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        int longest = 0;

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if(a[i] + x == y || a[i] - x == y || a[i] + y == x || a[i] * x == y || a[i] * y == x || a[i] == x * y) {
                count ++;
                if(a[i] > longest)  longest = a[i];
            }
        }
        System.out.println(count+" "+longest);
    }
}

