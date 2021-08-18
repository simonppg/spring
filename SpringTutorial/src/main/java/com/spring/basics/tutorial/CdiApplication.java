package com.spring.basics.tutorial;

import com.spring.basics.tutorial.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdiApplication {
  private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdiApplication.class))
    {
      SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

      LOGGER.info("{} dao-{}", business, business.getSomeCdiDao());
    }
  }
}
