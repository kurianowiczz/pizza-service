package by.bntu.fitr.mcnw.model.collections;

import by.bntu.fitr.mcnw.model.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

    private ArrayList<Product> elements;

    public Pizza() {
        this.elements = new ArrayList<>();
    }

    public Pizza(Pizza pizza){
        this.elements = new ArrayList<>(pizza.getElements());
    }

    public ArrayList<Product> getElements() {
        return elements;
    }

    public Pizza(Product ...listOfProducts) {
        this.elements = new ArrayList<>();
        this.elements.addAll(Arrays.asList(listOfProducts)); //mas -> arrL
    }

    public int getAllCalories() {
        int result = 0;
        for (Product one : this.elements) {
            result += one.getCalories();
        }
        return result;
    }

    public ArrayList<Product> add(Product product){
        this.elements.add(product);
        return this.elements;
    }

    public ArrayList<Product> remove(Product product){
        this.elements.remove(product);
        return this.elements;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n\nPizza:\n");
        for (Product one : this.elements) {
            result.append("\t").append(one.toString()).append("\n");
        }
        return result.toString();
    }
}
