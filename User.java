package com.sydorenko;

public class User {
    final static int CURRENT_YEAR = 2020;
    final String name;
    final int dateOfBirth;
    final int monthOfBirth;
    final int yearOfBirth;
    final String email;
    final int telefone;
    final int age;
    private String lastName;
    private int weight;
    private int pressure;
    private int steps;
    
    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
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

    public User(String name, String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth,
                String email, int telefone, int weight, int pressure, int steps) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.telefone = telefone;
        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = CURRENT_YEAR - yearOfBirth;

    }

    public void printAccountInfo() {
        System.out.println();
        System.out.print("Name: " + name + "\n" + "Last name: " + lastName +
                "\n" + "Date of birth: " + dateOfBirth + "\n" + "month of birth: " + monthOfBirth + "\n" +
                "year of birth: " + yearOfBirth + "\n" + "Full years: " + age + "\n" +
                "email: " + email + "\n" + "Telefone: " + telefone + "\n" +
                "weight: " + weight + "\n" + "pressure: " + pressure + "\n" +
                "steps: " + steps);
        System.out.println();
    }
}
