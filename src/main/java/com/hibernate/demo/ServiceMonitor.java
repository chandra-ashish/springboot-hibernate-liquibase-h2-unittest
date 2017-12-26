package com.hibernate.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Component;

/**
 * @author wanli zhou
 * @created 2017-12-14 10:33 PM.
 */
@Aspect
@Component
public class ServiceMonitor {
    @Autowired
    private CounterService counterService;
    @Before("execution(* com.hibernate.demo.*.*(..))")
    public void countServiceInvoke(JoinPoint joinPoint) {
        counterService.increment(joinPoint.getSignature() + "");
    }
}