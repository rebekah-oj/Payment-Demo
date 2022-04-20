package com.paymennt.Payment.Demo.dto;

import com.paymennt.Payment.Demo.model.Customer;
import com.paymennt.Payment.Demo.model.Details;
import com.paymennt.Payment.Demo.util.Gender;
import com.paymennt.Payment.Demo.service.Title;
import lombok.Data;

import java.util.List;

@Data
public class AccountResponseDTO {

    private String accountNumber;
    private List<Gender> gender;
    private List<Title> titles;
    private List<Customer> customers;
    private Details details;
}
