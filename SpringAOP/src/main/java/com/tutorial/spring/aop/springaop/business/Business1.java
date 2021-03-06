package com.tutorial.spring.aop.springaop.business;

import com.tutorial.spring.aop.springaop.aspect.TrackTime;
import com.tutorial.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

  @Autowired
  private Dao1 dao1;

  @TrackTime
  public String calculateSomething() {
    // Business Logic
    return dao1.retrieveSomething();
  }
}
