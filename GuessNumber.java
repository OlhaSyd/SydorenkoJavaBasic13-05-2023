package com.sydorenko;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int maxNumber = 10000;
        int randomNumber = (int) (Math.random() * maxNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Пограємо у гру? :) Введіть число від 0 до 10 000: ");

        for (int i = 0; i < 9000; i++) {

            int userNumber = scanner.nextInt();
            if (userNumber == randomNumber) {
                System.out.print("Вірно! ");
                break;
            } else {
                System.out.print("Спробуй ще раз! ");

            }
        }
    }
}