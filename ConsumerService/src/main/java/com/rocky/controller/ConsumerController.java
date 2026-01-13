package com.rocky.controller;

import com.rocky.model.CustomerAccount;
import com.rocky.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consume")
public class ConsumerController {

    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/account")
    public CustomerAccount getAccountFromProducer() {
        return consumerService.fetchTestAccountFromProducer();
    }
}
