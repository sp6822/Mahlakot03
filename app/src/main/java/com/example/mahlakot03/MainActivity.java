package com.example.mahlakot03;
class Animal {

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    public void move() {
        System.out.println("The animal moves in some way");
    }
    public void eat() {
        System.out.println("The animal eats some food");
    }
}
class Dog extends Animal {

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

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies in the sky");
    }
    @Override
    public void eat() {
        System.out.println("The bird eats seeds");
    }
}
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

