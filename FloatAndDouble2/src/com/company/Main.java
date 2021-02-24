package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);
            //Double is the preferred primitive type for numbers as it is what is often written for as well as its ability to be far more precise than Floats. Floats are effectively obsolete.

        //CHALLENGE: Convert a given number of pounds to kilograms
        //My Attempt:
        double myPoundValue = 1.0d;
        double myKiloValue = 0.45359237d;
        double myPounds = myPoundValue * 200;
        System.out.println("Weight = " + (myPounds * myKiloValue));

        //Instructor Answer:
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms= " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d; // =3,000,000.4567890 //Terrible nightmare of a format, but apparently people will actually use a format like this in the wild.
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
