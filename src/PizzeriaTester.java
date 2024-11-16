import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzeriaTester {

    @Test
    @DisplayName("Should be able to prepare a pizza")
    void shouldBeAbleToPrepareAPizza() {
        var pizzeria = new Pizzeria();

        pizzeria.preparePizza(PizzaFlavors.MARGHERITA);

        var pizzas = pizzeria.getPizzasByStatus(PizzaStatus.IN_PRODUCTION);

        assertEquals(pizzas.size(), 1);

        for (var pizza: pizzas) {
            assertEquals(pizza.getFlavor(), PizzaFlavors.MARGHERITA);
        }
    }
}
