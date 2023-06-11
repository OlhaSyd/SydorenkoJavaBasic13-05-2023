package com.sydorenko;

public class Homework18 {
    public static int getAverage(int array[]) {
        int total = 0;
        for (int j : array) {
            total += j;
        }
        return total / array.length;
    }

    public static boolean checkMatrix(int array[][]) {
        return array.length == array[0].length;

    }
}

