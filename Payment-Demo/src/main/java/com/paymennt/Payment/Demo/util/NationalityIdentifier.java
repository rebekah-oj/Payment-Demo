package com.paymennt.Payment.Demo.util;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NationalityIdentifier {
    private String nationalIdentifierId;

    @ToString.Exclude
    private String nationalId;

    @ToString.Exclude
    private String lastFour;

    private NationalIdType type;

    private String countryCode;
}

