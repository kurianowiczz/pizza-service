package by.bntu.fitr.mcnw.model.entity;

public class Pepperoni extends Product {

    private String sort;

    public Pepperoni() {
        this.sort = "Default";
        this.calories = 5;
    }

    public Pepperoni(int fat, int price, String sort) {
        this.calories = 5 * fat;
        this.price = price;
        this.sort = sort;
    }


    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Pepperoni [Sort: " + this.sort + ", Calories: " + this.calories + "]";
    }
}