package com.company;

import java.util.Scanner;


public class Main {
    int x, y, d;
    static boolean control = true;

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        while (control) {
            Calculator();
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

    public static void Calculator() {
        System.out.println("Введите число:");

        int x = console.nextInt();
        System.out.println("Введите операцию: \n(+ ,- ,* , /)");

        String d = console.next();
        System.out.println("Введите число:");
        int y = console.nextInt();
        switch (d) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Ошибка");
        }
    }

}


