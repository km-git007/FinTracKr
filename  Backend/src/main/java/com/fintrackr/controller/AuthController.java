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
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String loginResponse = clerkAuthService.verifyToken(token.substring(7));
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        clerkAuthService.logoutUser(token.substring(7));
        return ResponseEntity.ok("User logged out successfully");
    }

    @GetMapping("/roles")
    public ResponseEntity<String> getUserRoles(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String roles = clerkAuthService.getUserRoles(token.substring(7));
        return ResponseEntity.ok(roles);
    }
    @GetMapping("/me")
    public ResponseEntity<String> getUserInfo(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userInfo = clerkAuthService.getUserInfo(token.substring(7));
        return ResponseEntity.ok(userInfo);
    }
}
