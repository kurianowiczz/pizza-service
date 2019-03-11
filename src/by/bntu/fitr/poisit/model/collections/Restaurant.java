package by.bntu.fitr.poisit.model.collections;

import by.bntu.fitr.poisit.model.entity.Table;

public class Restaurant {

    private Table[][] tables;

    public Restaurant(int m, int n) {

        this.tables = new Table[m][n];
        for(int i = 0; i < tables.length; i++){
            for(int j = 0; j < tables[i].length; j++){
                tables[i][j] = new Table();
            }
        }
    }

    public Restaurant() {

        this.tables = new Table[10][10];
        for(int i = 0; i < tables.length; i++){
            for(int j = 0; j < tables[i].length; j++){
                tables[i][j] = new Table();
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



    public boolean reserve(int i, int j){
        if(!tables[i][j].isReserved()){
            tables[i][j].reserve();
            return true;
        }
        return false;
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

}
