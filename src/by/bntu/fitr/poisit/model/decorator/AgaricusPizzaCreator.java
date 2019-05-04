package by.bntu.fitr.poisit.model.decorator;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.entity.Agaricus;

public class AgaricusPizzaCreator extends PizzaCreator {
    protected Creatable component;

    public AgaricusPizzaCreator(Creatable component) {
        this.component = component;
    }

    @Override
    public Pizza create() {
        Pizza pizza = component.create();
        pizza.add(new Agaricus());
        return pizza;
    }
}
