package com.rocky.service;

import com.rocky.ConsumerServiceApplication;
import com.rocky.model.CustomerAccount;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    private static final Logger log = LoggerFactory.getLogger(ConsumerService.class);

    private final RestTemplate restTemplate;

    @Value("${producer.base-url}")
    private String producerBaseUrl;

    public ConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /*public CustomerAccount fetchTestAccountFromProducer() {
        String url = producerBaseUrl + "/api/accounts/test";
        return restTemplate.getForObject(url, CustomerAccount.class);
    }*/

    // Using service name directly with load balancer
    //producer-service is the service name registered in service registry like Eureka [spring.application.name]
    //@Retryable to handle transient failures, like timeouts or connection issues
    @Retryable(
            retryFor = { ResourceAccessException.class }, // timeouts, connection issues
            maxAttempts = 3,
            backoff = @Backoff(delay = 500, multiplier = 2)
    )

    // Circuit Breaker to handle persistent failures
    @CircuitBreaker(name = "producerServiceCB", fallbackMethod = "producerFallback")
    public CustomerAccount fetchTestAccountFromProducer() {
        log.info("Calling Producer via Eureka...");
        return restTemplate.getForObject(
                "http://producer-service/producer/api/accounts/test",
                CustomerAccount.class
        );
    }

    // ✅ Fallback MUST have same params + Throwable at end
    public CustomerAccount producerFallback(Throwable ex) {
        CustomerAccount fallback = new CustomerAccount();
        fallback.setEnterprisePartyId("N/A");
        fallback.setAccountId("N/A");
        fallback.setAccountNumber("N/A");
        fallback.setAccountType("UNKNOWN");
        fallback.setAccountStatus("PRODUCER_UNAVAILABLE");
        fallback.setCurrencyCode("INR");
        fallback.setKycStatus("UNKNOWN");
        fallback.setPrimaryAccountHolder(false);
        return fallback;
    }
}
