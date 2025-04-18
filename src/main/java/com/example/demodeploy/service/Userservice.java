package com.example.demodeploy.service;

import com.example.demodeploy.entity.User;
import com.example.demodeploy.repository.Userrepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Userservice {
    private final Userrepo userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

