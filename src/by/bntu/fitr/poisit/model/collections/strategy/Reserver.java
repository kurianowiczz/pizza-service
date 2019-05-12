package by.bntu.fitr.poisit.model.collections.strategy;

import by.bntu.fitr.poisit.model.entity.Table;
import by.bntu.fitr.poisit.model.util.Client;

import java.io.Serializable;

public class Reserver implements Reservable, Serializable {
    @Override
    public void reserve(Table table, Client client) {
        table.setClient(client);
    }

    @Override
    public void canselReserve(Table table) {
        table.cancelReservation();
    }
}
