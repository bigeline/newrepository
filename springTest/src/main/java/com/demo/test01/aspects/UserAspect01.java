package com.demo.test01.aspects;

public class UserAspect01 {
    public void before() {
        System.out.println("前置通知");
    }

    public void after() {
        System.out.println("后置通知");
    }
}
