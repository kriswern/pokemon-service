package com.kriswern.pokemonservice.controller;

import com.kriswern.pokemonservice.model.Pokemon;
import com.kriswern.pokemonservice.model.PokemonResponse;
import com.kriswern.pokemonservice.service.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/pokemon")
public class PokemonController {

    PokemonService pokemonService;

    @GetMapping()
    public PokemonResponse all() {
        return pokemonService.getAll();
    }

    @GetMapping("/{id}")
    public Pokemon getPokemonById(@PathVariable("id") String id) {
        return pokemonService.getPokemonById(id);
    }

    @GetMapping("/{name}")
    public Pokemon getPokemonByName(@PathVariable("name") String name) {
        return pokemonService.getPokemonByName(name);
    }

}
