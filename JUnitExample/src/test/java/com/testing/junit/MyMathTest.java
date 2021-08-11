package com.testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyMathTest {

  MyMath myMath = new MyMath();

  @BeforeEach
  public void before() {
    System.out.println("BeforeEach");
  }

  @AfterEach
  public void after() {
    System.out.println("AfterEach");
  }

  @BeforeAll
  public static void beforeAll() {
    System.out.println("BeforeAll");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("AfterAll");
  }

  @Test
  public void sum_with3numbers() {
    assertEquals(6, myMath.sum(new int []{1,2,3}));
  }

  @Test
  public void sum_with1number() {
    assertEquals(3, myMath.sum(new int []{3}));
  }
}
