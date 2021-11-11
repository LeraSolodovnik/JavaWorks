package com.company;

class Numbers implements ArithmeticOperations {
    double real1;
    double real2;

    public Numbers(double a, double b) {
        real1 = a;
        real2 = b;
    }

    public void add() {
        System.out.print(real1 + real2 + "\n");
    }


    public void subtract() {
        System.out.print(real1 - real2 + "\n");
    }


    public void multiply() {
        System.out.print(real1 * real2 + "\n");
    }


    public void divide() {
        System.out.print(real1 / real2 + "\n");
    }
}
