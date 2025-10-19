package com.example.mahlakot03.Q2;

class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starts pedaling.");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle comes to a stop using brakes.");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle pedals faster.");
    }
}
