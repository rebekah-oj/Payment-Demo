package com.paymennt.Payment.Demo.service;

import com.paymennt.Payment.Demo.dto.KYCCheckResponseDTO;
import com.paymennt.Payment.Demo.dto.WalletRegistrationDTO;
import com.paymennt.Payment.Demo.model.Account;
import com.paymennt.Payment.Demo.model.NGNAccount;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface AccountService {

    Optional<Account> findByAccountId(String accountId);

    Account createNewAccount(Account newAccount);

    Set<NGNAccount> registerNGNAccount(Account accountToUpdate, NGNAccount ngnAccount);

    void registerWallets(Account accountToUpdate, List<WalletRegistrationDTO> walletRegistrationDTO);

    KYCCheckResponseDTO checkKyc(Account account);

}
