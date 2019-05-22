package by.bntu.fitr.poisit.controller;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.collections.strategy.Reserver;
import by.bntu.fitr.poisit.model.collections.strategy.Restaurant;
import by.bntu.fitr.poisit.model.collections.strategy.VipReserver;
import by.bntu.fitr.poisit.model.decorator.PepperoniPizzaCreator;
import by.bntu.fitr.poisit.model.decorator.PizzaCreator;
import by.bntu.fitr.poisit.model.entity.Agaricus;
import by.bntu.fitr.poisit.model.entity.Mazzarello;
import by.bntu.fitr.poisit.model.entity.Pepperoni;
import by.bntu.fitr.poisit.model.enums.MazzarelloKind;
import by.bntu.fitr.poisit.model.util.*;
import by.bntu.fitr.poisit.view.Console;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            ClientSerrialization cl = new ClientSerrialization("client.json");
            Client client = cl.read();

            Pizza pizza = new PepperoniPizzaCreator(new PepperoniPizzaCreator(new PizzaCreator())).create();
            pizza.add(new Pepperoni());
            pizza.add(new Agaricus());
            pizza.add(new Mazzarello());
            client.addMoney(500);
            Restaurant restaurant = new Restaurant(3, new Reserver());
            restaurant.reserve(0, 0, client);
            restaurant.setReserver(new VipReserver());
            restaurant.reserve(1, 1, client);
            Console.println("Free tables: " + restaurant.getFreeTables());
            Console.println(restaurant);

            LOG.trace("Send trace message to log");
            LOG.debug("Send debug message to log");
            LOG.info("Send info message to log");
            LOG.warn("Send warn message to log");
            LOG.error("Send error message to log");
            LOG.fatal("Send fatal message to log");

            String pizzaListFile = "pizzaList.txt";
            PizzaListFile.writePizza(pizzaListFile, pizza);
            Console.println(pizza);

            String mazzarelloFile = "mazzarello.bin";
            Mazzarello mazzarello = new Mazzarello(3, 7, MazzarelloKind.DEFAULT);
            Console.println("Before " + mazzarello);
            MazzarelloFile.write(mazzarelloFile, mazzarello);
            Mazzarello mazzarello1 = MazzarelloFile.read(mazzarelloFile);
            Console.println("After " + mazzarello1);

            cl.save(client);
            Console.println(client);

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

    }
}
