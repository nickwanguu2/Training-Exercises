package com.company.polygon;

public class Rectangle extends Polygon {
    public Rectangle(double width, double height){
        setDim1(width);
        setDim2(height);
    }
    @Override
    public double getArea() {
        return getDim1() * getDim2();
    }
}
