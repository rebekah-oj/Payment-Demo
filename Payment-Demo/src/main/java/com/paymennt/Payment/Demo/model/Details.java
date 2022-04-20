package com.paymennt.Payment.Demo.model;

import com.paymennt.Payment.Demo.service.PhoneNumber;
import com.paymennt.Payment.Demo.util.Address;
import com.paymennt.Payment.Demo.util.Email;
import com.paymennt.Payment.Demo.util.Name;
import com.paymennt.Payment.Demo.util.NationalityIdentifier;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.hibernate.validator.constraints.UniqueElements;


import java.time.LocalDate;
import java.util.List;

@Data
public class Details {

    @Id
    private String id;
    private String customerId;
    private String accountId;

    private Name name;

    @ToString.Exclude
    private LocalDate dateOfBirth;

    @UniqueElements
    private List<Address> address;

    @UniqueElements
    private List<PhoneNumber> phoneNumber;

    @UniqueElements
    private List<Email> emailAddress;

    @UniqueElements
    private NationalityIdentifier nationalityIdentifier;

}
