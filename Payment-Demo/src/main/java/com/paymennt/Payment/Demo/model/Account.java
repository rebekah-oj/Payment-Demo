package com.paymennt.Payment.Demo.model;

import com.paymennt.Payment.Demo.util.AccountStateReasonCode;
import com.paymennt.Payment.Demo.util.AccountType;
import lombok.Data;

import java.time.Instant;
import java.util.Set;

@Data
public class Account {

    private String id;

    private String accountId;
    private String customerId;
    private AccountType accountType;
    private Customer customer;
    private Details details;
    private Boolean isActive;

    private Set<NGNAccount> ngnAccounts;
    private Set<AccountStateReasonCode> accountStateReasonCodes;

    private Long listedTransactions;
    private Long completedTransactions;

    private Instant accountInactiveDate;
    private Instant accountClosedDate;
    private Instant accountSuspendedDate;

    private Instant createdDate; // accountActiveDate;
    private Instant lastModifiedDate;

}
