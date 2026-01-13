package com.rocky.controller;

import com.rocky.model.CustomerAccount;
import com.rocky.service.CustomerAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class CustomerAccountController {

    private final CustomerAccountService customerAccountService;

    public CustomerAccountController(CustomerAccountService customerAccountService) {
        this.customerAccountService = customerAccountService;
    }

    @GetMapping("/test")
    public CustomerAccount getTestCustomerAccount() throws InterruptedException {
        return customerAccountService.getTestCustomerAccount();
    }
}
