package com.ssmTest.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Aspect01 {

    @Pointcut("execution(* com.ssmTest.demo.service.ServiceTest01.getAllUser(..))")
    public void serviceTest01() {
    }

    @Before("serviceTest01()")
    public void beforeMethod() {
        System.out.println("前置通知");
    }

    @Around("serviceTest01()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知前");
            result = joinPoint.proceed();
            System.out.println("环绕通知后");
        } catch (Throwable throwable) {
            System.out.println("环绕通知出错");
            throwable.printStackTrace();
        }
        return result;
    }

    @After("serviceTest01()")
    public void afterMethod() {
        System.out.println("后置通知");
    }
}
