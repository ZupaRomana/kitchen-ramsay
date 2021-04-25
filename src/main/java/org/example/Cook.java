package org.example;

import java.time.LocalDate;

public class Cook extends Employee implements Cookable {
    public Cook(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void cook() {
        System.out.println("I am cooking!!!!!!!!!!");
    }
}
