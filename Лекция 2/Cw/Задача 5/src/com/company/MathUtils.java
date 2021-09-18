package com.company;

public class MathUtils {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double diff(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static int factorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * factorial(f - 1);
        }
    }
}
