package com.example.aop.demoaopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class DemoAopAppApplication {

 	public static void main(String[] args) {
		SpringApplication.run(DemoAopAppApplication.class, args);
	}

}
