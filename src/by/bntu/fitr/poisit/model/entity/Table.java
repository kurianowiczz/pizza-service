package by.bntu.fitr.poisit.model.entity;

public class Table {
    private boolean reserve;

    public Table() {
        this.reserve = false;
    }


    public void reserve(){

        this.reserve = true;
    }

    public void cancelReservation(){

        this.reserve = false;
    }

    public boolean isReserved() {

        return reserve;
    }
}
