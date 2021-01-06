package com.example.demo;

import java.time.Instant;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private final Instant startedAt = Instant.now();

	Instant startedAt() {
		return startedAt;
	}

	public Instant now() {
		return Instant.now();
	}
}
