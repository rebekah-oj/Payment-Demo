package com.paymennt.Payment.Demo.response;

public class BaseResponse {
    private String reference;
    private String message;
    private String status;
    private Boolean success;

    public BaseResponse() {
    }

    public String getReference() {
        return this.reference;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}

