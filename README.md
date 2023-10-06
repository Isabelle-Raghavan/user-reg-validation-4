# Assignment 4
Learn unit testing and code coverage by writing code and tests for a user registration.

The code from this assginment will be reused in the next assignment where we will create apis to read and edit user registration. 

### Requirements
A user registration has the following fields. 
* First name, Last name. Should not be empty. Should have a max length of 256 characters. Alphabetic characters, spaces, and possibly hyphens or apostrophes.
* Email address. Should have username@domain.com format. An email address can contain letters, numbers, dots ".", hyphens "-", hash "#" and underscores "_."
* Phone number - ten digit numbers
* Address - made up of street address, address line 2, city, state/province/region, country, zip code.

### The assignment
Write Java code to model the user registration and the validation for the input fields. Use AI tools to write the code and tests.
Use parameterized testing to test the validation code against a range of inputs. 


### Setup command
N/A

### Run command
`gradle test`

### Notes
- The JDK is installed on GitHub Actions machines, so you're also able to directly invoke `javac`, `java`, or any other CLI command included in the JDK. 
