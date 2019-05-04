package by.bntu.fitr.poisit.model.collections;

import by.bntu.fitr.poisit.model.entity.Restaurant;
import by.bntu.fitr.poisit.model.util.Client;

import java.util.Arrays;

public class RestaurantManager {
    static final int DEFAULT_SIZE = 10;
    private Restaurant[][] tables;

    public RestaurantManager(int m, int n) {
        try {
            this.tables = new Restaurant[m][n];
            for (int i = 0; i < tables.length; i++) {
                for (int j = 0; j < tables[i].length; j++) {
                    tables[i][j] = new Restaurant();
                }
            }
        }catch (Exception ex){
            this.tables = new Restaurant[DEFAULT_SIZE][DEFAULT_SIZE];
            for(int i = 0; i < tables.length; i++){
                for(int j = 0; j < tables[i].length; j++){
                    tables[i][j] = new Restaurant();
                }
            }
        }

    }

    public RestaurantManager() {

        this.tables = new Restaurant[DEFAULT_SIZE][DEFAULT_SIZE];
        for(int i = 0; i < tables.length; i++){
            for(int j = 0; j < tables[i].length; j++){
                tables[i][j] = new Restaurant();
            }
        }
    }

    public int getFreeTables() {
        int count = 0;
        for(int i = 0; i < tables.length; i++){
            for(int j = 0; j < tables[i].length; j++) {
                if(!tables[i][j].isReserved()){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean reserve(int i, int j, Client c) throws Exception {
        if (i < 0 || j < 0) {
            throw new Exception();
        } else if (c == null) {
            throw new NullPointerException();
        } else {
            if(!tables[i][j].isReserved()){
                tables[i][j].reserve(c);
                return true;
            }
            return false;

    }
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < tables.length; i++){
            for(int j = 0; j < tables[i].length; j++){
                if(tables[i][j].isReserved()){
                   result += " [ + ] ";
                }else {
                    result += " [   ] ";
                }
            }
            result += "\n";
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantManager that = (RestaurantManager) o;
        return Arrays.equals(tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(tables);
    }
}
