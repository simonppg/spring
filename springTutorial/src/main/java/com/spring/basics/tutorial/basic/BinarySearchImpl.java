package com.spring.basics.tutorial.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

  private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class);

  @Autowired
  @Qualifier("bubble")
  private SortAlgorithm sortAlgorithm;

  public int binarySearch(int[] numbers, int numberToSearchFor) {
    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    System.out.println(sortAlgorithm);
    System.out.println(sortedNumbers);

    return 3;
  }

  @PostConstruct
  public void postConstruct() {
    logger.info("postConstruct");
  }

  @PreDestroy
  public void preDestroy(){
    logger.info("preDestroy");
  }
}
