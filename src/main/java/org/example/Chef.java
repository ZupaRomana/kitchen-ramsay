package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Chef extends Employee implements Cookable {

    private List<Ingredients> ingredients = new ArrayList<>();

    public Chef(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients.addAll(ingredients);
    }

    public boolean hasAllIngredients() {
        return ingredients.size() == 3;
    }

    @Override
    public void cook() {
        if (!hasAllIngredients()) {
            System.out.println("AAAAAAAAAAAAAAAAAA");
        }
    }
}
