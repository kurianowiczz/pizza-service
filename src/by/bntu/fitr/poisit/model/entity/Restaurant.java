package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.util.Client;

public class Restaurant {
    private boolean reserve;
    private Client client;

    public Restaurant() {
        this.client = null;
        this.reserve = false;
    }

    public void reserve(Client c){
        this.client = c;
        this.reserve = true;
    }

    public void cancelReservation(){
        this.client = null;
        this.reserve = false;
    }

    public boolean isReserved() {

        return reserve;
    }

    public Client getClient() {
        return client;
    }
}