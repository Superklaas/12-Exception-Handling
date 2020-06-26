package be.vdab.Ex1205IllegalTriangleException;

import java.text.DecimalFormat;

public class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle()  {
    }

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if((side1+side2)>side3 && (side2+side3)>side1 && (side1+side3)>side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
            throw new IllegalTriangleException("One side cannot be longer than sum two other sides");
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled)  {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        DecimalFormat df = new DecimalFormat("#.##");
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
    }

    public double getPerimeter()    {
        return side1 + side2 + side3;
    }

    public String toString()    {
        return super.toString() + "\nside1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }


}
