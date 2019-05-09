package by.bntu.fitr.poisit.model.collections.strategy;

import by.bntu.fitr.poisit.model.entity.Table;
import by.bntu.fitr.poisit.model.util.Client;

public class Reserver implements Reservable{
    @Override
    public void reserve(Table table, Client client) {
        table.setClient(client);
    }

    @Override
    public void canselReserve(Table table) {
        table.cancelReservation();
    }
}
