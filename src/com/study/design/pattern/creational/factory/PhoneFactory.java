package com.study.design.pattern.creational.factory;

public final class PhoneFactory { // phai la final class -> khong co lop con
    private volatile static PhoneFactory factory;// volatile dong bo giua cac thread
    private PhoneFactory(){}; //private constructor

    static {
        System.out.println("PhoneFactory block run...");
    } //co the thay the ham main

    public static PhoneFactory getInstance() {
        if (factory == null) {
            factory = new PhoneFactory();
        }
        return factory;
    }

    public PhoneSupperClass getPhone(PhoneType type){
        switch (type){
            case BPHONE:
                return new BphoneSubClass("A",1);
            case IPHONE:
                return new IphoneSubClass("B",2);
            default:
                return null;
        }
    }
}
