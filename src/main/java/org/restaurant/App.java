package org.restaurant;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class App
{
    public static void main( String[] args )
    {
//      HashSet<Restaurant> restaurants = new HashSet<>();
        TreeSet<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("Italian Bistro", 8));
        restaurants.add(new Restaurant("Italian Bistro", 9));
        restaurants.add(new Restaurant("Sushi Zen", 7));
        restaurants.add(new Restaurant("Italian Bistro", 8));
        restaurants.add(new Restaurant("Sushi Zen", 10));
        restaurants.add(new Restaurant("Amàlia", 5));

        System.out.println("--- Restaurants in HashSet ---");

        System.out.println("Final set size: " + restaurants.size());

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }
}
