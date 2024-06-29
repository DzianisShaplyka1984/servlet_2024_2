package com.academy.service;

import com.academy.model.User;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> users;

    public AuthService() {
        users = new ArrayList<>();

        User user = new User("admin", "password");
        User user1 = new User("user", "test");

        users.add(user);
        users.add(user1);
    }

    public boolean checkCredentials(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }
}
