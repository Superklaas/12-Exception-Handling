package be.vdab.Ex1205IllegalTriangleException;

import java.text.DecimalFormat;

public class TestTriangle {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        try {
            Triangle t1 = new Triangle( 1, 1 , 1 );
            System.out.println("Area: " + df.format(t1.getArea()));
            System.out.println("Perimeter: " + df.format(t1.getPerimeter()));
            System.out.println(t1.toString());
        }
        catch (IllegalTriangleException ex) {
            System.out.println("One side cannot be longer than sum two other sides");
        }
    }
}
