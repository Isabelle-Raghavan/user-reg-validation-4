package com.example.project;


public class Address {
    private String street;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address(String street, String addressLine2, String city, String state, String country, String zipCode) {
        this.street = street;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public boolean validateAddress() {
        // Implement validation logic for address
        if (isFieldValid(street) &&
                isFieldValid(addressLine2) &&
                isFieldValid(city) &&
                isFieldValid(state) &&
                isFieldValid(country) &&
                isFieldValid(zipCode)) {
            // All fields are valid
            return true;
        }
        return false;
    }

    static boolean isFieldValid(String field) {
        return field != null && field.length() <= 256 && field.matches("^[a-zA-Z0-9 ]*$");
    }

    // Add validation for other fields here
}
