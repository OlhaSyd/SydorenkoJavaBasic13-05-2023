package com.sydorenko;

public class BurgerMain {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("Звичайний бургер");
        Burger dietBurger = new Burger("Дієтичний бургер", "(без майонезу)");
        Burger doubleMeatBurger = new Burger("Бургер з подвійним м'ясом", "x", 2);

    }

}
