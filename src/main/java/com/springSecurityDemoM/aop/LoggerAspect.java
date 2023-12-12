package com.springSecurityDemoM.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class LoggerAspect {
    static final Logger logger = LoggerFactory.getLogger(LoggerAspect.class);

    @Around("@annotation(com.springSecurityDemoM.annotation.MyLogger)")
    public Object log(final ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Entering method: {}", joinPoint.getSignature().getName());
        return joinPoint.proceed();
    }
}
