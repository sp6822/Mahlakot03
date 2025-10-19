package com.example.mahlakot03.Q2;

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle engine starts with a vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle brakes quickly to a halt.");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerates swiftly.");
    }
}
