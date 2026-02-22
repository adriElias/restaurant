package org.restaurant;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Restaurants: \n" + "name: '" + name + "(" + rating + ")";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ) return true;
        if(!(o instanceof Restaurant)) return false;
        Restaurant restaurant = (Restaurant) o;
        return rating == restaurant.rating && Objects.equals(name, restaurant.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }
}
