package com.sydorenko;

public class Burger {

    private String bun = "булочка";
    private String meat = "м'ясо";
    private String cheese = "сир";
    private String greens = "зелень";
    private String mayonnaise = "майонез";

    public Burger(String regularBurger) {

        System.out.println(regularBurger + " склад: " + this.bun + ", " +
                this.meat + ", " + this.cheese + ", " + this.greens + ", "
                + this.mayonnaise);
    }

    public Burger(String dietBurger, String except) {

        System.out.println(dietBurger + " " + except + " склад: " + this.bun + ", " +
                this.meat + ", " + this.cheese + ", " + this.greens);
    }

    public Burger(String doubleMeatBurger, String x, int two) {
        System.out.println(doubleMeatBurger + " склад: " + this.bun + ", " +
                this.meat + " " + x + two + ", " + this.cheese + ", " + this.greens + ", "
                + this.mayonnaise);
    }

}



