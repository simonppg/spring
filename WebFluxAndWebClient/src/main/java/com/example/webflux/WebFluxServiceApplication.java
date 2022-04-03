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
  }
}
