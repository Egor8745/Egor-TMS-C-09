package com.home.login_password;

import com.home.login_password.service.AuthenticationService;
import com.home.login_password.service.AuthenticationServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static com.home.login_password.util.Constants.MIN_LOGIN_LENGTH;
import static com.home.login_password.util.Constants.PASSWORD_LENGTH;

public class Main {

    public static void main(String[] args) {
        System.out.println("Длина поля логин установлена в - " + MIN_LOGIN_LENGTH);
        System.out.println("Длина поля пароль установлена в - " + PASSWORD_LENGTH);
        System.out.println();
        List<String[]> credentialsList = new ArrayList<>();
        credentialsList.add(new String[]{"000", "222", "222"});
        credentialsList.add(new String[]{"@3234", "123", "12434"});
        credentialsList.add(new String[]{"$234", "111", "333"});
        credentialsList.add(new String[]{"123", "123", "123"});
        credentialsList.add(new String[]{"245", "22 2", "22 2"});
        credentialsList.add(new String[]{"6^5", "222", "222"});
        credentialsList.add(new String[]{"%234", "222", "222"});


        AuthenticationService service = new AuthenticationServiceImpl();
        for (String[] credentials : credentialsList) {
            System.out.println("Логин: " + credentials[0] + "; Пароль: " + credentials[1] + "; Подтверждение пароля: " + credentials[2] + ";");
            try {
                System.out.println(service.checkAuthorization(credentials[0], credentials[1], credentials[2]) ? "Авторизация успешна" : "Авторизация отклонена");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

