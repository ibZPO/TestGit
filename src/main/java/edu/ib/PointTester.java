package edu.ib;

public class PointTester {

    public static void main(String[] args) {

        Point p1= new Point(10,10);
        Point p2= new Point(0,10);

        System.out.println(p1);
        System.out.println(p1.calculateDistance(p2));

        System.out.println("Hello world");
    }
}
