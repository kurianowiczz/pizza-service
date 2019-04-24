package test;

import by.bntu.fitr.poisit.model.collections.RestaurantManager;
import by.bntu.fitr.poisit.model.util.Client;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void getFreeTables() {
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(0, 0, client);
        assertEquals(99, restaurant.getFreeTables());

    }
}