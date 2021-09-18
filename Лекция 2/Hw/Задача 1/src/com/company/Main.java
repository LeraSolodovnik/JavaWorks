package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);
    static boolean control = true;
    public static String m;
    public static String i;
    public static double ms = -1;
    public static String w;
    public static double wg = -1;
    public static Car car;


    public static void main(String[] args) {
        while (control) {
            kl();
            control = vvod();
        }


    }

    public static boolean vvod() {
        System.out.println("Продолжить ввод? (y/n)");
        String k = console.next();
        if (k.equals("y")) return true;
        if (k.equals("n")) return false;
        else {
            System.out.println("Ошибка");
            return vvod();
        }
    }

    public static void kl() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите модель машины: ");
        String model = console.nextLine();

        System.out.println("Ввести максимальную скорость? (y/n)");
        m = console.next();
        if ("y".equals(m)) {
            System.out.print("Введите максимальную скорость: ");
            ms = console.nextDouble();
        }

        System.out.println("Ввести вес? (y/n)");
        w = console.next();
        if ("y".equals(w)) {
            System.out.print("Введите вес: ");
            wg = console.nextDouble();
        }

        if ("y".equals(m) && "y".equals(w)) {
            car = new Car(model, ms, wg);
        } else if ("y".equals(m)) {
            car = new Car(model, ms);
        } else {
            car = new Car(model);
        }

        car.show();
    }
}
