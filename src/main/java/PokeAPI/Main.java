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
        Gson gson = new Gson();

        System.out.println("Welcome to the Pokedex!");
        while (loop) {
            System.out.println("If you would like to exit, type \"Exit\" or \"0\"!");
            System.out.println("Enter the name or Pokedex number of the Pokemon you want to look up: ");
            input = scanner.nextLine();
            if (input.equals("Exit") || input.equals("0")) {
                loop = false;
                System.out.println("Goodbye!");
            } else {
                try {
                    //String jsonInString = pokeAPI.findPokemon(input);
                    //JsonObject object = JsonParser.parseString(input).getAsJsonObject();
                    //Pokemon pokemon = new Pokemon();

                    //pokemon.setName(object.get("name").getAsString());

                    //System.out.println(pokemon.toString());
                    //System.out.println(jsonInString);

                    //Pokemon pokemon = gson.fromJson(jsonInString, Pokemon.class);
                    //System.out.println(pokemon.toString());

                    String json = pokeAPI.findPokemon(input);
                    System.out.println(json);

                    //Pokemon pokemon = gson.fromJson(json, Pokemon.class);

                } catch (Exception e) {
                    System.out.println("um");
                    throw new RuntimeException(e);
                }


            }

        }



    }
}