package by.bntu.fitr.poisit.model.collections.strategy;

import by.bntu.fitr.poisit.model.entity.Table;
import by.bntu.fitr.poisit.model.util.Client;

public class VipReserver implements Reservable{
    private static final int VIP_SALE = 20;

    @Override
    public void reserve(Table table, Client client) {
        table.setClient(client);
        table.setSale(VIP_SALE);
    }

    @Override
    public void canselReserve(Table table) {
        table.cancelReservation();
        table.setNullSale();
    }
}
