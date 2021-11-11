package com.home.login_password.exception;

/**
 * Created by Егор on 11.11.2021.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super();
    }
}
