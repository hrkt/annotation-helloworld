package io.hrkt.annotation_helloworld.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintHelloWorldAspect {
    private final Logger logger = LoggerFactory
            .getLogger(PrintHelloWorldAspect.class);

    @Pointcut("execution(public * *(..))")
    public void anyPublicMethod() {
    }

    @Around("anyPublicMethod() && @annotation(phw)")
    public void startAProcess(ProceedingJoinPoint pjp, PrintHelloWorld phw)
            throws Throwable {
        logger.info(phw.message());
    }
}