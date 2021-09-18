package com.company;


class B extends A {
    static int count(int a, int b) {
        System.out.println("-");
        return a-b;
    }

    public void show(){
        System.out.println("B\n");
    }
}