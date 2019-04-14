package by.bntu.fitr.poisit.model.entity;

public enum PepperoniSort {
    BEEF("beef"),  CHICKEN("chicken"), PORK("pork");

    private String sort;

    PepperoniSort(String sort){
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    @Override
    public String toString() {
        return "PepperoniSort{" +
                "sort='" + sort + '\'' +
                '}';
    }
}
