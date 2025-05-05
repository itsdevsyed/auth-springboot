package com.speezy.fastcommers.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.speezy.fastcommers.user.dto.UserDto;
import com.speezy.fastcommers.user.entity.User;
import com.speezy.fastcommers.user.repository.UserRepository;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class UserServices {

    @Autowired
    private UserRepository userRepository;
    public User registerUser(UserDto userDto) {

        if(userRepository.existsByphoneNumber(userDto.getPhoneNumber())) {
            throw new IllegalArgumentException("User already exists with this phone number");
        }
        User user =  User.builder()
                 .name(userDto.getName())
                 .phoneNumber(userDto.getPhoneNumber())
                 .email((userDto.getEmail()))
                 .role(userDto.getRole())
                 .build();

                 return userRepository.save(user);

    }
    public Optional<User> findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}
