package by.bntu.fitr.poisit.model.collections.strategy;

import by.bntu.fitr.poisit.model.entity.Table;
import by.bntu.fitr.poisit.model.util.Client;

public interface Reservable {
    public void reserve(Table table, Client client);
    public void canselReserve(Table table);
}
