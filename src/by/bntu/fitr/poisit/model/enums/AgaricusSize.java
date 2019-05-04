package by.bntu.fitr.poisit.model.enums;

public enum AgaricusSize {
    FRIED("fried"), INSAUSE("inSause"), BOILED("boiled");

    private String size;

    AgaricusSize(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}
