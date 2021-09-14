package com.springsecurity.tutorial.securityapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * PasswordConfig
 */
@Configuration
public class PasswordConfig {
  private int strength = 10;

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(strength);
  }
}
