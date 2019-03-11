package by.bntu.fitr.poisit.model.service;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.entity.Product;

import java.util.ArrayList;
import java.util.Date;

public class PizzaService {

    public static ArrayList<String> journal;

    static {
        journal = new ArrayList<>();
    }

    public static Pizza create(Product...elements) {
        Pizza temp = new Pizza(elements);
        Date now = new Date();
        String log = now.toString() + " : " + temp.toString();
        journal.add(log);
        return temp;
    }

}