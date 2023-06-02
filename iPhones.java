package com.sydorenko;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Call to iphones");
    }

    @Override
    public void sms() {
        System.out.println("Sand sms from iphones");
    }

    @Override
    public void internet() {
        System.out.println("Internet for iphones");
    }

}

