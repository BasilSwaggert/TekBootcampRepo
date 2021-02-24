package com.company;

public class Impreza extends Car {

    private boolean allWheelDrive;
    private boolean isImport;
    private String color;
    private int mpg;

    public Impreza(int handSteering, int changingGears, int acceleration, int deceleration, int door, int wheels, int engine, boolean sunroof, boolean allWheelDrive, boolean isImport, String color, int mpg) {
        super(handSteering, changingGears, acceleration, deceleration, door, wheels, engine, sunroof);
        this.allWheelDrive = allWheelDrive;
        this.isImport = isImport;
        this.color = color;
        this.mpg = mpg;
    }



    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }

    public boolean isImport() {
        return isImport;
    }

    public String getColor() {
        return color;
    }

    public int getMpg() {
        return mpg;
    }
}
