package com.company;

import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите коэффициент a:");
        double a = console.nextDouble();
        System.out.println("Введите коэффициент b:");
        double b = console.nextDouble();
        System.out.println("Введите коэффициент c:");
        double c = console.nextDouble();

        Roots r = getRoots(a, b, c);

        double v = r.discriminant2();
        if (v == 0) {
            System.out.println("Нет действительных корней.");

        } else if (v == 1) {
            System.out.println("Ответ: x = " + r.getX1());

        } else if (v == 2) {
            System.out.println("Ответ: x1 = " + r.getX1() + "; x2 = " + r.getX2());
        }
    }

    public static Roots getRoots(double a, double b, double c) {
        Roots r = new Roots();
        double D = Math.pow(b, 2) - 4 * a * c;
        if (D < 0) r.discriminant1(0);
        else if (D == 0) {
            r.setX1(-b / 2 * a);
            r.setX2(-b / 2 * a);
            r.discriminant1(1);
        } else if (D > 0) {
            r.setX1((-b + Math.sqrt(D)) / 2 * a);
            r.setX2(((-b - Math.sqrt(D)) / 2 * a));
            r.discriminant1(2);
        }
        return r;
    }

}
