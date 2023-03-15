package com.bridgelabz.user_registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validateFirstName(String name) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result == true)
            System.out.println("Valid first name");
        else
            System.out.println("Invalid first name");
    }
}