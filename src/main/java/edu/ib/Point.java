package edu.ib;

public class Point {

    private double x;
    private double y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
