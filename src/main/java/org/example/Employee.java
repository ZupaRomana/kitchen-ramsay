package org.example;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate birthDate;
    private int salary;

    public Employee(String name, LocalDate birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printTax() {
        int tax = (int) (salary * 0.99);
        System.out.println(tax);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
