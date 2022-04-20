package com.paymennt.Payment.Demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDTO {

    private String troperialUserHandle; // from api
    // all other fields to be retrieved from persons service
    private String firstName;
    private String lastName;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String stateIso2;
    private String postalCode;
    private String phone;
    private String email;
    private String fullSSN;
    private String cryptoAddress;
    private Date birthDate;
    private String countryIso2;

}
