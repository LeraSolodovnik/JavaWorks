package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 25;//целые числа
        double b = 16;
        double c = 10;//мнимые части
        double d = 8;
        Numbers real = new Numbers(a, b);
//        System.out.print("a + b = " + real.add() + "\n" +
//                "real a - real b = " + real.subtract() + "\n" +
//                "real a * real b = " + real.multiply() + "\n" +
//                "real a / real b = " + real.divide() + "\n");
        System.out.print("a + b = ");
        real.add();
        System.out.print("a - b = ");
        real.subtract();
        System.out.print("a * b = ");
        real.multiply();
        System.out.print("a / b = ");
        real.divide();

        ComplexNumbers complex = new ComplexNumbers(c, d);
        System.out.print("c + d = ");
        complex.add();
        System.out.print("c - d = ");
        complex.subtract();
        System.out.print("c * d = ");
        complex.multiply();
        System.out.print("c / d = ");
        complex.divide();
    }
}
