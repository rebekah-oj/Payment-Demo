package com.paymennt.Payment.Demo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WalletRegistrationDTO {

    @NotNull
    private WalletCurrency walletCurrency;
    @NotNull
    private TroperialWalletType walletType;

    private Boolean isPrimary;

    public enum WalletCurrency {
        NGN,
    }

    public enum TroperialWalletType {
        ONE_PIPE
    }
}