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
import by.bntu.fitr.poisit.model.util.Client;
import by.bntu.fitr.poisit.view.Console;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        try {
            String clients = "";
            FileReader fileReader = new FileReader("client.json");
            Scanner in = new Scanner(fileReader);
            while (in.hasNext())
                clients += in.nextLine() + "\r\n";
            in.close();
            Console.println(clients);

            Client client;
            client = GSON.fromJson(clients, Client.class);
            client.addMoney(500);
            Console.println(client);

            Pizza pizza = new PepperoniPizzaCreator(new PepperoniPizzaCreator(new PizzaCreator())).create();
            pizza.add(new Pepperoni());
            pizza.add(new Agaricus());
            pizza.add(new Mazzarello());

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

            try (FileWriter writer = new FileWriter("pizzaList.txt", true)) {
                Console.println(pizza);
                writer.write(pizza.toString());
                writer.append('\n');
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            Restaurant restaurant1 = new Restaurant(5, new Reserver());

            FileOutputStream fos = new FileOutputStream("restaurant.json");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(restaurant1);
            oos.close();

            // FileInputStream fis = new FileInputStream("restaurant.bin");
            // ObjectInputStream ois = new ObjectInputStream(fis);
            // Restaurant restaurant2 = (Restaurant) ois.readObject();
            //
            // ois.close();

            // Client client1 = new Client(1000);
            // String json = GSON.toJson(client1);
            // Console.println(json);
            //
            // Client client2 = GSON.fromJson(json, Client.class);
            // Console.println(client2.getMoney());

            //Client client1 = GSON.fromJson(clients, Client.class);
            clients = GSON.toJson(client);
            FileWriter fileWriter = new FileWriter("client.json", false);
            fileWriter.write(clients);
            //fileWriter.append('\n');
            fileWriter.flush();
            fileWriter.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
