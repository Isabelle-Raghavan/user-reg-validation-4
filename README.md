# Assignment 4
Learn unit testing and code coverage by writing code and tests for a user registration.

The code from this assginment will be reused in the next assignment where we will create apis to read and edit user registration. 

### Requirements
A user registration has the following fields. 
* First name, Last name. Should not be empty. Should have a max length of 256 characters. Alphabetic characters, spaces, and possibly hyphens or apostrophes.
* Email address. Should have username@domain.com format. An email address can contain letters, numbers, dots ".", hyphens "-", hash "#" and underscores "_."
* Phone number - ten digit numbers
* Address - made up of street address, address line 2, city, state/province/region, country, zip code. Each sub field should not have more than 256 alphanumeric characters. (In the next assignment you will make api calls to verify if the address is a real address)
* Date of Birth - Should be a valid date in the past. (Updated on 10/10) - Accept the date as a string in format "MM/DD/YYYY".  

### The assignment
1. Write Java code to model the user registration and the validation for the input fields.
   - Refer to the Java class in this repo that has the starter code

2. Write tests for the validation methods.
   - Write tests using JUnit for all your code
   - Write positive and negative tests
   - Use parameterized tests that pass multiple values to the test cases. Refer to (this  article by Carlos Schults)[https://www.waldo.com/blog/parameterized-test-junit] on parameterized testing
   - Enable code coverage and commit the code coverage report in your repo. See [this page](CodeCoverage.md)

