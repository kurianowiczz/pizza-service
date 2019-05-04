package by.bntu.fitr.poisit.model.decorator;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.entity.Mazzarello;

public class MazzarelloPizzaCreator extends PizzaCreator{
    protected Creatable component;

    public MazzarelloPizzaCreator(Creatable component) {
        this.component = component;
    }

    @Override
    public Pizza create(){
        Pizza pizza = component.create();
        pizza.add(new Mazzarello());
        return pizza;
    }
}
