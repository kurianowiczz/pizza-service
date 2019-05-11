package by.bntu.fitr.poisit.model.decorator;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.entity.Pepperoni;

public class PepperoniPizzaCreator extends PizzaCreator {
    protected Creatable component;

    public PepperoniPizzaCreator(Creatable component) {
        this.component = component;
    }

    @Override
    public Pizza create() {
        Pizza pizza = component.create();
        pizza.add(new Pepperoni());
        return pizza;
    }
}
