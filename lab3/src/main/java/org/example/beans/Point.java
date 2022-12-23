package org.example.beans;

import java.io.Serializable;
import java.time.ZoneId;

public class Point implements Serializable {
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double x=0;
    private double y=0;
    private double r=1;

    public Point(){

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }


}
