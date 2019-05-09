package by.bntu.fitr.poisit.model.entity;

import by.bntu.fitr.poisit.model.util.Client;

public class VipTable {
    private boolean reserve;
    private Client client;
    private int bookingPrice;

    public VipTable() {
        this.client = null;
        this.reserve = false;
        this.bookingPrice = 15;
    }

    public VipTable(boolean reserve, Client client, int bookingPrice) {
        this.reserve = reserve;
        this.client = client;
        this.bookingPrice = bookingPrice;
    }

    public void reserve(Client c) {
        this.client = c;
        this.reserve = true;
        this.bookingPrice = 15;
    }

    public void cancelReservation() {
        this.client = null;
        this.reserve = false;
        this.bookingPrice = 15;
    }

    public boolean isReserved() {

        return reserve;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "VipTable [" +
                "reserve = " + reserve +
                ", client = " + client +
                ", bookingPrice = " + bookingPrice +
                ']';
    }
}
