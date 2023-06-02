package com.sydorenko;

public class UserMain {

    public static void main(String[] args) {


        User[] users = new User[4];

        users[0] = new User("Ivan", "Pupkin", 1, 12, 1975,
                "pupkin@gmail.com", 1239994567, 75, 147, 2700);

        users[1] = new User("Petro", "Kozak", 4, 1, 1987,
                "pupkin@gmail.com", 1239994556, 124, 135, 1680);

        users[2] = new User("Olha", "Sydorenko", 15, 10, 1985,
                "olha@gmail.com", 1233790567, 52, 110, 6000);

        users[3] = new User("Olena", "Teliga", 25, 8, 2000,
                "teliga@gmail.com", 1244790534, 63, 105, 8700);

        users[0].printAccountInfo();

        users[1].printAccountInfo();

        users[1].setPressure(150);
        users[1].setWeight(115);

        users[1].printAccountInfo();

        users[2].printAccountInfo();

        users[3].printAccountInfo();

        users[3].setLastName("Vovk");
        users[3].setSteps(5400);

        users[3].printAccountInfo();

    }
}
