package by.bntu.fitr.poisit.model.enumm;

public enum MazzarelloKind {
    DEFAULT("default"), SPICY("spicy"), TREECE("treece");

    private String type;

    MazzarelloKind(String type) {
        this.type = type;
    }

    public String getType(){

        return type;
    }

}
