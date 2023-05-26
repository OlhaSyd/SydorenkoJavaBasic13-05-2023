package com.sydorenko;

public class Person {

    public String name;
    public String city;
    public String telefone;

    public Person(String personName, String personCity, String personTelefone) {
        this.name = personName;
        this.city = personCity;
        this.telefone = personTelefone;

    }

    public static void main(String[] args) {
        Person person1 = new Person("Will Smith", "New York", "2936729462846");

        Person person2 = new Person("Jackie Chan", "Shanghai ", "12312412412");

        Person person3 = new Person("Sherlock Holmes ", " London", "37742123513");

        person1.personInfo();
        System.out.println();

        person2.personInfo();
        System.out.println();
        person3.personInfo();
    }


    public void personInfo() {
        System.out.print("Зателефонувати громадянину " + name + " із міста "
                + city + " можна за номером " + telefone);
    }
}