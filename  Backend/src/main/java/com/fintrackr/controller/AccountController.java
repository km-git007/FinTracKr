package com.fintrackr.controller;

import com.fintrackr.dto.AccountDTO;
import com.fintrackr.entity.Account;
import com.fintrackr.service.AccountService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * Fetch all accounts for the authenticated user.
     */
    @GetMapping
    public ResponseEntity<List<Account>> getAccounts(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userId = extractUserIdFromToken(token);
        return ResponseEntity.ok(accountService.getUserAccounts(userId));
    }

    /**
     * Create a new account for the authenticated user.
     */
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                 @RequestBody AccountDTO accountDTO) {
        String userId = extractUserIdFromToken(token);
        return ResponseEntity.ok(accountService.createAccount(userId, accountDTO));
    }

    /**
     * Update an existing account.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody AccountDTO accountDTO) {
        return ResponseEntity.ok(accountService.updateAccount(id, accountDTO));
    }

    /**
     * Delete an account.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Account deleted successfully");
    }

    /**
     * Extracts user ID from Clerk JWT.
     */
    private String extractUserIdFromToken(String token) {
        return token.substring(7); // Simplified extraction
    }
}
