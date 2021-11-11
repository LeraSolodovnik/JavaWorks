package com.company;

public class Param {
    private final double real;
    private final double complex;

    public Param (double real, double complex){
        this.real = real;
        this.complex = complex;
    }

    public double getComplex() {
        return complex;
    }

    public double getReal() {
        return real;
    }
}
