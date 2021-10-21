package com.company;

import static com.company.Numbers.real1;
import static com.company.Numbers.real2;

public class ComplexNumbers implements ArithmeticOperations {
    double complex1;
    double complex2;

    public ComplexNumbers(double c, double d) {
        complex1 = c;
        complex2 = d;
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
