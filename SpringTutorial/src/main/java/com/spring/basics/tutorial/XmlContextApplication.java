package com.spring.basics.tutorial;

import com.spring.basics.tutorial.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlContextApplication {
  private static Logger LOGGER = LoggerFactory.getLogger(XmlContextApplication.class);

  public static void main(String[] args) {
    try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

      LOGGER.info("Beans Loaded {}", (Object) applicationContext.getBeanDefinitionNames());

      XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

      LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
    }
  }
}
