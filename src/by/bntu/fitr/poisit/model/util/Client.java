package by.bntu.fitr.poisit.model.util;

import by.bntu.fitr.poisit.model.collections.Pizza;

import java.util.ArrayList;

public class Client {

    private int money;
    private ArrayList<Pizza> backpack;

    public Client() {
        this.money = 0;
        this.backpack = new ArrayList<>();
    }

    public Client(int cash) {
        this.money = cash;
        this.backpack = new ArrayList<>();
    }

    public Client(int cash, Pizza pizza) {
        this.money = cash;
        this.backpack = new ArrayList<>();
        this.backpack.add(pizza);
    }

    public void getPizza(Pizza pizza) {

        this.backpack.add(pizza);
    }
}
