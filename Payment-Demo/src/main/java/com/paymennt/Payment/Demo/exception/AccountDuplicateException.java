package com.paymennt.Payment.Demo.exception;

public class AccountDuplicateException extends RuntimeException {

    public AccountDuplicateException(String message) {
        super(message);
    }
}
