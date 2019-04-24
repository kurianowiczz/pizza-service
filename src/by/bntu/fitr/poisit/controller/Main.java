package by.bntu.fitr.poisit.controller;

import by.bntu.fitr.poisit.model.collections.Pizza;
import by.bntu.fitr.poisit.model.collections.RestaurantManager;
import by.bntu.fitr.poisit.model.entity.Agaricus;
import by.bntu.fitr.poisit.model.entity.Mazzarello;
import by.bntu.fitr.poisit.model.entity.Pepperoni;
import by.bntu.fitr.poisit.model.util.Client;
import by.bntu.fitr.poisit.view.Console;
import org.apache.log4j.Logger;


public class Main {
//    private static final Logger LOGGER;
//
//    static {
//        LOGGER = Logger.getRootLogger();
//    }
    

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.add(new Pepperoni());
        pizza.add(new Agaricus());
        pizza.add(new Mazzarello());
        Console.println(pizza);
        Client client = new Client(1000);
        RestaurantManager restaurant = new RestaurantManager(3, 3);
        restaurant.reserve(1, 2, client);
        restaurant.reserve(1, 0, client);
        Console.println("Free tables: " + restaurant.getFreeTables());
        Console.println(restaurant);

//      Layout layout = new SimpleLayout();
//      Appender consoleAppender = (Appender) new ConsoleAppender();
//        LOGGER.trace("Send trace message to log");
//        LOGGER.debug("Send debug message to log");
//        LOGGER.info("Send info message to log");
//        LOGGER.warn("Send warn message to log");
//        LOGGER.error("Send error message to log");
//        LOGGER.fatal("Send fatal message to log");


    }
}
