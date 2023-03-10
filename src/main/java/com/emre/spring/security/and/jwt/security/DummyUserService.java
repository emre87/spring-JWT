package com.emre.spring.security.and.jwt.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class DummyUserService {

    private Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {
        users.put("emre", new User("emre", "emre123",new ArrayList<>()));

    }

    public User getUserByUsername(String username) {
        return users.get(username);
    }
}
