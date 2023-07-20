package com.marcosprado.authenticationapplication.service;

import com.marcosprado.authenticationapplication.entities.User;
import com.marcosprado.authenticationapplication.repositories.UserRepository;
import org.springframework.http.ResponseEntity;

public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity createUser(User user) {
        userRepository.save(user);
        return ResponseEntity.ok().build();
    }

}
