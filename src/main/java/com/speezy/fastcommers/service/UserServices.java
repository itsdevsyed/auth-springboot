package com.speezy.fastcommers.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.speezy.fastcommers.dto.UserDto;
import com.speezy.fastcommers.entity.User;
import com.speezy.fastcommers.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServices {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(UserDto userDto) {
        if(userRepository.existsByEmail(userDto.getEmail())) {
            throw new RuntimeException("User already exists with this email");
        }
        User user = new User();
        user.setName(userDto.getName()); // This is correct now
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userRepository.save(user);
    }

}
