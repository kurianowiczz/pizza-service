package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.util.Client;

import java.io.Serializable;

public class Table implements Serializable {
    //private boolean reserve;
    private Client client;
    private int sale;

    public Table() {
        this.client = null;
        //this.reserve = false;
        this.sale = 0;
    }

    public Table(boolean reserve, Client client, int sale) {
        //this.reserve = reserve;
        this.client = client;
        this.sale = sale;
    }

    public void reserve(Client c) {
        this.client = c;
        //this.reserve = true;

    }

    public void cancelReservation() {
        this.client = null;
        //this.reserve = false;
    }

    public boolean isReserved() {
        return this.client != null ;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setNullSale(){
        this.sale = 0;
    }

    public void removeClient(Client client){
        this.client = null;
    }

    public Client getClient() {

        return client;
    }

    @Override
    public String toString() {
        return this.client != null ? this.sale != 0 ? "[ V ]" : "[ + ]" : "[   ]";















    }


}
