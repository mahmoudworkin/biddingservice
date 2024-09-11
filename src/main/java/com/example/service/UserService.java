package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRepository;
import jakarta.inject.Singleton;

@Singleton
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
