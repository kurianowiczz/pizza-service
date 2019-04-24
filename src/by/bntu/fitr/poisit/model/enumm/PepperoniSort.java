package by.bntu.fitr.poisit.model.enumm;

public enum PepperoniSort {
    BEEF("beef"),  CHICKEN("chicken"), PORK("pork");

    private String sort;

    PepperoniSort(String sort){
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

}
