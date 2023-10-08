# Assignment 4
Learn unit testing and code coverage by writing code and tests for a user registration.

The code from this assginment will be reused in the next assignment where we will create apis to read and edit user registration. 

### Requirements
A user registration has the following fields. 
* First name, Last name. Should not be empty. Should have a max length of 256 characters. Alphabetic characters, spaces, and possibly hyphens or apostrophes.
* Email address. Should have username@domain.com format. An email address can contain letters, numbers, dots ".", hyphens "-", hash "#" and underscores "_."
* Phone number - ten digit numbers
* Address - made up of street address, address line 2, city, state/province/region, country, zip code. Each sub field should not have more than 256 alphanumeric characters. (In the next assignment you will make api calls to verify if the address is a real address)

### The assignment
1. Write Java code to model the user registration and the validation for the input fields.
   - When the validation fails, give a user friendly error message.

```
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

    public boolean validateFirstName() {
        // Implement validation logic for first name
        // Should not be empty, and should have a max length of 256 characters
        // Allow alphabetic characters, spaces, hyphens, and apostrophes
        // Return true if valid, false otherwise
    }

    public boolean validateLastName() {
        // Implement validation logic for last name
        // Should not be empty, and should have a max length of 256 characters
        // Allow alphabetic characters, spaces, hyphens, and apostrophes
        // Return true if valid, false otherwise
    }

    public boolean validateEmailAddress() {
        // Implement validation logic for email address
        // Should match the username@domain.com format
        // Allow letters, numbers, dots ".", hyphens "-", hash "#," and underscores "_"
        // Return true if valid, false otherwise
    }

    public boolean validatePhoneNumber() {
        // Implement validation logic for phone number
        // Should consist of ten digits
        // Return true if valid, false otherwise
    }

    // Other Methods for address validation

    // ...

}

```
2. Write tests for the validation methods.
   - Continue to write tests using Junit
   - Write positive and negative tests
   - Use parameterized tests that pass multiple values to the test cases.
   - Enable code coverage in your IDE/editor, in your pull request attach a picture that shows the code coverage

3. Generate a code coverage report in HTML for a Java project using Gradle and JaCoCo. Here are the steps to do it:

**Step 1: Project Structure**

Lets assume you have a directory structure like this:

```
my-java-project/
├── build.gradle
└── src/
    └── main/
    └── test/
```

**Step 2: Add Dependencies**

Edit your `build.gradle` file to include the JaCoCo plugin and configure it. Here's a sample `build.gradle` file:

```groovy
plugins {
    id 'java'
    id 'jacoco'
}

repositories {
    jcenter()
}

dependencies {
    // Add your project dependencies here
}

test {
    useJUnitPlatform()
}

jacocoTestReport {
    reports {
        xml.enabled true
        html.enabled true
    }
}
```

In this `build.gradle` file:

- We apply the `java` plugin for Java projects.
- We apply the `jacoco` plugin to enable code coverage reporting.
- We configure JaCoCo to generate both XML and HTML reports.

**Step 3: Write Tests**

Write your Java unit tests in the `src/test/` directory.

**Step 4: Generate Code Coverage Report**

Run the following command in the terminal within your project directory to execute tests and generate code coverage reports:

```
./gradlew clean test jacocoTestReport
```

This command will clean the project, run tests, and generate JaCoCo code coverage reports.

**Step 5: Access the HTML Report**

After running the command, you can find the HTML code coverage report in the following directory:

```
build/reports/jacoco/test/html/index.html
```

Open the `index.html` file in a web browser to view the code coverage report. It will display detailed information about which parts of your code were covered by your tests and which were not.

Checkin the entire code coverage report in your repo.
