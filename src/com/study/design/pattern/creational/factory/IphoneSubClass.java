package com.study.design.pattern.creational.factory;

public class IphoneSubClass extends PhoneSupperClass {

    public IphoneSubClass(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void getInfo() {
        System.out.println(String.format("Iphone | %s %s", this.name, this.price));
    }
}
