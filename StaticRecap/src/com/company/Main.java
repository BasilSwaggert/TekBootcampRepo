package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog rex = new Dog("rex");
	    Dog fluffy = new Dog("fluffy");
	    rex.printName();
	    fluffy.printName(); // winds up printing both as "fluffy" due to the second constructor taking priority when static.
    }
}
