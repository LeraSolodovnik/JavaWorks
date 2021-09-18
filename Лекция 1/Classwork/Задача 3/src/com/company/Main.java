package com.company;

import java.util.Scanner;
//import java.util.Random;

public class Main {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите начало отрезка:");
        double a = console.nextDouble();
        System.out.println("Введите конец отрезка:");
        double b = console.nextDouble();

        //double a=new Random().nextDouble() + 29;
        //double b=new Random().nextDouble() + 29;

        if (a > b) {
            double t;
            t = a;
            a = b;
            b = t;
        }

        System.out.println("Введите число:");
        double c = console.nextDouble();
        if (c > a && b > c)
            System.out.println("Число " + c + " принадлежит отрезку [ " + a + "; " + b + " ].");
        else
            System.out.println("Число " + c + " не принадлежит отрезку [" + a + "," + b + "].");
    }
}
