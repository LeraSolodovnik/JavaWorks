package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 25;//целые числа
        double b = 16;
        double c = 10;//мнимые части
        double d = 8;
        Numbers real = new Numbers(a, b);
        System.out.print("a + b = ");
        real.add();
        System.out.print("a - b = ");
        real.subtract();
        System.out.print("a * b = ");
        real.multiply();
        System.out.print("a / b = ");
        real.divide();

        Param num1 = new Param(a, c);
        Param num2 = new Param(b, d);
        ComplexNumbers num=new ComplexNumbers(num1,num2);
        System.out.print("a + ci + b + di = ");
        num.add();
        System.out.print("c - d = ");
        num.subtract();
        System.out.print("c * d = ");
        num.multiply();
        System.out.print("c / d = ");
        num.divide();

    }
}
