package com.company.polygon;

public class Triangle extends Polygon {
    public Triangle(double base, double height){
        setDim1(base);
        setDim2(height);
    }
    @Override
    public double getArea() {
        return (getDim1() * getDim2())*0.5;
    }
}
