package com.company;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }
    public Rectangle(double s){
        width = s;
        height = s;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public boolean setWidth(double width){
        if(width > 0){
            this.width = width;
            return true;
        } else {
            return false;
        }

    }
    public boolean setHeight(double height){
        if(height > 0){
            this.height = height;
            return true;
        } else {
            return false;
        }
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }

}
