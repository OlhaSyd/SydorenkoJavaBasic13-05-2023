package com.sydorenko;

public class UserMain {

    public static void main(String[] args) {

        User user1 = new User("Ivan", "Pupkin", 1, 12, 1975,
                "pupkin@gmail.com", 1239994567, 75, 147, 2700);

        user1.printAccountInfo();

        User user2 = new User("Petro", "Kozak", 4, 1, 1987,
                "pupkin@gmail.com", 1239994556, 124, 135, 1680);

        user2.printAccountInfo();

        user2.setPressure(150);
        user2.setWeight(115);

        user2.printAccountInfo();

        User user3 = new User("Olha", "Sydorenko", 15, 10, 1985,
                "olha@gmail.com", 1233790567, 52, 110, 6000);

        user3.printAccountInfo();


        User user4 = new User("Olena", "Teliga", 25, 8, 2000,
                "teliga@gmail.com", 1244790534, 63, 105, 8700);

        user4.printAccountInfo();

        user4.setLastName("Vovk");
        user4.setSteps(5400);

        user4.printAccountInfo();
    }
}
