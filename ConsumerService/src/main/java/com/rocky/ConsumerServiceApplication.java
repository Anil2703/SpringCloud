package com.rocky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class ConsumerServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumerServiceApplication.class);

    public static void main(String[] args) {
        log.info("🚀 Starting ConsumerService...");
        SpringApplication.run(ConsumerServiceApplication.class, args);
        log.info("✅ ConsumerService started");
    }
}
