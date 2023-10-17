package com.example.project;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserRegistration {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String phoneNumber;
    private final Address address;
    private final String birthday;

    // Constructors

    public UserRegistration(String firstName, String lastName, String emailAddress, String phoneNumber, Address address, String birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthday = birthday;
    }

    // Validation Methods

    public static boolean validateName(String name) {
        // Implement validation logic for first name
        // Should not be empty, and should have a max length of 256 characters
        if (name == null || name.isEmpty() || name.length() > 256) {
            return false;
        }
        // Allow alphabetic characters, spaces, hyphens, and apostrophes
        return name.matches("^[a-zA-Z\\s'-]+$");
        // Return true if valid, false otherwise
    }

    public static boolean validateEmailAddress(String email) {
        // Implement validation logic for email address
        if (email == null || email.isEmpty()) {
            return false;
        }
        // Should match the username@domain.com format
        String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
        // Allow letters, numbers, dots ".", hyphens "-", hash "#," and underscores "_"
        return email.matches(emailRegex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        // Implement validation logic for phone number
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }
        // Should consist of ten digits
        String onlyNumbers = phoneNumber.replaceAll("[^0-9]", "");
        return onlyNumbers.length() == 10;
    }

    public static boolean validateBirthday(String birthday) {
        // Define the date format to match the "MM/DD/YYYY" pattern
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dateFormat.setLenient(false);

        try {
            // Parse the birthday string to a Date object
            Date date = dateFormat.parse(birthday);

            // Get the current date
            Date currentDate = new Date();

            // Check if the parsed date is in the past
            if (date.before(currentDate)) {
                return true; // Valid date of birth in the past
            }
        } catch (ParseException e) {
            // Parsing failed, indicating an invalid date format
            return false;
        }

        return false; // Date of birth is not valid or in the future
    }

    public static boolean validateUser(Address address, String firstName, String lastName, String emailAddress, String phoneNumber, String birthday) {
        // Return true if all validations are successful, otherwise return false
        return address.validateAddress() && validateName(firstName) && validateName(lastName) && validateEmailAddress(emailAddress) && validatePhoneNumber(phoneNumber) && validateBirthday(birthday);
    }
}
