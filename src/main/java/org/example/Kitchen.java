package org.example;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private Chef chef;
    private List<Cookable> cookables = new ArrayList<>();
    private List<KitchenHelper> helpers = new ArrayList<>();

    public void makeDinner() {
        List<Ingredients> availableIngredients = getAvailableIngredients();
        chef.setIngredients(availableIngredients);
        chef.cook();
        if (chef.hasAllIngredients()) {
            for (Cookable cookable : cookables) {
                cookable.cook();
            }
        }
    }

    public void hire(Employee employee) {
        if (employee instanceof Chef) {
            chef = (Chef) employee;
        }

        else if (employee instanceof Cookable) {
            cookables.add((Cookable) employee);
        }

        else if (employee instanceof KitchenHelper) {
            helpers.add((KitchenHelper) employee);
        }
    }

    private List<Ingredients> getAvailableIngredients() {
        List<Ingredients> availableIngredients = new ArrayList<>();
        for (Ingredients ingredient : Ingredients.values()) {
            for (KitchenHelper helper : helpers) {
                if (helper.hasIngredient(ingredient)) {
                    availableIngredients.add(helper.getIngredient(ingredient));
                }
            }
        }
        return availableIngredients;
    }
}
