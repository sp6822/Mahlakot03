package com.example.mahlakot03.Q1;

class Cat extends Animal {

    @Override
    public void makeSound() {


        System.out.println("Meow~");
    }

    @Override
    public void move() {
        System.out.println("The cat walks gracefully");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats fish");
    }
}
