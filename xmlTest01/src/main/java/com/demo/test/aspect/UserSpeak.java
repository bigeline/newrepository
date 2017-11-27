package com.demo.test.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class UserSpeak {

    public void beforeSpeak() {
        System.out.println("之前说话");
    }

    public Object around(ProceedingJoinPoint jp) {
        Object result = null;
        try {
            System.out.println("环绕通知前置通知");
            result = jp.proceed();
            System.out.println("环绕通知后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

    public void afterSpeak() {
        System.out.println("之后说话");
    }
}
