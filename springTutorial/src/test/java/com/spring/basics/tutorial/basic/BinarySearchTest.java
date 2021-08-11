package com.spring.basics.tutorial.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.spring.basics.tutorial.BasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

// Use spring runner
@ExtendWith(SpringExtension.class)
//Load the context
@ContextConfiguration(classes=BasicApplication.class)
public class BinarySearchTest {

  // Get this bean from the context
  @Autowired
  BinarySearchImpl binarySearch;

  @Test
  public void testBasicScenario() {
    int result = binarySearch.binarySearch(new int[]{}, 5);
    assertEquals(3, result);
  }
}

