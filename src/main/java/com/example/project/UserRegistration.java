package com.example.project;

public class UserRegistration {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private Address address;

    // Constructors

    public UserRegistration(String firstName, String lastName, String emailAddress, String phoneNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Validation Methods

    public boolean validatetName(String name) {
        // Implement validation logic for first name
        // Should not be empty, and should have a max length of 256 characters
        // Allow alphabetic characters, spaces, hyphens, and apostrophes
        // Return true if valid, false otherwise
        return false;
    }

    public boolean validateEmailAddress(String email) {
        // Implement validation logic for email address
        // Should match the username@domain.com format
        // Allow letters, numbers, dots ".", hyphens "-", hash "#," and underscores "_"
        // Return true if valid, false otherwise
        return false;
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        // Implement validation logic for phone number
        // Should consist of ten digits
        // Return true if valid, false otherwise
        return false;
    }

    // Add  methods for address validation

}
