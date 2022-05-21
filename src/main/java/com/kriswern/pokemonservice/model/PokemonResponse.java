package com.kriswern.pokemonservice.model;

import lombok.Value;

import java.util.List;

@Value
public class PokemonResponse {

    List<Pokemon> pokemon;

}
