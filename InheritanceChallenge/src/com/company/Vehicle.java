package com.company;

public class Vehicle {

    private int handSteering;
    private int changingGears;
    private int acceleration;
    private int deceleration;

    public Vehicle(int handSteering, int changingGears, int acceleration, int deceleration) {
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    public int getHandSteering() {
        return handSteering;
    }

    public int getChangingGears() {
        return changingGears;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public int getDeceleration() {
        return deceleration;
    }
}
