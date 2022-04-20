package com.paymennt.Payment.Demo.util;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Verification {
    @SerializedName("verification_id")
    private String verificationId;
    @SerializedName("verification_status")
    private String verificationStatus;
    @SerializedName("kyc_level")
    private String kycLevel;
    @SerializedName("requested_at")
    private int requestedAt;
    @SerializedName("updated_at")
    private int updatedAt;
    private List<String> reasons;
    private List<String> tags;
    private float score;
    @SerializedName("parent_verification")
    private Verification parentVerification;

    public Verification() {
    }

    public String getVerificationId() {
        return this.verificationId;
    }

    public void setVerificationId(String verificationId) {
        this.verificationId = verificationId;
    }

    public String getVerificationStatus() {
        return this.verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getKycLevel() {
        return this.kycLevel;
    }

    public void setKycLevel(String kycLevel) {
        this.kycLevel = kycLevel;
    }

    public int getRequestedAt() {
        return this.requestedAt;
    }

    public void setRequestedAt(int requestedAt) {
        this.requestedAt = requestedAt;
    }

    public int getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<String> getReasons() {
        return this.reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public float getScore() {
        return this.score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Verification getParentVerification() {
        return this.parentVerification;
    }

    public void setParentVerification(Verification parentVerification) {
        this.parentVerification = parentVerification;
    }
}
