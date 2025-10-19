package com.example.mahlakot03.Q4;

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String getDetails() {
        return "Manager Name: " + name + ", Base Salary: " + baseSalary + ", Bonus: " + bonus;
    }

    @Override
    public void performTask() {
        System.out.println(name + " is managing the team and overseeing projects.");
    }
}
