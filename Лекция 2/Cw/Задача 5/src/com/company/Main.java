package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();

        System.out.println(a + " + " + b + " = " + MathUtils.sum(a, b));
        System.out.println(a + " - " + b + " = " + MathUtils.diff(a, b));
        System.out.println(a + " * " + b + " = " + MathUtils.mul(a, b));
        System.out.println(a + " / " + b + " = " + MathUtils.div(a, b));
        System.out.println(a + "^" + b + " = " + MathUtils.pow(a, b));

        System.out.print("Введите число, которого нужно посчитать факториал: ");
        int c = in.nextInt();
        System.out.println(c + "!" + " = " + MathUtils.factorial(c));
    }
}
