package com.sydorenko;

public class User {
    private String name;
    private int dateBrth;
    private int monthBrth;
    private int yearBrth;
    private String email;

    private int telefone;
    private String lastName;
    private int weight;
    private int pressure;
    private int steps;
    private int currentYear = 2020;
    private int age = currentYear;

    public String getName() {
        return name;
    }

    public int getDateBrth() {
        return dateBrth;
    }

    public int getMonthBrth() {
        return monthBrth;
    }

    public int getYearBrth() {
        return yearBrth;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getWeight() {
        return weight;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public User(String name, String lastName, int dateBrth, int monthBrth, int yearBrth, String email, int telefone,
                int weight, int pressure, int steps) {
        this.name = name;
        this.dateBrth = dateBrth;
        this.monthBrth = monthBrth;
        this.yearBrth = yearBrth;
        this.email = email;
        this.telefone = telefone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age -= yearBrth;

    }


    public void printAccountInfo() {
        System.out.println();
        System.out.print("Name: " + getName() + "\n" + "Last name: " + getLastName() +
                "\n" + "Date of berth: " + getDateBrth() + "\n" + "month of berth: " + getMonthBrth() + "\n" +
                "year of berth: " + getYearBrth() + "\n" + "Full yers: " + getAge() + "\n" +
                "email: " + getEmail() + "\n" + "Telefone: " + getTelefone() + "\n" +
                "weight: " + getWeight() + "\n" + "pressure: " + getPressure() + "\n" +
                "steps: " + getSteps());
        System.out.println();
    }
}
