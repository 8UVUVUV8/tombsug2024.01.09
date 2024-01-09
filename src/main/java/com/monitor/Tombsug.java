package com.monitor;

import java.util.InputMismatchException;

public class Tombsug {
    public double calcRadius(double side, double angle){
        if (side <= 0 || angle <= 0) {
            throw new InputMismatchException();
        }
        double rad = angle * Math.PI / 180;
        double r;
        r = 1.0/2.0 * side * Math.sin(rad);
        return r;
    }
}
