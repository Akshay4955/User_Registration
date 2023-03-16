package com.bridgelabz.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateFirstName("Akshay"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateFirstName("Ak"));
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateFirstName("akshay"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateLastName("Shedge"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateLastName("Sh"));
    }

    @Test
    public void givenLastName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateLastName("shedge"));
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateEmail("aks.hay@bl.co.in"));
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateEmail("aks.hay@bl.co."));
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateMobileNumber("91 8796535081"));
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateMobileNumber("91 87965350"));
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateMobileNumber("918796535081343"));
    }

    @Test
    public void givenPassWord_WhenShort_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("Aks@11"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneUpperCaseLetter_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("akshay@11"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneNumber_ShouldReturnFalse() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("aksHay@shedge"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePassword("Akshay@11"));
    }
}
