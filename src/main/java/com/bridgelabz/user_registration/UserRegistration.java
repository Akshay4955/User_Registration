package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validateFirstName(String name) {
        boolean result = Pattern.compile("^[A-Z][a-z]{2,}").matcher(name).matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }

    public void validateLastName(String lastName) {
        boolean result = Pattern.compile("^[A-Z][a-z]{2,}").matcher(lastName).matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }
}