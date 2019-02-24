package by.bntu.fitr.mcnw.controller;

import by.bntu.fitr.mcnw.model.collections.Pizza;
import by.bntu.fitr.mcnw.model.entity.Agaricus;
import by.bntu.fitr.mcnw.model.entity.Mazzarello;
import by.bntu.fitr.mcnw.model.entity.Pepperoni;
import by.bntu.fitr.mcnw.view.Console;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.add(new Pepperoni());
        pizza.add(new Agaricus());
        pizza.add(new Mazzarello());
        Console.println(pizza);
    }
}
