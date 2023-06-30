package com.sydorenko;

public class Drinks {
    final static double TEA_PRICE = 25;
    final static double COFFE_PRICE = 45;
    final static double LEMONADE_PRICE = 60;
    final static double MOHITO_PRICE = 65;
    final static double MINERAL_WATER_PRICE = 10;
    final static double COLA_PRICE = 30;
    public static int countDrinks;
    public static double price;
    private DrinksMachine drinksMachine;

    public DrinksMachine getDrinksMachine() {
        return drinksMachine;
    }

    public void setDrinksMachine(DrinksMachine drinksMachine) {
        this.drinksMachine = drinksMachine;
    }

    public static void choiceTea() {
        System.out.println("Preparing your " + DrinksMachine.TEA.getTitle());
        System.out.println(DrinksMachine.TEA.getTitle() + " completed! Have a nice day");

    }

    public static void choiceCoffee() {

        System.out.println("Preparing your " + DrinksMachine.COFFEE.getTitle());
        System.out.println("Adding milk...");
        System.out.println(DrinksMachine.COFFEE.getTitle() + " completed! Have a nice day");
    }

    public static void choiceLemonade() {

        System.out.println("Preparing your " + DrinksMachine.LEMONADE.getTitle());
        System.out.println(DrinksMachine.LEMONADE.getTitle() + " completed! Have a nice day");
    }

    public static void choiceMohito() {

        System.out.println("Preparing your " + DrinksMachine.MOHITO.getTitle());
        System.out.println(DrinksMachine.MOHITO.getTitle() + " completed! Have a nice day");
    }

    public static void choiceMineralWater() {

        System.out.println("Preparing your " + DrinksMachine.MINERAL_WATER.getTitle());
        System.out.println(DrinksMachine.MINERAL_WATER.getTitle() + " completed! Have a nice day");
    }

    public static void choiceCola() {

        System.out.println("Preparing your " + DrinksMachine.COLA.getTitle());
        System.out.println(DrinksMachine.COLA.getTitle() + " completed! Have a nice day");
    }

    public enum DrinksMachine {
        TEA("Tea"),
        COFFEE("Coffe"),
        LEMONADE("Lemonade"),
        MOHITO("Mohito"),
        MINERAL_WATER("Mineral water"),
        COLA("Cola");

        private String title;

        DrinksMachine(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }

    public static double takeDrinksAndPrice(DrinksMachine drinks) {

        switch (drinks) {
            case TEA:
                choiceTea();
                return TEA_PRICE;

            case COFFEE:
                choiceCoffee();
                return COFFE_PRICE;

            case LEMONADE:
                choiceLemonade();
                return LEMONADE_PRICE;

            case MOHITO:
                choiceMohito();
                return MOHITO_PRICE;

            case MINERAL_WATER:
                choiceMineralWater();
                return MINERAL_WATER_PRICE;

            case COLA:
                choiceCola();
                return COLA_PRICE;
        }

        return 0;
    }

}
