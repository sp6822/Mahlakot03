package com.example.mahlakot03.Q4;

class Salesperson extends Employee {
    private double commission;

    public Salesperson(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getDetails() {
        return "Salesperson Name: " + name + ", Base Salary: " + baseSalary + ", Commission: " + commission;
    }

    @Override
    public void performTask() {
        System.out.println(name + " is selling products and meeting clients.");
    }
}
