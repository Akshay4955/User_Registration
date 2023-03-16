package com.bridgelabz.user_registration;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName("Akshay");
        userRegistration.validateLastName("Shedge");
        userRegistration.validateEmail("akshay.shedge@bl.co.in");
    }
}