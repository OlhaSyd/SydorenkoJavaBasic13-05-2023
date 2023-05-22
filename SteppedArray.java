package com.sydorenko;

import java.util.Scanner;

public class SteppedArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків ");
        int row = scanner.nextInt();
        System.out.print("Введіть максимальну кількість елементів ");
        int max = scanner.nextInt();

        int[][] firstArray = new int[row][];

        for (int i = 0; i < row; i++) {
            int column = (int) (Math.random() * (max + 1));
            firstArray[i] = new int[column];
        }
        showArray1(firstArray, max);
        numbersSortUp(firstArray);
        System.out.print("Сортуваня \n");
        numbersSortDown(firstArray);
        showArray(firstArray);
        arraySum(firstArray);
        // showMinElement(firstArray);
        showAbsoluteMin(showMinElement(firstArray));
    }

    public static void showArray1(int[][] array, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = (int) (Math.random() * 100);
                array[i][j] = randomNumber;
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void numbersSortUp(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int k = 0; k < array[i].length - 1; k++) {
                    for (int j = 0; j < array[i].length - k - 1; j++) {
                        int tmp;
                        if (array[i][j] > array[i][j + 1]) {
                            tmp = array[i][j];
                            array[i][j] = array[i][j + 1];
                            array[i][j + 1] = tmp;
                        }
                    }
                }
            }

        }
    }

    public static void numbersSortDown(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                for (int k = 0; k < array[i].length; k++) {
                    for (int j = 0; j < array[i].length - 1; j++) {
                        int tmp;
                        if (array[i][j] < array[i][j + 1]) {
                            tmp = array[i][j];
                            array[i][j] = array[i][j + 1];
                            array[i][j + 1] = tmp;
                        }
                    }
                }
            }

        }
    }

    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(" " + array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void arraySum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.print("Сумма всіх елементів: " + sum + "\n");

    }

    public static int[] showMinElement(int[][] array) {
        int[] minElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length - 1; j++) {
                if (i % 2 == 0) {
                    minElements[i] = array[i][0];
                } else {
                    minElements[i] = array[i][array[i].length - 1];
                }
            }
            // System.out.print("Min elements ");
            System.out.print(minElements[i] + " ,");
        }
        return minElements;
    }

    public static void showAbsoluteMin(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                int tmp;
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }

        }
        System.out.print("absolute min " + array[0]);
    }
}









