package by.bntu.fitr.poisit.controller;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.collections.Restaurant;
import by.bntu.fitr.poisit.model.entity.Agaricus;
import by.bntu.fitr.poisit.model.entity.Mazzarello;
import by.bntu.fitr.poisit.model.entity.Pepperoni;
import by.bntu.fitr.poisit.model.util.Client;
import by.bntu.fitr.poisit.view.Console;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.add(new Pepperoni());
        pizza.add(new Agaricus());
        pizza.add(new Mazzarello());
        Console.println(pizza);
        Client client = new Client(1000);
        Restaurant restaurant = new Restaurant(3, 3);
        restaurant.reserve(1, 2, client);
        restaurant.reserve(1, 0, client);
        Console.println("Free tables: " + restaurant.getFreeTables());
        Console.println(restaurant);

    }
}
