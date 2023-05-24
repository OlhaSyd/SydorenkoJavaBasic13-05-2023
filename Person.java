package com.sydorenko;

public class Person {
    public String name;
    public String city;
    public String telefone;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Will Smith";
        person1.city = "New York";
        person1.telefone = "2936729462846";

        Person person2 = new Person();
        person2.name = " Jackie Chan";
        person2.city = "Shanghai ";
        person2.telefone = "12312412412";

        Person person3 = new Person();
        person3.name = "Sherlock Holmes ";
        person3.city = " London";
        person3.telefone = "37742123513";

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