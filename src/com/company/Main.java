package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        boolean loop = true;
        while(loop){
            System.out.println("Enter Mode");
            System.out.println("1: Triangle Area");
            System.out.println("2: Triangle Perimeter");
            System.out.println("3: Rectangle Area");
            System.out.println("4: Rectangle Perimeter");
            System.out.println("5: Circle Area");
            System.out.println("6: Circle Perimeter");
            System.out.println("7: F to C");
            System.out.println("8: C to F");
            System.out.println("9: inches to cm");
            System.out.println("10: cm to inches");
            System.out.println("11: Quit");

            int mode = myObj.nextInt();  // Read user input
            switch(mode){
                case 1:
                    System.out.println("Enter Base and Height:");
                    System.out.println("Base:");
                    double tbase = myObj.nextDouble();
                    System.out.println("Height:");
                    double theight = myObj.nextDouble();
                    System.out.println("The area is: " + ((tbase*theight)/2));
                    break;
                case 2:
                    System.out.println("Enter the length of each side:");
                    System.out.println("Side 1:");
                    double s1 = myObj.nextDouble();
                    System.out.println("Side 2:");
                    double s2 = myObj.nextDouble();
                    System.out.println("Side 3:");
                    double s3 = myObj.nextDouble();
                    System.out.println("The perimeter is: " + (s1+s2+s3));
                    break;
                case 3:
                    System.out.println("Enter Width and Height:");
                    System.out.println("Width:");
                    double raWidth = myObj.nextDouble();
                    System.out.println("Height:");
                    double raHeight = myObj.nextDouble();
                    System.out.println("The area is: " + raWidth * raHeight);
                    break;
                case 4:
                    System.out.println("Enter Width and Height:");
                    System.out.println("Width:");
                    double rpWidth = myObj.nextDouble();
                    System.out.println("Height:");
                    double rpHeight = myObj.nextDouble();
                    System.out.println("The perimeter is: " + (2.0 * (rpWidth + rpHeight)));
                    break;
                case 5:
                    System.out.println("Enter radius:");
                    double aRadius = myObj.nextDouble();
                    System.out.println("The area is: " + (aRadius * aRadius * Math.PI));
                    break;
                case 6:
                    System.out.println("Enter radius:");
                    double pRadius = myObj.nextDouble();
                    System.out.println("The area is: " + (2.0 * pRadius * Math.PI));
                    break;
                case 7:
                    System.out.println("Enter Degrees Fahrenheit:");
                    double fahr = myObj.nextDouble();
                    System.out.println("The temperature in celsius is: " + (fahr - 32) * (5.0 / 9.0));
                    break;
                case 8:
                    System.out.println("Enter Degrees Celsius:");
                    double cels = myObj.nextDouble();
                    System.out.println("The temperature in fahrenheit is: " + (cels * (9.0 / 5.0)) + 32);
                    break;
                case 9:
                    System.out.println("Enter Inches:");
                    double inch = myObj.nextDouble();
                    System.out.println("In cm: " + inch * 2.54);
                    break;
                case 10:
                    System.out.println("Enter centimeters:");
                    double cm = myObj.nextDouble();
                    System.out.println("In inches: " + cm / 2.54);
                    break;
                case 11:
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }


    }
}
