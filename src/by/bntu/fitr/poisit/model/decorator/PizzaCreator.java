package by.bntu.fitr.poisit.model.decorator;

import by.bntu.fitr.poisit.model.collections.Pizza;

public class PizzaCreator implements Creatable {

    @Override
    public Pizza create() {
        return new Pizza();
    }

}