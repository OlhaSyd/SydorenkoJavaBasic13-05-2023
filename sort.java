package com.sydorenko;

/*Задати масив цілих чисел довжини N елементів та заповнити його рандомними числами відсортувати масив та вивести на екран. Поміняти місцями перший та останній елемент, вивести масив на екран ще раз*/
public class sort {
    public static void main(String[] args) {

        int[] array = new int[10];
        // int randomNumber = (int) (Math.random() * 100);

        for (int i = 0; ; i++) {
            int randomNumber = (int) (Math.random() * 100);
            array[i] = randomNumber;


            System.out.println(array[i] + " ");
        }
    }

}
