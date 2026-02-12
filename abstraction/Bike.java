package com.abstraction;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike is starting with a self-start or kick.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping using hand brakes.");
    }
}
