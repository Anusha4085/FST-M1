package org.example.Activities;

public class Activity1 {
    public static void main() {
        Car carName = new Car();
         carName.make = 2014;
         carName.color = "black";
         carName.transmission = "Manual";

        carName.displayCharacteristics();
        carName.accelarate();
        carName.brake();
    }
}
