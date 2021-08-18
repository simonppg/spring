package com.spring.basics.tutorial;

import com.spring.basics.tutorial.properties.SomeExternalService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {
  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesApplication.class)) {

      SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

      System.out.println(service);
      System.out.println(service.returnServiceURL());
    }
  }
}
