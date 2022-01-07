package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter elements.");
        arr[0] = scan.nextInt();
        sum += arr[0];
        int max = arr[0], min = arr[0];
        for(int i = 1; i < n; i++){
            int val = scan.nextInt();
            arr[i] = val;
            sum = val + sum;
            if (val > max){
                max = val;
            } else if (val < min){
                min = val;
            }
        }
        System.out.print("These are the elements:");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println(".");
        System.out.println("The sum is: " + sum);
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
}
