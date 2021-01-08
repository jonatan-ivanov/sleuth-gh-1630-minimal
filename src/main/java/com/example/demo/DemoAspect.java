package com.example.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
	private static final Logger log = LoggerFactory.getLogger(DemoAspect.class);

	@Before("execution(* com.example.demo.DemoService.now())")
	public void beforeNow() {
		log.info("beforeNow");
	}

	@Before("execution(* com.example.demo.DemoService.startedAt())")
	public void beforeStartedAt() {
		log.info("beforeStartedAt");
	}
}
