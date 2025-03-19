package com.fintrackr.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ReceiptScannerService {

    public String scanReceipt(MultipartFile file) {
        // Simulated AI-based receipt scanning logic
        return "{ \"amount\": 120.50, \"category\": \"Groceries\", \"date\": \"2024-04-10\", \"description\": \"Supermarket\" }";
    }
}
