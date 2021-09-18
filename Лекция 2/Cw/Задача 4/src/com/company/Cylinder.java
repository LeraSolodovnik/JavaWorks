package com.company;

public class Cylinder {
    private double r;
    private double h;
    private String R;
    private String H;


    public double Square() {
        return 2 * Math.PI * (Math.pow(r, 2) + r * h);
    }

    public double Volume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public double SquareD(double r, double h) {
        return 2 * Math.PI * (Math.pow(r, 2) + r * h);
    }

    public double VolumeD(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public double SquareS(String R, String H) {
        double r = Double.parseDouble(R);
        double h = Double.parseDouble(H);
        return SquareD(r, h);
    }

    public double VolumeS(String R,String H) {
        double r = Double.parseDouble(R);
        double h = Double.parseDouble(H);
        return VolumeD(r, h);

    }
}