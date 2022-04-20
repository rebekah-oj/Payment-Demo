package com.paymennt.Payment.Demo.service;

import com.paymennt.Payment.Demo.dto.KYCCheckResponseDTO;
import com.paymennt.Payment.Demo.dto.WalletRegistrationDTO;
import com.paymennt.Payment.Demo.exception.AccountDuplicateException;
import com.paymennt.Payment.Demo.exception.DuplicateRegisteredAccountException;
import com.paymennt.Payment.Demo.model.Account;
import com.paymennt.Payment.Demo.response.CheckKYCResponse;
import com.paymennt.Payment.Demo.util.MoneyMapper;
import com.paymennt.Payment.Demo.model.NGNAccount;
import com.paymennt.Payment.Demo.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{

    @Autowired
    private RestTemplate restTemplate;

    private final MoneyMapper moneyMapper;

    private AccountRepository accountRepository;

    @Override
    public Optional<Account> findByAccountId(String accountId) {
        return accountRepository.findByAccountId(accountId);
    }

    @Override
    public Account createNewAccount(Account newAccount) {
        try{

            return accountRepository.save(newAccount);
        }catch (DuplicateKeyException duplicateKeyException){
            throw new AccountDuplicateException(duplicateKeyException.getMessage());
        }
    }

    @Override
    public Set<NGNAccount> registerNGNAccount(Account account, NGNAccount ngnAccount) {
        ngnAccount.setExternalAccountId(UUID.randomUUID().toString());

        Set<NGNAccount> ngnAccounts = account.getNgnAccounts();

        if (ngnAccounts == null){
            ngnAccounts = Collections.singleton(ngnAccount);
        }
        else {
            boolean matchingAccountFound = ngnAccounts
                    .stream()
                    .anyMatch(accountLambda ->
                            accountLambda.getAccountName().equals(ngnAccount.getAccountNumber()) ||
                            accountLambda.getBvn().equals(ngnAccount.getBvn()) &&
                            accountLambda.getPrimaryBank().equals(ngnAccount.getPrimaryBank())
                    );
            if (matchingAccountFound){
                throw new DuplicateRegisteredAccountException("Provided account has already been registered");
            }else{
                ngnAccounts.add(ngnAccount);
            }
        }
        account.setNgnAccounts(ngnAccounts);
        Account savedAccount = accountRepository.save(account);
        return savedAccount.getNgnAccounts();
    }

    @Override
    public void registerWallets(Account accountToUpdate, List<WalletRegistrationDTO> walletRegistrationDTO) {

    }

    @Override
    public KYCCheckResponseDTO checkKyc(Account account) {

        CheckKYCResponse checkKYCResponse = moneyMapper.
        return null;
    }
}
