package com.company;

class Planets {
    private Double distanceToSun;
    private Double mass;
    private Double diameter;

    Planets (Double distanceToSun, Double mass, Double diameter) {
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }


    public Double getDistanceToSun() {
        return distanceToSun;
    }

    public Double getMass() {
        return mass;
    }

    public Double getDiameter() {
        return diameter;
    }

}
