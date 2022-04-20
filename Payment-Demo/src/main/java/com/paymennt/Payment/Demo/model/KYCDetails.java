package com.paymennt.Payment.Demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KYCDetails {

    private String entityType;
    private String verificationStatus;
    private List<VerificationInfo> verificationHistory;
    private List<String> validKycLevels;
    private String certificationStatus;
    private List<String> certificationHistory;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VerificationInfo {
        private String verificationId;
        private String verificationStatus;
        private String kycLevel;
        private int requestedAt;
        private int updatedAt;
        private List<String> reasons;
        private List<String> tags;
        private float score;
        private VerificationInfo parentVerification;
    }
}
