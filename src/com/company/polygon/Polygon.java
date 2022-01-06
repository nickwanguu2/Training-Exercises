package com.company.polygon;

public abstract class Polygon {
    private double dim1;
    private double dim2;
    public double getDim1() {
        return dim1;
    }

    public void setDim1(double dim1) {
        this.dim1 = dim1;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double dim2) {
        this.dim2 = dim2;
    }
    public abstract double getArea();
}
