package com.speezy.fastcommers.user.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.speezy.fastcommers.user.dto.UserDto;
import com.speezy.fastcommers.user.entity.User;
import com.speezy.fastcommers.user.repository.UserRepository;

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
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setRole(userDto.getRole());
        user.setLatitude(userDto.getLatitude());
        user.setLongitude(userDto.getLongitude());
        user.setAddress(userDto.getAddress());
        user.setCity(userDto.getCity());
        user.setCreatedAt(user.getCreatedAt()); // This is correct now (null); // Keep this if DTO is snake_case

        userRepository.save(user);
    }

}
