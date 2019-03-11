package by.bntu.fitr.poisit.model.entity;

public class Mazzarello extends Product {

    private String kind;

    public Mazzarello() {
        this.kind = "Default";
        this.price = 9;
        this.calories = 5;
    }

    public Mazzarello(int fat, int price, String kind) {
        this.calories = 3 * fat;
        this.price = price;
        this.kind = kind;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Mazzarello [Kind: " + this.kind + ", Calories: " + this.calories + "]";
    }
}