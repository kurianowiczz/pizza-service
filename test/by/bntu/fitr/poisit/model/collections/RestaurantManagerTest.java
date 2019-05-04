package by.bntu.fitr.poisit.model.collections;

import by.bntu.fitr.poisit.model.util.Client;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantManagerTest {

    @Test
    public void getFreeTables() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(0, 0, client);
        assertEquals(99, restaurant.getFreeTables());

    }

    @Test
    public void getFreeTables2()throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(5, 1, client);
        assertEquals(99, restaurant.getFreeTables());

    }

    @Test
    public void getFreeTables3()throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(-1, 1, client);
        assertEquals(100, restaurant.getFreeTables());
    }

    @Test
    public void getFreeTables4() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(-1, -100, client);
        assertEquals(100, restaurant.getFreeTables());
    }

    @Test
    public void reserve() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(2, 2, client);
        assertFalse(restaurant.reserve(2, 2, client));
    }

    @Test
    public void reserve2() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(2, 2, client);
        assertFalse(restaurant.reserve(-2, -2, client));
    }

    @Test
    public void reserve3() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(-2, -2, client);
        assertTrue(restaurant.reserve(2, 2, client));
    }

    @Test
    public void reserve4() throws Exception{
        RestaurantManager restaurant = new RestaurantManager();
        Client client = new Client();
        restaurant.reserve(-2, -2, client);
        assertFalse(restaurant.reserve(-2, -2, client));
    }

}