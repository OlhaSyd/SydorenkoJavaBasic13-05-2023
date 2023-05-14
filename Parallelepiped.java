package com.sydorenko;

public class Parallelepiped {
    public static void main(String[] args) {
        int width = 5;
        int height = 2;
        int length1 = 10;
        int volume = width * height * length1;
        System.out.println("Об'єм паралелепіпеда = " + volume);
        int length = 4 * (width + height + length1);
        System.out.println("Довжина всіх сторін паралелепіпеда = " + length);

    }
}
