package com.spring.basics.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.spring.basics.componentscan")
public class ComponentScanApplication {
  private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanApplication.class)) {

      ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

      LOGGER.info("{}", componentDao);
    }
  }
}
