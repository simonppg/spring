package com.spring.basics.tutorial;

import com.spring.basics.tutorial.basic.BinarySearchImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BasicApplication {
  public static void main(String[] args) {
    try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicApplication.class)) {

      BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
      BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

      System.out.println(binarySearch);
      System.out.println(binarySearch2);

      int result = binarySearch.binarySearch(new int[] { 1, 3, 2 }, 5);
      System.out.println(result);
    }
  }
}
