package com.home.login_password.util;

import lombok.experimental.UtilityClass;

/**
 * Created by Егор on 11.11.2021.
 */
@UtilityClass
public class Constants {
    public static final int MIN_LOGIN_LENGTH = 3;
    public static final int MAX_LOGIN_LENGTH = 10;
    public static final String PATTERN_LOGIN =
            "[^\\W_]\\w{" + (MIN_LOGIN_LENGTH - 1) + "," + (MAX_LOGIN_LENGTH - 1) + "}";
    public static final int PASSWORD_LENGTH = 3;
    public static final int MAX_PASSWORD_LENGTH = 20;
    public static final String PATTERN_PASSWORD =
            "\\w{" + PASSWORD_LENGTH + "," + MAX_PASSWORD_LENGTH + "}";
}
