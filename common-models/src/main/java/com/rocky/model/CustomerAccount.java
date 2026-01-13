package com.rocky.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CustomerAccount {

    // Identifiers
    private String enterprisePartyId;
    private String accountId;
    private String accountNumber;

    // Relationship & lifecycle
    private LocalDate customerRelationshipStartDate;
    private LocalDate accountOpenDate;
    private LocalDate accountCloseDate;

    // Classification
    private String accountType;
    private String accountStatus;
    private String currencyCode;

    // Financials
    private BigDecimal availableBalance;
    private BigDecimal ledgerBalance;
    private BigDecimal overdraftLimit;

    // Compliance & ownership
    private String kycStatus;
    private boolean primaryAccountHolder;

    // Servicing
    private String branchCode;
    private String relationshipManagerId;

    public String getEnterprisePartyId() {
        return enterprisePartyId;
    }

    public void setEnterprisePartyId(String enterprisePartyId) {
        this.enterprisePartyId = enterprisePartyId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getCustomerRelationshipStartDate() {
        return customerRelationshipStartDate;
    }

    public void setCustomerRelationshipStartDate(LocalDate customerRelationshipStartDate) {
        this.customerRelationshipStartDate = customerRelationshipStartDate;
    }

    public LocalDate getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(LocalDate accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public LocalDate getAccountCloseDate() {
        return accountCloseDate;
    }

    public void setAccountCloseDate(LocalDate accountCloseDate) {
        this.accountCloseDate = accountCloseDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public BigDecimal getLedgerBalance() {
        return ledgerBalance;
    }

    public void setLedgerBalance(BigDecimal ledgerBalance) {
        this.ledgerBalance = ledgerBalance;
    }

    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public boolean isPrimaryAccountHolder() {
        return primaryAccountHolder;
    }

    public void setPrimaryAccountHolder(boolean primaryAccountHolder) {
        this.primaryAccountHolder = primaryAccountHolder;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getRelationshipManagerId() {
        return relationshipManagerId;
    }

    public void setRelationshipManagerId(String relationshipManagerId) {
        this.relationshipManagerId = relationshipManagerId;
    }
}
