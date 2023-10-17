package com.example.project;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestUserRegistration {

   //positive test
   @Test
   public void testValidUserRegistration() {
      String validFirstName = "John";
      String validLastName = "O'Brian";
      String validEmail = "john_obrian123@example-domain.com";
      String validPhoneNumber = "123-456-7890";
      String validBirthday = "09/28/2001";
      Address validAddress = new Address("123MainStreet", "Apt4B", "Ames", "Iowa", "USA", "50011");

      boolean result = UserRegistration.validateUser(validAddress, validFirstName, validLastName, validEmail, validPhoneNumber, validBirthday);

      assertTrue(result);
   }

   //negative test
   @Test
   public void testInvalidUserRegistration() {
      String validFirstName = "John";
      String validLastName = "O'Brian";
      String validEmail = "john_obrian123@example-domain.com";
      String validPhoneNumber = "123-456-789013"; //phone number > 10 numbers
      String validBirthday = "09/28/2001";
      Address validAddress = new Address("123MainStreet", "Apt4B", "Ames", "Iowa", "USA", "50011");

      boolean result = UserRegistration.validateUser(validAddress, validFirstName, validLastName, validEmail, validPhoneNumber, validBirthday);

      assertFalse(result);
   }

   //parameterized tests
   @ParameterizedTest
   @CsvSource({
           "123 Main St, Apt 4B, City, State, Country, 12345, John, Doe, john@example.com, 1234567890, 01/15/1990, true",
           "123 Main St, Apt 4B, City, State, Country, 12345, , Doe, john@example.com, 1234567890, 01/15/1990, false",  // Empty firstName
           "123 Main St, Apt 4B, City, State, Country, 12345, John, Doe, , 1234567890, 01/15/1990, false",  // Empty emailAddress
           "123 Main St, Apt 4B, City, State, Country, 12345, John, Doe, john@example.com, , 01/15/1990, false",  // Empty phoneNumber
           "123 Main St, Apt 4B, City, State, Country, 12345, John, Doe, john@example.com, 1234567890, 10/15/2030, false"  // Future birthday
   })

   public void testValidateUser(String street, String addressLine2, String city, String state, String country, String zipCode,
                                String firstName, String lastName, String emailAddress, String phoneNumber, String birthday, boolean expectedValidationResult) {

      Address address = new Address(street, addressLine2, city, state, country, zipCode);

      boolean validationResult = UserRegistration.validateUser(address, firstName, lastName, emailAddress, phoneNumber, birthday);

      assertEquals(expectedValidationResult, validationResult);
   }

}