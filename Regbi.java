package com.sydorenko;

public class Regbi {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int players = 25;
        int minAge = 18;
        int maxAge = 41;
        int totalAgeTeam1 = 0;
        int totalAgeTeam2 = 0;

        System.out.println("Вік гравців команди №1: ");
        // int a(){;}
        for (int i = 0; i < players; i++) {
            int pleyersAge = (int) ((Math.random() * (maxAge - minAge)) + minAge);
            team1[i] = pleyersAge;
            System.out.print(team1[i] + " ");
            totalAgeTeam1 += pleyersAge;
        }
        System.out.println("\nВік гравців команди №2: ");

        for (int j = 0; j < players; j++) {
            int pleyersAge2 = (int) ((Math.random() * (maxAge - minAge)) + minAge);
            team2[j] = pleyersAge2;
            System.out.print(team2[j] + " ");
            totalAgeTeam2 += pleyersAge2;
        }
        int middleAgeTeam1 = totalAgeTeam1 / players;
        int middleAgeTeam2 = totalAgeTeam2 / players;

        System.out.println("\nСередній вік гравців команди №1: " + middleAgeTeam1);
        System.out.println("\nСередній вік гравців команди №2: " + middleAgeTeam2);

    }
}


