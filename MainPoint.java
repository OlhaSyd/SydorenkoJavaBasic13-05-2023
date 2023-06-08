package com.sydorenko;

public class MainPoint {

    public static void main(String[] args) throws CloneNotSupportedException {

        Point point1 = new Point(55, 44);
        Point point2 = new Point(11, 22);

        point1.showCoordinates();
        point2.showCoordinates();

        point1.changeCoordinates(4, 4);
        point1.showCoordinates();

        point1.distanceToPoint(point2);

        Point.distanceBetweenPoint(point1, point2);

        System.out.println(point2.toString());

        System.out.println(point1.equals(point2));

        point1.equals(point2);

        Point clonePoint = (Point) point1.clone();
        System.out.println(clonePoint.toString());


    }
}
