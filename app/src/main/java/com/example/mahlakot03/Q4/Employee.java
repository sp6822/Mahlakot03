package com.example.mahlakot03.Q4;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        System.out.println("Calculating salary for generic employee");
        return baseSalary;
    }

    public String getDetails() {
        return "Name: " + name + ", Base Salary: " + baseSalary;
    }

    public void performTask() {
        System.out.println(name + " is performing a generic task.");
    }
}
