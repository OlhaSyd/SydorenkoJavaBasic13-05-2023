package com.sydorenko;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву команди №1: ");
        String team1 = scanner.nextLine();

        System.out.print("Введіть кількість фрагів гравця №1 команди " + team1 + ": ");
        int player1Team1 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №2 команди " + team1 + ": ");
        int player2Team1 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №3 команди " + team1 + ": ");
        int player3Team1 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №4 команди " + team1 + ": ");
        int player4Team1 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №5 команди " + team1 + ": ");
        int player5Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть назву команди №2: ");
        String team2 = scanner.nextLine();
        System.out.print("Введіть кількість фрагів гравця №1 команди " + team2 + ": ");
        int player1Team2 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №2 команди " + team2 + ": ");
        int player2Team2 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №3 команди " + team2 + ": ");
        int player3Team2 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №4 команди " + team2 + ": ");
        int player4Team2 = scanner.nextInt();
        System.out.print("Введіть кількість фрагів гравця №5 команди " + team2 + ": ");
        int player5Team2 = scanner.nextInt();
        
        double totalPlayersOnTeam = 5;

        double team1Score = (player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1) / totalPlayersOnTeam;
        double team2Score = (player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2) / totalPlayersOnTeam;

        if (team1Score > team2Score) {
            System.out.print("Перемогла команда " + team1 + " набрала " + team1Score + " очків");
        } else if (team1Score < team2Score)
            System.out.print("Перемогла команда " + team2 + " набрала " + team2Score + " очків");
        else {
            System.out.print("Нічия");
        }

    }
}