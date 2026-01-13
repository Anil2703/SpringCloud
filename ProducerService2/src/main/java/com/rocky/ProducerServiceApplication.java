package com.rocky;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerServiceApplication {

    private static final Logger log =
            LoggerFactory.getLogger(ProducerServiceApplication.class);

    public static void main(String[] args) {
        log.info("🚀 Starting ProducerServiceApplication...");
        SpringApplication.run(ProducerServiceApplication.class, args);
        log.info("✅ ProducerServiceApplication started successfully");
    }
}

