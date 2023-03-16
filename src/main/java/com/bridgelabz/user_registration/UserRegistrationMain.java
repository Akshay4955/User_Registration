package com.bridgelabz.user_registration;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Akshay");
        userRegistration.validateLastName("Shedge");
        userRegistration.validateEmail("akshay.shedge@bl.co.in");
        userRegistration.validateMobileNo("91 8796535081");
        userRegistration.validatePassword("akshaY@1");
    }
}