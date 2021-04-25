package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class KitchenHelper extends Employee {
    private Map<Ingredients, Integer> ingredients = new HashMap<>();

    public KitchenHelper(String name, LocalDate birthDate, int salary) {
        super(name, birthDate, salary);
        for (Ingredients ingredient : Ingredients.values()) {
            ingredients.put(ingredient, new Random().nextInt(2));
        }
    }

    public boolean hasIngredient(Ingredients ingredient) {
        return ingredients.get(ingredient) != 0;
    }

    public Ingredients getIngredient(Ingredients ingredient) {

        ingredients.put(ingredient, ingredients.get(ingredient) - 1);
        return ingredient;
    }
}
