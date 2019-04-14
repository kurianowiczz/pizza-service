package by.bntu.fitr.poisit.model.entity;

public class Pepperoni extends Product {

    private PepperoniSort sort;

    public Pepperoni() {
        this.sort = sort;
        this.calories = 5;
    }

    public Pepperoni(int fat, int price, PepperoniSort sort) {
        //TODO ? whis sort
        if(fat >= 0){
            this.calories = fat * 5;
        }else{
            this.calories = 1;
        }

        if(price >= 0){
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public PepperoniSort getSort() {
        return sort;
    }

    public void setSort(PepperoniSort sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Pepperoni [Sort: " + this.sort + ", Calories: " + this.calories + "]";
    }
}