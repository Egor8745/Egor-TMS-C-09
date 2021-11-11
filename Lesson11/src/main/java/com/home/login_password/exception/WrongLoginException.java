package com.home.login_password.exception;

/**
 * Created by Егор on 11.11.2021.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
