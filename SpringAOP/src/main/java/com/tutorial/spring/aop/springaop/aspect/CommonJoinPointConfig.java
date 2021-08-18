package com.tutorial.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
  @Pointcut("execution(* com.tutorial.spring.aop.springaop.data.*.*(..))")
  public void dataLayerExecution() { }

  @Pointcut("execution(* com.tutorial.spring.aop.springaop.business.*.*(..))")
  public void businessLayerExecution() { }

  @Pointcut("com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution() && com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
  public void allLayerExecution() { }

  @Pointcut("bean(dao*)")
  public void beanStartingWithDao() { }

  @Pointcut("bean(*dao*)")
  public void beanContainingDao() { }

  @Pointcut("within(com.tutorial.spring.aop.springaop.data..*)")
  public void dataLayerExecutionWithWithin() { }

  @Pointcut("@annotation(com.tutorial.spring.aop.springaop.aspect.TrackTime)")
  public void trackTimeAnnotation() { }
}
