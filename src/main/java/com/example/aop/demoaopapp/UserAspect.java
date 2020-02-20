package com.example.aop.demoaopapp;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class UserAspect {


    @Autowired(required = false)
    private HttpServletRequest request;

    private Logger logger= LoggerFactory.getLogger(UserAspect.class);

    @Before(value = "execution(* com.example.aop.demoaopapp.UserResource.*(..)) and args(object)")
    public void beforeAdvice(JoinPoint joinPoint, Object object) {

        System.out.println("-------request begin--------------");
        System.out.println("endpoint "+request.getRequestURI()+" called with input parameter  :" + object.toString());
        System.out.println("-------request end--------------");

    }


    @After(value = "execution(* com.example.aop.demoaopapp.UserResource.*(..)) and args(object)")
    public void afterAdvice(JoinPoint joinPoint,Object object) {
        System.out.println("-------response begin--------------");

        System.out.println("response - "+object.toString());
        System.out.println("-------response end--------------");

    }


}
