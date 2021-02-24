package com.company;

class Car {
    private String name;
    private String color;
    private int wheels;
    private int cylinders;
    private boolean engine;

    public Car(String name, String color, int cylinders) {
        this.name = name;
        this.color = color;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;

    }

    public boolean startEngine() {
        return false;
    }

    public boolean brake() {
        return false;
    }

    public int accelerateBy() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class SubaruBRZ extends Car {
    public SubaruBRZ() {
        super("Subaru BRZ", "Blue", 4);
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public int accelerateBy() {
        return 40;
    }
}

class JeepWrangler extends Car {
    public JeepWrangler() {
        super("Jeep Wrangler", "Red", 6);
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public boolean brake() {
        return true;
    }
}

class Mazda3 extends Car {
    public Mazda3() {
        super("Mazda 3", "Black", 4);
    }

    @Override
    public boolean brake() {
        return true;
    }

    @Override
    public int accelerateBy() {
        return 30;
    }
}














public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
