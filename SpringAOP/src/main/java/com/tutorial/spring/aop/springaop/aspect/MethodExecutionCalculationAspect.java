package com.tutorial.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  //execution(* PACKAGE.*.*(..))
  @Around("com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
  public void around(ProceedingJoinPoint joinPoint) throws Throwable {
    long startTime = System.currentTimeMillis();
    joinPoint.proceed();
    long timeTaken = System.currentTimeMillis() - startTime;

    logger.info("Time Taken by {} {} miliseconds", joinPoint, timeTaken);
  }
}
