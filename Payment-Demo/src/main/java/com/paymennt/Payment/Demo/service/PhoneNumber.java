package com.paymennt.Payment.Demo.service;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    private String phoneId;

    private String country;

    @ToString.Exclude
    private String number;

    private String countryCode;

    @ToString.Exclude
    private String uniquePhoneNumber; // country code plus number

    private Boolean verified;
}

