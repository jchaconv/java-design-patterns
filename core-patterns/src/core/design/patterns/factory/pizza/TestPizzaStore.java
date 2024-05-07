package core.design.patterns.factory.pizza;

public class TestPizzaStore {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("veggie");

    }

}
