package com.example.mahlakot03.Q1;

class Fish extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Blub blub!");
    }

    @Override
    public void move() {
        System.out.println("The fish swims in the water — it can't move on land!");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats algae and small insects");
    }
}
