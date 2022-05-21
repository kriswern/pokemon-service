package com.kriswern.pokemonservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class Sprites {

    String frontDefault;

    //front_default
    @JsonCreator
    public Sprites(@JsonProperty("front_default") String frontDefault) {
        this.frontDefault = frontDefault;
    }
}
