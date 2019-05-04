package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.enums.PepperoniSort;

import java.util.Objects;

public class Pepperoni extends Product {

    private PepperoniSort sort;

    public Pepperoni() {
        super(2, 5);
        this.sort = PepperoniSort.BEEF;
    }

    public Pepperoni(int calories, int price, PepperoniSort sort) {
        super(calories, price);
        this.sort = sort;
    }

    public PepperoniSort getSort() {
        return sort;
    }

    public void setSort(PepperoniSort sort) {
        this.sort = sort;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pepperoni pepperoni = (Pepperoni) o;
        return sort == pepperoni.sort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort);
    }

    @Override
    public String toString() {
        return "Pepperoni [" +
                "sort = " + sort +
                ", calories = " + calories +
                ", price = " + price +
                ']';
    }

}