package org.prog.cars;

import org.prog.Journey;

public class Car implements ICar, IFuleable {

    public String color;
    public String fuelType;

    public void goTo(Journey parameters){
        goTo(parameters.from, parameters.passingThrough, parameters.destination);
    }

    public void goTo(String destination) {
        goTo("current position", destination);
    }

    public void goTo(String from, String destination) {
        goTo(from, "no additional stops", destination);
    }

    public void goTo(String from, String passing, String destination) {
        System.out.println("Car is going from " + from + " to "
                + destination + " passing through " + passing);
    }

    public void fuelCar() {
        System.out.println("Pour some gas");
    }

    @Override
    public void moveForward(String distance) {
        System.out.println("Car goes " + distance);
    }

    @Override
    public void turnRight() {
        System.out.println("Car turns Right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car turns Left");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public void reverseMovement() {
        System.out.println("Reverse car movement direction");
    }

    @Override
    public void fuelVehicle() {
        fuelCar();
    }
    // Homework 1
    public void PaintCar(String color) {
        System.out.println("Car is painted in " + color);
    }
}



