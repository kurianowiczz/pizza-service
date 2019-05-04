package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.enums.MazzarelloKind;

import java.util.Objects;

public class Mazzarello extends Product {

    private MazzarelloKind kind;

    public Mazzarello() {
        super(3, 7);
        this.kind = MazzarelloKind.DEFAULT;
    }

    public Mazzarello(int calories, int price, MazzarelloKind kind) {
        super(calories, price);
        this.kind = kind;
    }

    public void setKind(MazzarelloKind kind) {
        this.kind = kind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mazzarello that = (Mazzarello) o;
        return kind == that.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kind);
    }

    @Override
    public String toString() {
        return "Mazzarello [" +
                "kind = " + kind +
                ", calories = " + calories +
                ", price = " + price +
                ']';
    }
}

