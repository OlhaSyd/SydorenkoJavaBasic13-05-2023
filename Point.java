package com.sydorenko;

public class Point implements Cloneable {
    private int coordinatesX;
    private int coordinatesY;


    public int getCoordinatesX() {
        return coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public Point(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
    }


    public void showCoordinates() {

        System.out.println("coordinates X = " + coordinatesX + "\ncoordinates Y = " + coordinatesY);

    }

    public void changeCoordinates(int x, int y) {

        setCoordinatesX(x);
        setCoordinatesY(y);

    }

    public void showDistanceBetweenPoint(Point point1, Point point2) {

        int a = (int) (Math.pow(point1.coordinatesY - point1.coordinatesX, 2)
                + Math.pow(point2.coordinatesY - point2.coordinatesX, 2));

        int b = (int) Math.sqrt(a);
        System.out.println("відстань між двома точками = " + b);

    }

    public void showDistanceToPoint(Point point2) {

        int a = (int) (Math.pow(coordinatesY - coordinatesX, 2)
                + Math.pow(point2.coordinatesY - point2.coordinatesX, 2));

        int b = (int) Math.sqrt(a);
        System.out.println("відстань до точки  = " + b);

    }


    @Override
    public String toString() {
        return "X, Y  = " + coordinatesX + ", " + coordinatesY;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || !(obj instanceof Point))
            return false;

        Point point = (Point) obj;

        return this.coordinatesX == point.getCoordinatesX() && this.coordinatesY == point.getCoordinatesY();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
