package com.example.mahlakot03.Q1;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println("The dog runs on four legs");
    }

    @Override
    public void eat() {
        System.out.println("The dog eats bones");
    }
}
