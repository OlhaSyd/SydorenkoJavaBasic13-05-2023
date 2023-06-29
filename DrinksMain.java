package com.sydorenko;

import java.util.Arrays;
import java.util.Scanner;

import static com.sydorenko.Drinks.*;

public class DrinksMain {
    public static void main(String[] args) {

        int countDrinks = 0;
        double price = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select drinks or press 'Enter': " + Arrays.toString(Drinks.DrinksMachine.values()));
            String userDrinksChoice = scanner.nextLine();

            if (userDrinksChoice.isEmpty()) break;

            Drinks.DrinksMachine drinks = Drinks.DrinksMachine.valueOf(userDrinksChoice.toUpperCase());

            price += takeDrinks(drinks);
            countDrinks++;
        }

        System.out.println("Ви замовили " + countDrinks + " напій. Загальна вартість: " + price);

    }


}