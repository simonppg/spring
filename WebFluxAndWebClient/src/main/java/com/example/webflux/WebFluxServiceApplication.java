package com.example.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebFluxServiceApplication {
  public static void main(String[] args){
    ConfigurableApplicationContext contex = SpringApplication.run(WebFluxServiceApplication.class, args);

    GreetingClient greetingClient = contex.getBean(GreetingClient.class);
    System.out.println(">> message = " + greetingClient.getMessage().block());
    System.out.println(">> message = " + greetingClient.getGreeting().block());
    System.out.println(">> message = " + greetingClient.getGreeting().block().getMessage());
    System.out.println(">> message = " + greetingClient.getGreeting().block().getMessage());

    PokemonClient pokemonClient= contex.getBean(PokemonClient.class);
    showPokemon(pokemonClient.getPokemon("ditto").block());
    showPokemon(pokemonClient.getPokemon("pikachu").block());
  }

  private static void showPokemon(Pokemon pokemon){
    System.out.println("name = " + pokemon.getName());
    System.out.println("id = " + pokemon.getId());
  }

}
