package by.bntu.fitr.poisit.model.util;

import by.bntu.fitr.poisit.model.collections.Pizza;

import java.util.ArrayList;
import java.util.Objects;

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Pizza> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Pizza> backpack) {
        this.backpack = backpack;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return money == client.money &&
                Objects.equals(backpack, client.backpack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, backpack);
    }

    @Override
    public String toString() {
        return "Client[ " +
                "money = " + money +
                ", backpack = " + backpack +
                ']';
    }
}
