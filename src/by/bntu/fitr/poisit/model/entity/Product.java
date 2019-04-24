package by.bntu.fitr.poisit.model.entity;

import java.util.Objects;

/*
 * Abstract high-level class
 *   - made abstract for perspective editions
 *
 *   TODO: add some more abstract realization
 */
public class Product {
    protected int calories;
    protected int price;

    public Product() {
        this.calories = 0;
        this.price = 0;
    }

    public Product(int calories, int price) {
        if(calories >= 0){
            this.calories = calories * 5;
        }else{
            this.calories = 1;
        }

        if(price >= 0){
            this.price = price;
        } else {
            this.price = 1;
        }
    }

    public int getCalories() {

        return this.calories;
    }

    public void setCalories(int calories) {
        if (calories > 0) {
            this.calories = calories;
        }
    }

    public int getPrice() {

        return this.price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return calories == product.calories &&
                price == product.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(calories, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "calories = " + calories +
                ", price = " + price +
                '}';
    }
}
