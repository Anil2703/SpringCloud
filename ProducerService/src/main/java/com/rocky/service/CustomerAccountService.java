package com.rocky.service;

import com.rocky.model.CustomerAccount;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class CustomerAccountService {

    public CustomerAccount getTestCustomerAccount() {

        CustomerAccount account = new CustomerAccount();

        // Identifiers
        account.setEnterprisePartyId("EP123456789");
        account.setAccountId(UUID.randomUUID().toString());
        account.setAccountNumber("123456789012");

        // Relationship & lifecycle
        account.setCustomerRelationshipStartDate(LocalDate.of(2015, 3, 10));
        account.setAccountOpenDate(LocalDate.of(2018, 6, 15));
        account.setAccountCloseDate(null); // Active account

        // Classification
        account.setAccountType("SAVINGS-ProducerService");
        account.setAccountStatus("ACTIVE");
        account.setCurrencyCode("INR");

        // Financials
        account.setAvailableBalance(new BigDecimal("125000.50"));
        account.setLedgerBalance(new BigDecimal("130000.50"));
        account.setOverdraftLimit(BigDecimal.ZERO);

        // Compliance & ownership
        account.setKycStatus("VERIFIED");
        account.setPrimaryAccountHolder(true);

        // Servicing
        account.setBranchCode("HYD001");
        account.setRelationshipManagerId("RM98765");

        return account;
    }
}
