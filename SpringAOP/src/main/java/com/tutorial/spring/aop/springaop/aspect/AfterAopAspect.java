package com.tutorial.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  //execution(* PACKAGE.*.*(..))
  @AfterReturning(
  value = "com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
  returning = "result"
  )
  public void afterReturning(JoinPoint joinPoint, Object result) {
    logger.info("{} returned with value {}", joinPoint, result);
  }

  @AfterThrowing(
  value = "com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()",
  throwing = "exception"
  )
  public void afterTrhowing(JoinPoint joinPoint) {
    logger.info("{} trhow exception {}", joinPoint);
  }

  @After( value = "com.tutorial.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
  public void after(JoinPoint joinPoint) {
    logger.info("after execution of {}", joinPoint);
  }
}
