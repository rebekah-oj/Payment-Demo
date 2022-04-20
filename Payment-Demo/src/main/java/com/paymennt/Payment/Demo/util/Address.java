package com.paymennt.Payment.Demo.util;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String addressId;

    @ToString.Exclude
    private List<String> addressLines;

    @ToString.Exclude
    private String city;

    @ToString.Exclude
    private String state;

    @ToString.Exclude
    private String country;

    @ToString.Exclude
    private String postalCode;

    private String type;

    private Boolean verified;
}

