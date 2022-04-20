package com.paymennt.Payment.Demo.util;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Name {

    @ToString.Exclude
    private String username;

    @ToString.Exclude
    private String firstName;

    @ToString.Exclude
    private String lastName;
}
