package com.kriswern.pokemonservice.service;

import com.kriswern.pokemonservice.model.Pokemon;
import com.kriswern.pokemonservice.model.PokemonResponse;
import com.kriswern.pokemonservice.remote.PokemonRemote;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PokemonService {

    private final PokemonRemote pokemonRemote;

    public PokemonResponse getAll() {
        List<Pokemon> pokemon = pokemonRemote.getAll()
                .getResults()
                .stream()
                .map(p -> getPokemonByName(p.getName()))
                .toList();

        return new PokemonResponse(pokemon);
    }

    public Pokemon getPokemonById(String id) {
        return pokemonRemote.getById(id);
    }

    public Pokemon getPokemonByName (String name) {
        return pokemonRemote.getByName(name);
    }
}
