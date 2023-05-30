package com.sydorenko;

public class BurgerMain {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("булочка", "мясо", "сир", "зелень", "майонез");

        Burger dietBurger = new Burger("булочка", "мясо", "сир", "зелень");

        Burger doubleMeatBurger = new Burger("булочка", "мясо", "мясо", "сир", "зелень", "майонез");


    }

}
