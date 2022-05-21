package com.kriswern.pokemonservice.configuration;

import com.kriswern.pokemonservice.remote.PokemonRemote;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {

    @Bean
    public WebClient pokemonWebClient () {
        return WebClient.builder().baseUrl("https://pokeapi.co/api/v2/")
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(configurer -> configurer
                                        .defaultCodecs()
                                        .maxInMemorySize(16 * 1024 * 1024))
                        .build())
                .build();



        //TODO get url from application properties
    }

    @Bean
    public PokemonRemote pokemonRemote() {return new PokemonRemote(pokemonWebClient());
    }
}
