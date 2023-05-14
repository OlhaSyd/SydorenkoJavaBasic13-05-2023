package com.sydorenko;

public class ShuttleNumbers {
    public static void main(String[] args) {
        String badNumber1 = "4";
        String badNumber2 = "9";
        String[] shuttle = new String[100];
        int arrayLenght = 0;
        int shuttleNumber = 0;
        String shuttleNumberStr = "";

        for (int i = 0; ; i++) {

            shuttleNumber++;
            shuttleNumberStr = String.valueOf(shuttleNumber);

            if (shuttleNumberStr.contains(badNumber1) || shuttleNumberStr.contains(badNumber2)) {
                continue;
            } else {
                shuttle[arrayLenght] = shuttleNumberStr;
                System.out.println("Shuttle # " + shuttle[arrayLenght]);
                arrayLenght++;
            }

        }

    }
}
