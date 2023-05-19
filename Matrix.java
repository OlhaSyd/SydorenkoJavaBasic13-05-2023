package com.sydorenko;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення M ");
        int row = scanner.nextInt();
        System.out.print("Введіть значення N ");
        int column = scanner.nextInt();

        int[][] firstArray = new int[row][column];
        int[][] secondArray = new int[column][row];

        showArray(firstArray);
        System.out.println("---------");
        showArray(secondArray);
    }

    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }
}