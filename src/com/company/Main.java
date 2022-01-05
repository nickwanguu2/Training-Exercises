package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc =  new Calculator();
        calc.setNum1(7);
        calc.setNum2(11);

        Calculator.brand = "Canon";

        Calculator cal2 = new Calculator();
        cal2.setNum1(6);
        cal2.setNum2(30);

        double s1 = calc.add();
        double s2 = cal2.add();
        double d1 = calc.subtract();
        double p2 = cal2.multiply();
        double q2 = cal2.divide();

        System.out.println("Sum given by calculator1 with "+calc.getNum1()+" and "+ calc.getNum2()+": " +s1 + " and the brand is " + Calculator.brand);
        System.out.println("Sum given by calculator2 with "+cal2.getNum1()+" and "+ cal2.getNum2()+": " +s2 + " and the brand is " + Calculator.brand);
        System.out.println("Difference given by calculator1 with "+calc.getNum1()+" and "+ calc.getNum2()+": " +d1 + " and the brand is " + Calculator.brand);
        System.out.println("Product given by calculator2 with "+cal2.getNum1()+" and "+ cal2.getNum2()+": " +p2 + " and the brand is " + Calculator.brand);
        System.out.println("Quotient given by calculator2 with "+cal2.getNum1()+" and "+ cal2.getNum2()+": " +q2 + " and the brand is " + Calculator.brand);
    }
}
