package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Выберите объем какой фигуры нужно найти:\n1. Параллелепипед\n2. Шар\n3. Цилиндр");
        switch (console.nextInt()) {
            case 1:
                System.out.println(Paral());
                break;
            case 2:
                System.out.println(Shar());
                break;
            case 3:
                System.out.println(Cilindr());
                break;
        }


    }

    public static double Paral() {

        System.out.println("Введите длину параллелепипеда:");
        double a = console.nextDouble();
        System.out.println("Введите ширину параллелепипеда:");
        double b = console.nextDouble();
        System.out.println("Введите высоту параллелепипеда:");
        double c = console.nextDouble();

        double V = a * b * c;

        return V;
    }

    public static double Shar() {

        System.out.println("Введите радиус шара:");
        double R = console.nextInt();

        double V = (4 * Math.PI * Math.pow(R, 3)) / 3;

        return V;
    }

    public static double Cilindr() {

        System.out.println("Введите радиус цилиндра:");
        double R = console.nextDouble();

        System.out.println("Введите высоту цилиндра:");
        double h = console.nextDouble();

        double V = Math.PI * Math.pow(R, 2) * h;

        return V;
    }


}
