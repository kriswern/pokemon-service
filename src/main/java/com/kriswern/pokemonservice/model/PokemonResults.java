package com.kriswern.pokemonservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonResults {

    List<SimplifiedPokemon> results;

    @JsonCreator
    public PokemonResults(@JsonProperty("results") List<SimplifiedPokemon> results) {
        this.results = results;
    }

}
