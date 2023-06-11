package com.sydorenko;

public class Homework18Test {
    public void average() {

        int[] array = {1, 2, 3, 4, 5};
        int expected = 3;
        int result = Homework18.getAverage(array);

        System.out.println(result == expected);
    }

    public void checkMatrix() {

        int[][] matrix = new int[5][3];
        System.out.println(Homework18.checkMatrix(matrix));

    }
}
