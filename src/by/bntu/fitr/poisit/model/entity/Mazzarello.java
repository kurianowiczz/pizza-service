package by.bntu.fitr.poisit.model.entity;

public class Mazzarello extends Product {

    private String kind; // or MazzarelloKind kind

    public Mazzarello() {
        this.kind = MazzarelloKind.DEFAULT.getType();
        this.price = 9;
        this.calories = 5;
    }

    public Mazzarello(int fat, int price, MazzarelloKind kind) {
        //TODO
        this.calories = 3 * fat;
        this.price = price;
        this.kind = kind.getType();
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