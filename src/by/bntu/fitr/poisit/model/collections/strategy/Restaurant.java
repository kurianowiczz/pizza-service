package by.bntu.fitr.poisit.model.collections.strategy;

import by.bntu.fitr.poisit.model.entity.Table;
import by.bntu.fitr.poisit.model.util.Client;
import org.apache.log4j.Logger;

public class Restaurant {
    private static final int DEFAULT_SIZE = 10;
    private static final Reservable DEFAULT_RESERVER = new Reserver();
    private Table[][] tables;
    private Reservable reserver;
    private static final Logger LOG = Logger.getLogger(Restaurant.class);

    public Restaurant() {
            for (int i = 0; i < tables.length; i++) {
                for (int j = 0; j < tables[i].length; j++) {
                    tables[i][j] = new Table();
                }
            }
            this.reserver = DEFAULT_RESERVER;
            LOG.info("The table is ordered by the client");
    }

    public Restaurant(int size, Reservable reserver) {
        try {
            this.tables = new Table[size][size];
            for (int i = 0; i < tables.length; i++) {
                for (int j = 0; j < tables[i].length; j++) {
                    tables[i][j] = new Table();
                }
            }
        } catch (Exception ex) {
            this.tables = new Table[DEFAULT_SIZE][DEFAULT_SIZE];
            for (int i = 0; i < tables.length; i++) {
                for (int j = 0; j < tables[i].length; j++) {
                    tables[i][j] = new Table();
                }
            }
            LOG.fatal("The value cannot be negative");
        }
        this.reserver = reserver;
    }

    public void setReserver(Reservable reserver) {
        this.reserver = reserver;
    }

    public void reserve(int i, int j, Client client){
        try{
            if(!this.tables[i][j].isReserved()){
                this.reserver.reserve(this.tables[i][j], client);
            }
        } catch (Exception ex){
            LOG.debug("Table cannot have negative indexes");
        }

    }

    public int getFreeTables() {
        int count = 0;
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables[i].length; j++) {
                if (!tables[i][j].isReserved()) {
                    count++;
                }
            }
        }
        return count;
    }

    public void canselReservation(int i, int j){
        this.reserver.canselReserve(this.tables[i][j]);
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < tables[i].length; j++) {
                result += tables[i][j].toString();
            }
            result += "\n";
        }
        return result;
    }
}
