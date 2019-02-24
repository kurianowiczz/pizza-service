package by.bntu.fitr.mcnw.model.entity;

public class Agaricus extends Product {

    private int size;

    public Agaricus() {
        this.size = 1;
        this.calories = 1;
        this.price = 4;
    }

    public Agaricus(int fat, int price, int size) {
        this.calories = fat;
        this.price = price;
        this.size = size;
    }


    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Agaricus [Size: " + this.size + ", Calories: " + this.calories + "]";
    }
}