package com.fintrackr.controller;

import com.fintrackr.service.ReportService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    /**
     * Endpoint to generate a financial report for an authenticated user.
     */
    @GetMapping("/generate")
    public ResponseEntity<String> generateReport(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userId = extractUserIdFromToken(token);
        String report = reportService.generateReport(userId);
        return ResponseEntity.ok(report);
    }

    /**
     * Endpoint to send a budget reminder to an authenticated user.
     */
    @PostMapping("/send-reminder")
    public ResponseEntity<String> sendBudgetReminder(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userId = extractUserIdFromToken(token);
        String reminder = reportService.sendBudgetReminder(userId);
        return ResponseEntity.ok(reminder);
    }

    /**
     * Extracts user ID from the Clerk-authenticated JWT token.
     * In a real application, use JWT parsing to verify and extract claims properly.
     */
    private String extractUserIdFromToken(String token) {
        return token.substring(7); // Simplified extraction (remove 'Bearer ')
    }
}
