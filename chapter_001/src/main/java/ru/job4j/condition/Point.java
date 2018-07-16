package ru.job4j.condition;
/**
 * @author Yuriy Averianov
 * @version 1;
 * @since 16.07.2018
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point that) {
        double result = Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.x - that.y, 2));
        return result;
    }

    public static void main(String[] args){
        Point a = new Point(0,1);
        Point b = new Point(2,5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + b.x);
        System.out.println("x2 = " + b.y);
        System.out.println("x2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}
