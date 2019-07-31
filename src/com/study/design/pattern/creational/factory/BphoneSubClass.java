package com.study.design.pattern.creational.factory;

public class BphoneSubClass extends PhoneSupperClass {

    public BphoneSubClass(String name, Integer price){
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void getInfo() {
        System.out.println(String.format("Bphone | %s %s", this.name, this.price));
    }
}