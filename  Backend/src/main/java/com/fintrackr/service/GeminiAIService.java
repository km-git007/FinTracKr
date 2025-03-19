package com.fintrackr.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeminiAIService {
    private final RestTemplate restTemplate = new RestTemplate();
    private static final String GEMINI_API_URL = "https://api.gemini.google.com/v1/chat/completions";
    private static final String API_KEY = "YOUR_GEMINI_API_KEY";

    public String getFinancialAdvice(String userInput) {
        return restTemplate.getForObject(GEMINI_API_URL + "?query=" + userInput + "&key=" + API_KEY, String.class);
    }
}
