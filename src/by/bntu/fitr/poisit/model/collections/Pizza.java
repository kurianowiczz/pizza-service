package by.bntu.fitr.poisit.model.collections;

import by.bntu.fitr.poisit.model.entity.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pizza {

    private List<Product> elements;

    public Pizza() {

        this.elements = new ArrayList<>();
    }

    public Pizza(List<Product> elements) {

        this.elements = elements;
    }


    public Pizza(Pizza pizza) {

        this.elements = new ArrayList<>(pizza.getElements());
    }

    public List<Product> getElements() {

        return elements;
    }

    public void setElements(List<Product> elements) {
        this.elements = elements;
    }

    public Pizza(Product... listOfProducts) {
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

    public void add(Product product) {
        this.elements.add(product);
    }

    public boolean remove(Product product) {
        return this.elements.remove(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(elements, pizza.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
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
