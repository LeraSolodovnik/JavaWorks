package com.company;

public class Car {
    private final String model;
    private double maxSpeed = -1;
    private double weight = -1;

    public Car(String mod) {
        this.model = mod;
    }

    public Car(String s, double mspeed) {
        this.model = s;
        this.maxSpeed = mspeed;
    }

    public Car(String s, double mspeed, double w) {
        this.model = s;
        this.maxSpeed = mspeed;
        this.weight = w;
    }

    public void show() {
        System.out.println("Модель: " + model);
        if (maxSpeed != -1) {
            System.out.println("Максимальная скорость: " + maxSpeed);
        }
        if (weight != -1) {
            System.out.println("Вес: " + weight);
        }
    }
}
