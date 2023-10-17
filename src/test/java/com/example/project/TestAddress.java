package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class TestAddress {

    //positive test
    @Test
    public void testValidAddress() {
        Address validAddress = new Address("123MainStreet", "Apt4B", "Ames", "Iowa", "USA", "50011");
        boolean result = validAddress.validateAddress();
        assertTrue(result);
    }

    //negative test
    @Test
    public void testInvalidAddress() {
        Address inValidAddress = new Address("123MainStreet", null, "Ames", "Iowa", "USA", "50011"); //addressLine2 null
        boolean result = inValidAddress.validateAddress();
        assertFalse(result);
    }

    //parameterized test
    @ParameterizedTest
    @CsvSource({
            "123 Main Street, Apt 4B, City, State, Country, 12345, true",
            ", Apt 4B, City, State, Country, 12345, false",  // Empty street
            "123 Main St, Apt 4B, City, State, Country, , false",  // Empty zipCode
            "123 Main St, Apt 4B, City, State, Country, 1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111222222222222222222222222222222222222222222222222222222222222222222222222222223333333333333333333333333333333333333333333333333333333, false"  // Exceeds max length
    })

    public void testValidateAddress(String street, String addressLine2, String city, String state, String country, String zipCode, boolean expectedValidationResult) {
        Address address = new Address(street, addressLine2, city, state, country, zipCode);
        if (expectedValidationResult) {
            System.out.println(address);
            assertTrue(address.validateAddress());
        } else {
            assertFalse(address.validateAddress());
        }
    }

}
