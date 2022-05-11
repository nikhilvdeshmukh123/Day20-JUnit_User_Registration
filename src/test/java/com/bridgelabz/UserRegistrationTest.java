package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    //    Happy Test for first name, first letter - capital letter
    @Test
    public void firstNameHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.firstName("Nikhil");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for first name, first letter - capital letter
    @Test
    public void firstNameSadTest1() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.firstName("nikhil");
        Assert.assertFalse(sadTest);
    }

//    Happy Test for last name, first letter - capital letter
    @Test
    public void lastNameHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.lastName("Deshmukh");
        Assert.assertTrue(happyTest);
    }

    //    Sad Test for last name, first letter - capital letter
    @Test
    public void lastNameSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.lastName("deshmukh");
        Assert.assertFalse(sadTest);
    }

    //    Sad Test for last name, first letter - capital letter
    @Test
    public void emailHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.email("deshmukhnikhil81@gmail.com");
        Assert.assertFalse(happyTest);
    }

    @Test
    public void emailSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.email("nikhildeshmukh.co.in");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void mobNoHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.mobileNumber("91 9637863774");
        Assert.assertTrue(happyTest);
    }

    @Test
    public void mobNoSadTest() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.mobileNumber("9637863774");
        Assert.assertFalse(sadTest);
    }
    @Test
    public void passwordHappyTest() {
        UserRegistration validator = new UserRegistration();
        boolean happyTest = validator.ruleOne("asdsfhwe");
        Assert.assertTrue(happyTest);
    }

    @Test
    public void passwordSadTest1() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleOne("sd@A12");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest2() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleTwo("asjd23$df");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest3() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleThird("asjdAG$df");
        Assert.assertFalse(sadTest);
    }

    @Test
    public void passwordSadTest4() {
        UserRegistration validator = new UserRegistration();
        boolean sadTest = validator.ruleFourth("asjd23^$df");
        Assert.assertFalse(sadTest);
    }
}