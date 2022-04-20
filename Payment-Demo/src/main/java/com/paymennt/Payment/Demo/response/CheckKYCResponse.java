package com.paymennt.Payment.Demo.response;

import com.google.gson.annotations.SerializedName;
import com.paymennt.Payment.Demo.util.Verification;
import com.paymennt.Payment.Demo.util.Member;

import java.util.List;

public class CheckKYCResponse extends BaseResponse {
    @SerializedName("entity_type")
    private String entityType;
    @SerializedName("verification_status")
    private String verificationStatus;
    @SerializedName("verification_history")
    private List<Verification> verificationHistory;
    @SerializedName("valid_kyc_levels")
    private List<String> validKycLevels;
    @SerializedName("certification_status")
    private String certificationStatus;
    @SerializedName("certification_history")
    private List<String> certificationHistory;
    private List<Member> members;

    public CheckKYCResponse() {
    }

    public String getEntityType() {
        return this.entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public List<Verification> getVerificationHistory() {
        return this.verificationHistory;
    }

    public void setVerificationHistory(List<Verification> verificationHistory) {
        this.verificationHistory = verificationHistory;
    }

    public List<String> getValidKycLevels() {
        return this.validKycLevels;
    }

    public void setValidKycLevels(List<String> validKycLevels) {
        this.validKycLevels = validKycLevels;
    }

    public String getCertificationStatus() {
        return this.certificationStatus;
    }

    public void setCertificationStatus(String certificationStatus) {
        this.certificationStatus = certificationStatus;
    }

    public List<String> getCertificationHistory() {
        return this.certificationHistory;
    }

    public void setCertificationHistory(List<String> certificationHistory) {
        this.certificationHistory = certificationHistory;
    }

    public List<Member> getMembers() {
        return this.members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}

