package com.sydorenko;

public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Звичайний бургер, склад: " + bun + ", " +
                meat + ", " + cheese + ", " + greens + ", "
                + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {

        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Бургер без майонезу, склад: " + bun + ", " +
                meat + ", " + cheese + ", " + greens);
    }


    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String mayonnaise) {

        this.bun = bun;
        this.meat = meat1;
        this.meat = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Бургер з подвійним м'ясом, склад: " + bun + ", " +
                meat1 + ", " + meat2 + ", " + cheese + ", " + greens + ", "
                + mayonnaise);
    }

}



