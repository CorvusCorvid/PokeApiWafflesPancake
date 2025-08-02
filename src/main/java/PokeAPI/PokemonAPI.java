package PokeAPI;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PokemonAPI {

    private final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    private final HttpClient client;

    Gson gson = new Gson();

    public PokemonAPI() {
        client = HttpClient.newHttpClient();
    }

    public String findPokemon(String input) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + input))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        return response.body();
    }

}
