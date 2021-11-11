package com.company;

public class Main {

    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();
        Banana b = new Banana();

        System.out.println(a.getName() + ", " + a.getWeight() + ", " + a.isTasty());
        System.out.println(b.getName() + ", " + b.getWeight() + ", " + b.isTasty());
        System.out.println(o.getName() + ", " + o.getWeight() + ", " + o.isTasty());
    }
}