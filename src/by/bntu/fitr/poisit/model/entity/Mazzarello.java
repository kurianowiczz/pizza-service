package by.bntu.fitr.poisit.model.entity;

public class Mazzarello extends Product {

    private MazzarelloKind kind;

    public Mazzarello() {
        this.kind = kind;
        this.price = 9;
        this.calories = 5;
    }

    public Mazzarello(int fat, int price, MazzarelloKind kind) {

        if(fat >= 0){
            this.calories = 3 * fat;
        }else{
            this.calories = 1;
        }
        if(price >= 0){
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public MazzarelloKind getKind() {
        return this.kind;
    }

    public void setKind(MazzarelloKind kind) {
        this.kind = kind;
    }

    public String toString() {
        return "Mazzarello [Kind: " + this.kind + ", Calories: " + this.calories + "]";
    }
}