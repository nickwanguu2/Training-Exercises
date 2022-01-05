package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers.");
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        int int3 = scan.nextInt();
        if(int1 > int2){
            if(int1 > int3){
                System.out.println(int1 + " is the greatest.");
            } else {
                System.out.println(int3 + " is the greatest.");
            }
        } else {
            if(int2 > int3){
                System.out.println(int2 + " is the greatest.");
            } else {
                System.out.println(int3 + " is the greatest.");
            }
        }
        System.out.println("Enter the max.");
        int max = scan.nextInt();
        int n = 1;
        while (n <= max){
            if (n % 2 == 0){
                System.out.println(n + " is even.");
            } else {
                System.out.println(n + " is odd.");
            }
            n += 1;
        }


    }
}
