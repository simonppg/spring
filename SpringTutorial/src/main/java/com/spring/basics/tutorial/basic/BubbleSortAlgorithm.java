package com.spring.basics.tutorial.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers) {
    return numbers;
  }
}
