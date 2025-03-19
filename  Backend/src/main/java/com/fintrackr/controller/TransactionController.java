package com.fintrackr.controller;

import com.fintrackr.dto.TransactionDTO;
import com.fintrackr.entity.Transaction;
import com.fintrackr.service.TransactionService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<List<Transaction>> getTransactions(@RequestHeader(HttpHeaders.AUTHORIZATION) String token) {
        String userId = extractUserIdFromToken(token);
        return ResponseEntity.ok(transactionService.getUserTransactions(userId));
    }

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestHeader(HttpHeaders.AUTHORIZATION) String token,
                                                         @RequestBody TransactionDTO transactionDTO) {
        String userId = extractUserIdFromToken(token);
        return ResponseEntity.ok(transactionService.createTransaction(userId, transactionDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> updateTransaction(@PathVariable Long id,
                                                         @RequestBody TransactionDTO transactionDTO) {
        return ResponseEntity.ok(transactionService.updateTransaction(id, transactionDTO));
    }

    private String extractUserIdFromToken(String token) {
        return token.substring(7); // Simplified; use proper JWT parsing in production
    }
}
