package com.fintrackr.controller;

import com.fintrackr.service.ReceiptScannerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final ReceiptScannerService receiptScannerService;

    public AIController(ReceiptScannerService receiptScannerService) {
        this.receiptScannerService = receiptScannerService;
    }

    @PostMapping("/scan-receipt")
    public ResponseEntity<String> scanReceipt(@RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(receiptScannerService.scanReceipt(file));
    }
}
