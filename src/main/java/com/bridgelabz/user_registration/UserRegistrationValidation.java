package com.bridgelabz.user_registration;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String MOBILE_NO_PATTERN = "^(91)[\\s][0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%&*+])([~!@#$%&*+]?[A-Za-z0-9]){7,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+([+_.-]?[a-zA-Z0-9])*[@][a-zA-Z0-9]+([.][a-z]{2,3}){1,2}$";

    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        try {
            if (firstName.isEmpty()) {
                throw new UserRegistrationException("Please enter name", UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            }
            boolean result = Pattern.compile(NAME_PATTERN).matcher(firstName).matches();
            if (result == true)
                return true;
            else
                return false;
        } catch (NullPointerException e) {
            throw new UserRegistrationException("Please enter valid name", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {
        try {
            if (lastName.isEmpty()) {
                throw new UserRegistrationException("Please enter last name", UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            }
            boolean result = Pattern.compile(NAME_PATTERN).matcher(lastName).matches();
            if (result == true)
                return true;
            else
                return false;
        } catch (NullPointerException e) {
            throw new UserRegistrationException("Please enter valid last name", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validateMobileNumber(String mobileNo) throws UserRegistrationException {
        try {
            if (mobileNo.isEmpty()) {
                throw new UserRegistrationException("Please enter mobile number", UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            }
            boolean result = Pattern.compile(MOBILE_NO_PATTERN).matcher(mobileNo).matches();
            if (result == true)
                return true;
            else
                return false;
        } catch (NullPointerException e) {
            throw new UserRegistrationException("Please enter valid mobile noumber", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        try {
            if (password.isEmpty()) {
                throw new UserRegistrationException("PLease enter password", UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            }
            boolean result = Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
            if (result == true)
                return true;
            else
                return false;
        } catch (NullPointerException e) {
            throw new UserRegistrationException("Please enter valid password", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }

    public boolean validateEmail(String email) throws UserRegistrationException {
        try {
            if (email.isEmpty()) {
                throw new UserRegistrationException("Please enter email", UserRegistrationException.ExceptionType.ENTERED_EMPTY);
            }
            boolean result = Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
            if (result == true)
                return true;
            else
                return false;
        } catch (NullPointerException e) {
            throw new UserRegistrationException("Please enter valid email", UserRegistrationException.ExceptionType.ENTERED_NULL);
        }
    }
}
