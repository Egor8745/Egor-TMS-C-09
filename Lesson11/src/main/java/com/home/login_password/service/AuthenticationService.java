package com.home.login_password.service;

/**
 * Created by Егор on 11.11.2021.
 */
public interface AuthenticationService {
    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
