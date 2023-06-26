package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Mendy
 * @create 2023-06-26 10:11
 */

@Component
@Aspect

public class ProjectAdvice {
    // match to all methods in service layer
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    public void servicePt(){

    }

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
//        System.out.println(signature.getDeclaringType());
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();


        long start = System.currentTimeMillis();

        for (int i = 0; i <10000 ; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println("Execution time of ten thousand calls to "+ className + "'s " + methodName + " method was: " + (end-start) + "ms");


    }

}
