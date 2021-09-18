package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        C c1= new C();
        D d1 = new D();

        System.out.println("Введите a:");
        int a = console.nextInt();
        System.out.println("Введите b:");
        int b = console.nextInt();

        System.out.println(a1.count(a, b));
        a1.show();

        System.out.println(b1.count(a, b));
        b1.show();

        System.out.println(c1.count(a, b));
        c1.show();

        System.out.println(d1.count(a, b));
        d1.show();
    }
}
