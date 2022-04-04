package com.example.webflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class PokemonClient {

	private final WebClient client;

  public PokemonClient(WebClient.Builder builder) {
    this.client = builder.baseUrl("https://pokeapi.co/api/v2").build();
  }

  public Mono<Pokemon> getPokemon(String pokemonName) {
    return this.client.get().uri("/pokemon/"+pokemonName).accept(MediaType.APPLICATION_JSON)
      .retrieve()
      .bodyToMono(Pokemon.class);
  }
}
