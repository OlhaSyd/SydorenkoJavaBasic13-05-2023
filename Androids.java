package com.sydorenko;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Call to android");

    }

    @Override
    public void sms() {
        System.out.println("Sand sms from android!");
    }

    @Override
    public void internet() {
        System.out.println("Internet for androids");
    }
}

