package com.kriswern.pokemonservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class Pokemon {

    int id;
    String name;
    Sprites sprites;

    @JsonCreator
    public Pokemon(
            @JsonProperty("id") int id,
            @JsonProperty("name") String name,
            @JsonProperty("sprites") Sprites sprites) {
        this.id = id;
        this.name = name;
        this.sprites = sprites;
    }
}
