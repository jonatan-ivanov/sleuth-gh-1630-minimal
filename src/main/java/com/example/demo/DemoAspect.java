package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class DemoAspect {
	@Before("execution(* com.example.demo.DemoService.now())")
	public void beforeNow() {
		log.info("beforeNow");
	}

	@Before("execution(* com.example.demo.DemoService.startedAt())")
	public void beforeStartedAt() {
		log.info("beforeStartedAt");
	}
}
