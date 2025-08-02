package PokeAPI;

import com.google.gson.Gson;

import java.io.IOException;

public class Pokemon {

    // fields
     private String name;
     private int height;
     private int weight;

    Gson gson = new Gson();

    // get/set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pokemon(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    @Override
    public String toString() {
        return ("Pokemon Name: " + name + "\nHeight: " + height + "\nWeight: " + weight + "\n");
    }


}
