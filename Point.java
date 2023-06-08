package com.sydorenko;

public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void showCoordinates() {

        System.out.println("coordinates x = " + x + "\ncoordinates y = " + y);

    }

    public void changeCoordinates(int x, int y) {

        setX(x);
        setY(y);

    }

    public double distanceToPoint(Point point) {

        double distance = Math.sqrt((Math.pow(this.y - this.x, 2)
                + Math.pow(point.y - point.x, 2)));

        System.out.println("відстань від Х до У = " + distance);
        return distance;
    }

    public static double distanceBetweenPoint(Point point1, Point point2) {

        double distance = Math.sqrt((Math.pow(point1.getY() - point1.getX(), 2)
                + Math.pow(point2.getY() - point2.getX(), 2)));

        System.out.println("відстань між Х та У  = " + distance);
        return distance;
    }


    @Override
    public String toString() {
        return "x, y  = " + x + ", " + y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Point)) {
            return false;
        }

        Point point = (Point) obj;

        return this.x == point.getX() && this.y == point.getY();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
