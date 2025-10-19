package com.example.mahlakot03.Q4;

class Developer extends Employee {
    private double overtimePay;

    public Developer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }

    @Override
    public String getDetails() {
        return "Developer Name: " + name + ", Base Salary: " + baseSalary + ", Overtime Pay: " + overtimePay;
    }

    @Override
    public void performTask() {
        System.out.println(name + " is writing code and developing software.");
    }
}
