package PokeAPI;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PokemonAPI pokeAPI = new PokemonAPI();
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean loop = true;

        System.out.println("Welcome to the Pokedex!");
        while (loop) {
            System.out.println("If you would like to exit, type \"Exit\" or \"0\"!");
            System.out.println("Enter the name or Pokedex number of the Pokemon you want to look up: ");
            input = scanner.nextLine();
            if (input.equals("Exit") || input.equals("0")) {
                loop = false;
                System.out.println("Thank you for using the Pokedex!!");
            } else if (Integer.parseInt(input) < 0) {
                System.out.println("Please enter a positive integer!");
            }
            else {
                try {

                    String json = pokeAPI.findPokemon(input);
                    //System.out.println(json);
                    Gson gson = new Gson();
                    Pokemon pokemon = gson.fromJson(json, Pokemon.class);

                    System.out.println(pokemon);


                }
                catch (Exception e) {
                    System.out.println("An error has occurred!");
                    //throw new RuntimeException(e);
                }
            }
        }
    }
}