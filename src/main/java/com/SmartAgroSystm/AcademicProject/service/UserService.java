package com.SmartAgroSystm.AcademicProject.service;


import com.SmartAgroSystm.AcademicProject.model.User;

import com.SmartAgroSystm.AcademicProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);
        // Check if the user exists and if the password matches
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user;
        }
        return Optional.empty();
    }

}