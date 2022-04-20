package com.paymennt.Payment.Demo.model;

import com.paymennt.Payment.Demo.util.ExternalAccountSubType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NGNAccount {

    private String externalAccountId;
    private String bvn;
    private String accountNumber;
    private String primaryBank;
    private String accountName;
    private ExternalAccountSubType externalAccountSubType;
}

