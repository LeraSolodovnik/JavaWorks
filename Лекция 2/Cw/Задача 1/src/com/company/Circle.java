package com.company;

public class Circle {
    private double x,y,r;
    void print() {
        System.out.println("(x,y)=("+x+","+y+")");
        System.out.println("r="+r);
    }
    void move() {
        System.out.println("Не знаю что нужно");
    }

    double distToOtherCircle(){
        return 95.2;
    }
    void changeRadius(){
        System.out.println("Поменяйте радиус");
    }
    double getPerimetr(){
        return 47.6;
    }
    double getSquare(){
        return 66.0;
    }

}
