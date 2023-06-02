package com.sydorenko;

public class SmartphonesMain {

    public static void main(String[] args) {
        iPhones iphones = new iPhones();
        iphones.call();
        iphones.sms();
        iphones.internet();

        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();

    }
}