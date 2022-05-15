package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean firstName = userRegistration.validateFirstName("Nikhil");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean lastName = userRegistration.validateLastName("nikhil");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean email = userRegistration.validateEmail("Nikhil.deshmukh20@gmail.com");
        Assert.assertTrue(email);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("91 9637863774");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenProperWithOutSpace_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("919637863774");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean phoneNumber = userRegistration.validatePhoneNumber("9179");
        Assert.assertTrue(phoneNumber);
    }

    @Test
    public void givenPassword_WhenMinEightChar_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Nikhil@123");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_WhenAtleastOne_Caps_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Nikhil@123");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_WhenAtleastOne_Numerics_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Nikhil@1");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_HasExactlyOneSpecialCharacter_ShouldReturnTrue1() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Nikhil@1");
        Assert.assertTrue(password);
    }

    @Test
    public void givenPassword_HasExactlyOneSpecialCharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean password = userRegistration.validatePassword("Nikhil@1");
        Assert.assertTrue(password);
    }

}