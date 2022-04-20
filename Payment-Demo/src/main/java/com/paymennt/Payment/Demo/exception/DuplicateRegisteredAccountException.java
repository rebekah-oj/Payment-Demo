package com.paymennt.Payment.Demo.exception;

public class DuplicateRegisteredAccountException extends RuntimeException {
    public DuplicateRegisteredAccountException(String msg) {
        super(msg);
    }
}
