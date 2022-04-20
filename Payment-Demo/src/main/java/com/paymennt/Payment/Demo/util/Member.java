package com.paymennt.Payment.Demo.util;

import com.google.gson.annotations.SerializedName;

public class Member {
    @SerializedName("user_handle")
    private String userHandle;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    private String role;
    private String details;
    @SerializedName("ownership_stake")
    private Float ownershipStake;
    @SerializedName("verification_status")
    private String verificationStatus;
    @SerializedName("verification_required")
    private String verificationRequired;
    @SerializedName("verification_id")
    private String verificationId;
    @SerializedName("beneficial_owner_certification_status")
    private String beneficialOwnerCertificationStatus;
    @SerializedName("business_certification_status")
    private String businessCertificationStatus;

    public Member() {
    }

    public String getUserHandle() {
        return this.userHandle;
    }

    public void setUserHandle(String userHandle) {
        this.userHandle = userHandle;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getOwnershipStake() {
        return this.ownershipStake;
    }

    public void setOwnershipStake(Float ownershipStake) {
        this.ownershipStake = ownershipStake;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getVerificationRequired() {
        return this.verificationRequired;
    }

    public void setVerificationRequired(String verificationRequired) {
        this.verificationRequired = verificationRequired;
    }

    public String getVerificationId() {
        return this.verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getBeneficialOwnerCertificationStatus() {
        return this.beneficialOwnerCertificationStatus;
    }

    public void setBeneficialOwnerCertificationStatus(String beneficialOwnerCertificationStatus) {
        this.beneficialOwnerCertificationStatus = beneficialOwnerCertificationStatus;
    }

    public String getBusinessCertificationStatus() {
        return this.businessCertificationStatus;
    }

    public void setBusinessCertificationStatus(String businessCertificationStatus) {
        this.businessCertificationStatus = businessCertificationStatus;
    }
}

