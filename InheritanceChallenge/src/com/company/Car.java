package com.company;

public class Car extends Vehicle {

    private int door;
    private int wheels;
    private int engine;
    private boolean sunroof;

    public Car(int handSteering, int changingGears, int acceleration, int deceleration, int door, int wheels, int engine, boolean sunroof) {
        super(handSteering, changingGears, acceleration, deceleration);
        this.door = door;
        this.wheels = wheels;
        this.engine = engine;
        this.sunroof = sunroof;
    }

    public int getDoor() {
        return door;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public boolean isSunroof() {
        return sunroof;
    }
}
