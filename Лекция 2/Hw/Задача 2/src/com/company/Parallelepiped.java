package com.company;

public class Parallelepiped {
    private int a;
    private int b;
    private int c;

    public Parallelepiped(int a, int b, int c){
        setA(a);
        setB(b);
        setC(c);
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static int Square(Parallelepiped d){
        return 2 * (d.getA() * d.getB() + d.getB() * d.getC() + d.getC() * d.getA());
    }
    public static int Volume(Parallelepiped d) {
        return d.getA() * d.getB() * d.getC();
    }

}
