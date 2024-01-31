package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Scott", "600X", 2017);
        Car privateCar = new Car("Mercedes", "300E", 2018, 5);
        System.out.println(vehicle1);
        System.out.println(privateCar);
        Motorcycle bike1 = new Motorcycle("Yamaha", "Banzai600", 1988, "SportsBike");
        System.out.println(bike1.getTypeOfMotorcycle());
        System.out.println(bike1);
    }
}