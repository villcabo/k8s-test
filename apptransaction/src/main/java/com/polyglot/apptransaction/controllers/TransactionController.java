package com.polyglot.apptransaction.controllers;

import com.polyglot.apptransaction.domain.Transaction;
import com.polyglot.apptransaction.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private static final Logger log = LoggerFactory.getLogger(TransactionController.class);

    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @GetMapping
    public List<Transaction> getAll() {
        log.debug("REST to get all transactions");
        return transactionRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody Transaction transaction) {
        log.debug("REST to post save transaction: {}", transaction);
        transactionRepository.save(transaction);
        return ResponseEntity.ok(transaction);
    }
}
