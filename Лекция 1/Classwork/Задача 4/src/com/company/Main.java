package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите начало отрезка:");
        double a = console.nextDouble();
        System.out.println("Введите конец отрезка:");
        double b = console.nextDouble();

        if (a > b) {
            double t;
            t = a;
            a = b;
            b = t;
        }
        boolean control = true;

        while (control) {
            otr(a, b);
            control = vvod();
        }
    }

    static boolean vvod() {
        System.out.println("Проверить следующее число? (y/n)");
        String k = console.next();
        if (k.equals("y")) return true;
        if (k.equals("n")) return false;
        else {
            System.out.println("Ошибка");
            return vvod();
        }

    }

    public static void otr(double a, double b) {
        System.out.println("Введите число:");
        double c = console.nextDouble();
        if (c > a && b > c)
            System.out.println("Число " + c + " принадлежит отрезку [ " + a + "; " + b + " ].");
        else
            System.out.println("Число " + c + " не принадлежит отрезку [" + a + "," + b + "].");
    }

}


