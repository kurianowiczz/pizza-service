package by.bntu.fitr.poisit.model.collections;

import by.bntu.fitr.poisit.model.collections.strategy.Restaurant;
import by.bntu.fitr.poisit.model.util.Client;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void getFreeTables() throws Exception{
        Restaurant restaurant = new Restaurant();
        Client client = new Client();
        restaurant.reserve(0, 0, client);
        assertEquals(99, restaurant.getFreeTables());

    }

    @Test
    public void getFreeTables2()throws Exception{
        Restaurant restaurant = new Restaurant();
        Client client = new Client();
        restaurant.reserve(5, 1, client);
        assertEquals(99, restaurant.getFreeTables());

    }

    @Test
    public void getFreeTables3()throws Exception{
        Restaurant restaurant = new Restaurant();
        Client client = new Client();
        restaurant.reserve(-1, 1, client);
        assertEquals(100, restaurant.getFreeTables());
    }

    @Test
    public void getFreeTables4() throws Exception{
        Restaurant restaurant = new Restaurant();
        Client client = new Client();
        restaurant.reserve(-1, -100, client);
        assertEquals(100, restaurant.getFreeTables());
    }



}