package com.kriswern.pokemonservice.controller;

import com.kriswern.pokemonservice.model.PokemonResponse;
import com.kriswern.pokemonservice.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/pokemon")
public class PokemonController {

    PokemonService pokemonService;

    @GetMapping()
    public PokemonResponse all() {
        return pokemonService.getAll();
    }

    @GetMapping("/id/{id}")
    public PokemonResponse getPokemonById(@PathVariable("id") String id) {
        return new PokemonResponse(List.of(pokemonService.getPokemonById(id)));
    }

    @GetMapping("/name/{name}")
    public PokemonResponse getPokemonByName(@PathVariable("name") String name) {
        return new PokemonResponse(List.of(pokemonService.getPokemonByName(name)));
    }

}
