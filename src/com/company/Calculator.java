package com.company;

public class Calculator {
    private double num1;
    private double num2;
    public static String brand;

    public void setNum1(double num1){
        if(num1 < 5){
            this.num1 = 5;
            return;
        }
        if(num1 > 20){
            this.num1 = 20;
            return;
        }
        this.num1 = num1;
    }
    public void setNum2(double num2){
        if(num2 < 5){
            this.num2 = 5;
            return;
        }
        if(num2 > 20){
            this.num2 = 20;
            return;
        }
        this.num2 = num2;
    }

    public double getNum1(){
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add(){
        return num1 + num2;
    }
    public double subtract(){
        return num1 - num2;
    }
    public double multiply(){
        return num1 * num2;
    }
    public double divide(){
        return num1 / num2;
    }
}
