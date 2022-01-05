package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double loan = 10000;
        double emi = 1000;
        double interest = 1.03;
        int numemi = 0;
        loan *= interest;
        while(loan > 0){
            double payed = 0;
            if (loan >= emi){
                loan -= emi;
                payed = emi;
            } else {
                payed = loan;
                loan = 0;
            }
            numemi += 1;
            System.out.println("Paying " + payed + " of installment " + numemi);

        }
        System.out.println("Number of emis:" + numemi);


    }
}
