package com.kriswern.pokemonservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class SimplifiedPokemon {

    String name;
    String url;
    //no reason to save the url in this case but I'll do it anyway.

    @JsonCreator
    public SimplifiedPokemon(@JsonProperty("name") String name, @JsonProperty("url") String url) {
        this.name = name;
        this.url = url;
    }
}
