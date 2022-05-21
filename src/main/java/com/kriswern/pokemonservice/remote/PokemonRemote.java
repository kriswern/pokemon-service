package com.kriswern.pokemonservice.remote;

import com.kriswern.pokemonservice.model.Pokemon;
import com.kriswern.pokemonservice.model.PokemonResults;
import lombok.AllArgsConstructor;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
public class PokemonRemote {

    private final WebClient pokemonWebClient;

    public PokemonResults getAll() {
        return pokemonWebClient.get()
                .uri("pokemon/?limit=151")
                .retrieve()
                .bodyToMono(PokemonResults.class)
                .block();
        //add doOnError
    }

    public Pokemon getById(String id) {
        return pokemonWebClient.get()
                .uri("pokemon/" + id)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .block();
    }

    public Pokemon getByName(String name) {
        return pokemonWebClient.get()
                .uri("pokemon/" + name)
                .retrieve()
                .bodyToMono(Pokemon.class)
                .block();
    }
}
