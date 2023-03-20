package com.bridgelabz.user_registration;

public class UserRegistrationException extends Exception {
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public UserRegistrationException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
