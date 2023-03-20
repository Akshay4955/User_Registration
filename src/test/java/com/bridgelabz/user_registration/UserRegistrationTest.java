package com.bridgelabz.user_registration;

import com.sun.xml.internal.ws.api.model.ExceptionType;
import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateFirstName("Akshay"));
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateFirstName("AK"));
    }

    @Test
    public void givenFirstName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateFirstName("akshay"));
    }

    @Test
    public void givenFirstName_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateFirstName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenFirstName_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateFirstName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateLastName("Shedge"));
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateLastName("Sh"));
    }

    @Test
    public void givenLastName_WhenFirstLetterIsNotCapital_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateLastName("shedge"));
    }

    @Test
    public void givenLastName_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateLastName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenLastName_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateLastName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateEmail("aks.hay@bl.co.in"));
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateEmail("aks.hay@bl.co."));
    }

    @Test
    public void givenEmail_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateEmail(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmail_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateEmail("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validateMobileNumber("91 8796535081"));
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateMobileNumber("91 87965350"));
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validateMobileNumber("918796535081343"));
    }

    @Test
    public void givenMobileNumber_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateMobileNumber(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenMobileNumber_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validateMobileNumber("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }

    @Test
    public void givenPassWord_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("Aks@11"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneUpperCaseLetter_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("akshay@11"));
    }

    @Test
    public void givenPassword_WhenNotHavingAtLeastOneNumber_ShouldReturnFalse() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertFalse(userRegistrationValidation.validatePassword("aksHay@shedge"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
        Assert.assertTrue(userRegistrationValidation.validatePassword("Akshay@11"));
    }

    @Test
    public void givenPassword_WhenNull_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validatePassword(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenPassword_WhenEmpty_ShouldThrowException() {
        try {
            UserRegistrationValidation userRegistrationValidation = new UserRegistrationValidation();
            userRegistrationValidation.validatePassword("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
