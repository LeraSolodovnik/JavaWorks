package com.company;

//ничего не понимаю тут честно говоря
public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.print();
        c.move();
        System.out.println(c.distToOtherCircle());
        c.changeRadius();
        System.out.println(c.getPerimetr());
        System.out.println(c.getSquare());
        double x1 = 13.2;
        double y1 = 0.6;
        double r1 = 7.5;
        Circle c2 = new Circle (x1, y1, r1);
        }
    }
}
