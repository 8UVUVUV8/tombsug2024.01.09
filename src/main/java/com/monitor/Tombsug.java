package com.monitor;

public class Tombsug {
    public double calcRadius(double side, double angle){
        double rad = angle * Math.PI / 180;
        double r;
        r = 1.0/2.0 * side * Math.sin(rad);
        return r;
    }
}
