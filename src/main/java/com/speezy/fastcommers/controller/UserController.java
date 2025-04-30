package com.speezy.fastcommers.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speezy.fastcommers.dto.UserDto;
import com.speezy.fastcommers.service.UserServices;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")  // Ensuring the correct URL path
@RequiredArgsConstructor
public class UserController {
    private final UserServices userServices;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserDto userDto) {
        try {
            userServices.registerUser(userDto);
            return ResponseEntity.ok("User registered successfully");


        } catch (RuntimeException e) {  // Catching any registration-related exceptions
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    // Other endpoints like login can be added here
}
