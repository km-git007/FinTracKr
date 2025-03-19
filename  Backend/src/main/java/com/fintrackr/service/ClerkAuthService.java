package com.fintrackr.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClerkAuthService {

    private static final String CLERK_USER_INFO_URL = "https://api.clerk.dev/v1/me";

    public String getUserInfo(String token) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(CLERK_USER_INFO_URL + "?token=" + token, String.class);
    }
}
