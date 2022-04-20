package com.paymennt.Payment.Demo.model;

import com.paymennt.Payment.Demo.service.PhoneNumber;
import com.paymennt.Payment.Demo.util.Email;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Customer {

    @Id
    private String id;
    private String customerId;
    private String accountId;

    private String firstName;
    private String surname;
    private Email email;
    private PhoneNumber number;
}
