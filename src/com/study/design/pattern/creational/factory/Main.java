package com.study.design.pattern.creational.factory;

public class Main {
    public static void main(String[] args) {
        PhoneSupperClass iphone = PhoneFactory.getInstance().getPhone(PhoneType.IPHONE);
        iphone.getInfo();
        PhoneSupperClass bphone = PhoneFactory.getInstance().getPhone(PhoneType.BPHONE);
        bphone.getInfo();
    }
}
