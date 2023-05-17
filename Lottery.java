package com.sydorenko;

public class Lottery {
    public static void main(String[] args) {

        int arraySize = 7;
        int[] hiddenNumbers = generateNumbers(arraySize);
        int[] userNumbers = generateNumbers(arraySize);

        numbersSort(hiddenNumbers);
        numbersSort(userNumbers);

        int matches = 0;
        for (int i = 0; i < arraySize; i++) {
            if (hiddenNumbers[i] == userNumbers[i]) {
                matches++;
            }
        }
        showNumbers(hiddenNumbers);
        showNumbers(userNumbers);
        System.out.println();
        System.out.println("Кількість збігів " + matches);
    }

    private static void showNumbers(int[] num) {
        for (int arraySize : num) {
            System.out.print(arraySize + ",");
        }
        System.out.println();
    }

    public static int[] generateNumbers(int length) {
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random() * 10);
            numbers[i] = randomNumber;
        }
        return numbers;
    }

    public static void numbersSort(int[] array) {
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
    }
}


