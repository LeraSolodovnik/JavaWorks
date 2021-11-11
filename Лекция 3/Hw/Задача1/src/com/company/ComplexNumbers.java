package com.company;

public class ComplexNumbers implements ArithmeticOperations {
    double real1;
    double real2;
    double complex1;
    double complex2;

    public ComplexNumbers(Param a, Param b) {
        this.real1 = a.getReal();
        this.real2 = b.getReal();
        this.complex1 = a.getComplex();
        this.complex2 = b.getComplex();
    }


    public void add() {
        System.out.print(real1 + real2);
        if ((complex1 + complex2)>0) {
            System.out.print("+" + (complex1 + complex2) + "i\n");
        } else {
            System.out.print("-" + (-1)*(complex1 + complex2) + "i\n");
        }
    }


    public void subtract() {
        System.out.print(real1 - real2);
        if ((complex1 - complex2)>0) {
            System.out.print("+" + (complex1 - complex2) + "i\n");
        } else {
            System.out.print("-" + (-1)*(complex1 - complex2) + "i\n");
        }
    }


    public void multiply() {
        System.out.print((real1 * real2 - complex1 * complex2));
        if ((real1 * complex2 + real2 * complex1)>0) {
            System.out.print("+" + (real1 * complex2 + real2 * complex1) + "i\n");
        } else {
            System.out.print("-" + (-1)*(real1 * complex2 + real2 * complex1) + "i\n");
        }
    }


    public void divide() {
        System.out.print((real1 * real2 + complex1 * complex2) / (real2 * real2 + complex2 * complex2));
        if ((complex1 * real2 - real1 * complex2) / (real2 * real2 + complex2 * complex2)>0) {
            System.out.print("+" + (complex1 * real2 - real1 * complex2) / (real2 * real2 + complex2 * complex2) + "i\n");
        } else {
            System.out.print("-" + (-1)*((complex1 * real2 - real1 * complex2) / (real2 * real2 + complex2 * complex2)) + "i\n");
        }
    }
}
