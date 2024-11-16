import java.util.List;

public class Pizza {
    private PizzaFlavors flavor;
    private double price;
    private List<String> ingredients;

    public Pizza(PizzaFlavors flavor, double price) {
        this.flavor = flavor;
        this.price = price;
        this.ingredients = flavor.getIngredients();
    }

    public Pizza() {
    }

    public PizzaFlavors getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
