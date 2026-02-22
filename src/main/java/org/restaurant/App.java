package org.restaurant;

import java.util.HashSet;

public class App
{
    public static void main( String[] args )
    {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Italian Bistro", 8));
        restaurants.add(new Restaurant("Italian Bistro", 9));
        restaurants.add(new Restaurant("Sushi Zen", 7));
        restaurants.add(new Restaurant("Italian Bistro", 8));

        System.out.println("--- Restaurants in HashSet ---");

        System.out.println("Final set size: " + restaurants.size());

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant);
        }

    }
}
