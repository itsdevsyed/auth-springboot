package com.speezy.fastcommers.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speezy.fastcommers.auth.dto.AuthRequest;
import com.speezy.fastcommers.auth.dto.AuthResponse;
import com.speezy.fastcommers.auth.dto.RegisterRequest;
import com.speezy.fastcommers.auth.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(AuthRequest request) {
        return ResponseEntity.ok( authService.authenticate(request));
    }
}
