package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.enums.AgaricusSize;

import java.util.Objects;

public class Agaricus extends Product {
    private static final int AGARICUS_CALORIES = 1;
    private static final int AGARICUS_PRICE = 8;
    private AgaricusSize size;

    public Agaricus() {
        super(AGARICUS_CALORIES, AGARICUS_PRICE);
        this.size = AgaricusSize.FRIED;
    }

    public Agaricus(int calories, int price, AgaricusSize size) {
        super(calories, price);
        this.size = size;
    }

    public AgaricusSize getSize() {
        return size;
    }

    public void setSize(AgaricusSize size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Agaricus agaricus = (Agaricus) o;
        return size == agaricus.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public String toString() {
        return "Agaricus [" +
                "size = " + size +
                ", calories = " + calories +
                ", price = " + price +
                ']';
    }

}
