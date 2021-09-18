package com.company;

import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите радиус r:");
        double r = console.nextDouble();
        System.out.println("Введите высоту h:");
        double h = console.nextDouble();

        Cylinder S=new Cylinder();
        System.out.println("S="+S.SquareD(r,h));
        System.out.println("V="+S.VolumeD(r,h));

        System.out.println("Введите радиус r:");
        String R = console.next();
        System.out.println("Введите высоту h:");
        String H = console.next();

        System.out.println("S="+S.SquareS(R,H));
        System.out.println("V="+S.VolumeS(R,H));
    }
}
