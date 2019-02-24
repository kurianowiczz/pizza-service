package by.bntu.fitr.mcnw.model.entity;

/*
 * Abstract high-level class
 *   - made abstract for perspective editions
 *
 *   TODO: add some more abstract realization
 */
public class Product {
    protected int calories;
    protected int price;

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
}
