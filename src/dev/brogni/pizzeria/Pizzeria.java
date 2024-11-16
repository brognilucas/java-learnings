package dev.brogni.pizzeria;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Pizzeria {

    private EnumMap<PizzaStatus, List<Pizza>> pizzas = new EnumMap<>(PizzaStatus.class);

    public Pizzeria() {
        pizzas.put(PizzaStatus.IN_PRODUCTION, new ArrayList<Pizza>());
        pizzas.put(PizzaStatus.READY, new ArrayList<Pizza>());
        pizzas.put(PizzaStatus.DELIVERED, new ArrayList<Pizza>());
    }

    public void preparePizza(PizzaFlavors pizzaFlavor) {
        var pizza = new Pizza(pizzaFlavor, 8.90);
        var pizzasInProduction = pizzas.get(PizzaStatus.IN_PRODUCTION);

        pizzasInProduction.add(pizza);

        pizzas.put(PizzaStatus.IN_PRODUCTION, pizzasInProduction);
    }

    public List<Pizza> getPizzasByStatus(PizzaStatus status) {
        return pizzas.get(status);
    }
}
