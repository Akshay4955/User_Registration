package com.bridgelabz.user_registration;

import java.util.regex.Pattern;

public class UserRegistrationValidation {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    private static final String MOBILE_NO_PATTERN = "^(91)[\\s][0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%&*+])([~!@#$%&*+]?[A-Za-z0-9]){7,}$";
    private static final String EMAIL_PATTERN = "^[a-z]+([+_.-]?[a-zA-Z0-9])*[@][a-zA-Z0-9]+([.][a-z]{2,3}){1,2}$";

    public boolean validateFirstName(String firstName) {
        boolean result = Pattern.compile(NAME_PATTERN).matcher(firstName).matches();
        if (result == true)
            return true;
        else
            return false;
    }

    public boolean validateLastName(String lastName) {
        boolean result = Pattern.compile(NAME_PATTERN).matcher(lastName).matches();
        if (result == true)
            return true;
        else
            return false;
    }

    public boolean validateMobileNumber(String mobileNo) {
        boolean result = Pattern.compile(MOBILE_NO_PATTERN).matcher(mobileNo).matches();
        if (result == true)
            return true;
        else
            return false;
    }

    public boolean validatePassword(String password) {
        boolean result = Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
        if (result == true)
            return true;
        else
            return false;
    }

    public boolean validateEmail(String email) {
        boolean result = Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
        if (result == true)
            return true;
        else
            return false;
    }
}
