package com.spring.basics.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.tutorial.scope.PersonDAO;

@Configuration
@ComponentScan
public class ScopeApplication {
  private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScopeApplication.class)){
      PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
      PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

      System.out.println(personDao);

      LOGGER.info("{}", personDao);
      LOGGER.info("{}", personDao.getJdbcConnection());

      LOGGER.info("{}", personDao2);
      LOGGER.info("{}", personDao2.getJdbcConnection());
    }
  }
}
