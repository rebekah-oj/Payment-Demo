package com.paymennt.Payment.Demo.model;

import com.mongodb.lang.Nullable;

import java.util.Date;

public class User {
    private final String handle;
    private final String firstName;
    private final String lastName;
    private final String address;
    private final String address2;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String phone;
    private final String email;
    private final String identityNumber;
    private final String cryptoAddress;
    private final Date birthdate;
    private final String country;
    private final boolean smsOptIn;
    private final String deviceFingerprint;

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, boolean smsOptIn) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = "US";
        this.smsOptIn = smsOptIn;
        this.deviceFingerprint = null;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, String country, boolean smsOptIn) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = country;
        this.smsOptIn = smsOptIn;
        this.deviceFingerprint = null;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = "US";
        this.smsOptIn = false;
        this.deviceFingerprint = null;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, String country) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = country;
        this.smsOptIn = false;
        this.deviceFingerprint = null;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, boolean smsOptIn, String deviceFingerprint) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = "US";
        this.smsOptIn = smsOptIn;
        this.deviceFingerprint = deviceFingerprint;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, String country, boolean smsOptIn, String deviceFingerprint) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = country;
        this.smsOptIn = smsOptIn;
        this.deviceFingerprint = deviceFingerprint;
    }

    public User(String handle, String firstName, String lastName, String address, @Nullable String address2, String city, String state, String zipCode, String phone, String email, String identityNumber, String cryptoAddress, Date birthdate, String country, String deviceFingerprint) {
        this.handle = handle;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.identityNumber = identityNumber;
        this.cryptoAddress = cryptoAddress;
        this.birthdate = birthdate;
        this.country = country;
        this.smsOptIn = false;
        this.deviceFingerprint = deviceFingerprint;
    }

    public String getHandle() {
        return this.handle;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public String getCryptoAddress() {
        return this.cryptoAddress;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public String getCountry() {
        return this.country;
    }

    public boolean isSmsOptIn() {
        return this.smsOptIn;
    }

    public String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }
}

