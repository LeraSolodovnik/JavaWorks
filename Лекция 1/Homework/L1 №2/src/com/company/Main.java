package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);

    static String[] Name = {"Лера", "Иван", "Дима", "Вика", "Костя"};

    public static void main(String[] args) {

        System.out.println("Введите имя:");
        String s = console.nextLine();

        int control = 0;

        for (int i = 0; i < Name.length; i++) {
            if (Name[i].equals(s)) {
                System.out.println("Искомое имя есть в массиве.");
                control++;
                break;
            }
        }
        if (control == 0)
            System.out.println("Искомого имени нет в массиве.");
    }
}
