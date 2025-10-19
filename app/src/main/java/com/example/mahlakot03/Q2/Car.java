package com.example.mahlakot03.Q2;

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine starts with a roar!");
    }

    @Override
    public void stop() {
        System.out.println("Car slows down and stops safely.");
    }
    @Override
    public void accelerate() {
        System.out.println("Car speeds up on the road.");
    }
}
