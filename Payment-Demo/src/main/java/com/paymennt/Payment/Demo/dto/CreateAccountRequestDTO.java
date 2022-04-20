package com.paymennt.Payment.Demo.dto;

import com.paymennt.Payment.Demo.util.AccountType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CreateAccountRequestDTO {

    @NotNull
    private AccountType accountType;

    @NotBlank
    private String customerId;
}
