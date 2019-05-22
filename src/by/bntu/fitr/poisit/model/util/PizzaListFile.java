package by.bntu.fitr.poisit.model.util;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.view.Console;

import java.io.FileWriter;
import java.io.IOException;

public class PizzaListFile {
    public static void writePizza (String pizzaListFile, Pizza pizza) {
        try (FileWriter writer = new FileWriter(pizzaListFile, true)) {
            writer.write(pizza.toString());
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
//log
        }
    }
}
