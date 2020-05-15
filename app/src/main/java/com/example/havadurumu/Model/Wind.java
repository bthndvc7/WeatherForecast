package com.example.havadurumu.Model;

import android.graphics.Path;

public class Wind {
    private double speed;
    private double deg;
    private String direction;

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Wind() {
        if (deg >337.5)
           direction = new String("Northerly");
        if (deg >292.5)
            direction = new String("North Westerly");
        if (deg >247.5)
            direction = new String("Westerly");
        if (deg >202.5)
            direction = new String("South Westerly");
        if (deg >157.5)
            direction = new String("Southerly");
        if (deg >122.5)
            direction = new String("South Easterly");
        if (deg >67.5)
            direction = new String("Easterly");
        if (deg >22.5)
            direction = new String("North Easterly");
        if (deg >=0)
            direction = new String("Northerly");


    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }
}
