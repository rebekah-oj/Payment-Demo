package com.paymennt.Payment.Demo.util;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String emailId;

    @ToString.Exclude
    private String email;

    private Boolean verified;
}

