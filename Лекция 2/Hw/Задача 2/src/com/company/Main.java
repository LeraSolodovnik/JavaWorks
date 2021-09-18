package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину a:");
        int a = console.nextInt();
        System.out.println("Введите ширину b:");
        int b = console.nextInt();
        System.out.println("Введите высоту c:");
        int c = console.nextInt();

        Parallelepiped p = new Parallelepiped(a, b, c);

        System.out.println("Объём: " + Parallelepiped.Volume(p) + "\nПлощаль: " + Parallelepiped.Square(p));
    }
}

