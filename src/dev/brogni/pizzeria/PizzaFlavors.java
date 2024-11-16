package dev.brogni.pizzeria;

import java.util.List;

public enum PizzaFlavors {
    MARGHERITA(8.90, List.of("Pomodoro", "Basilico", "Mozzarella")),
    MARINARA(7.50, List.of("Pomodoro", "Basilico")),
    PROSCIUTTO(9.90, List.of("Pomodoro", "Mozzarella", "Prosciutto"));

    private final double price;
    private final List<String> ingredients;

    PizzaFlavors(double price, List<String> ingredients) {
        this.price = price;
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}