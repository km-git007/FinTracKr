package com.fintrackr.controller;

import com.fintrackr.service.ClerkAuthService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final ClerkAuthService clerkAuthService;

    public AuthController(ClerkAuthService clerkAuthService) {
        this.clerkAuthService = clerkAuthService;
    }

    @GetMapping("/me")
    public ResponseEntity<String> getUserInfo(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userInfo = clerkAuthService.getUserInfo(token.substring(7));
        return ResponseEntity.ok(userInfo);
    }
}
