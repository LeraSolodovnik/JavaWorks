package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число:");
        String a = console.nextLine();
        //int b = Integer.parseInt(a);
        //double c = Double.parseDouble(a);
        System.out.println(toInt(a) + toDbl(a));
    }

    public static int toInt (String b) {
        return Integer.parseInt(b);
    }

    public static double toDbl (String c) {
        return Double.parseDouble(c);
    }
}
