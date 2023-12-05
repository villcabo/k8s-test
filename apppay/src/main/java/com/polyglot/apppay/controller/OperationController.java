package com.polyglot.apppay.controller;

import com.polyglot.apppay.model.Operation;
import com.polyglot.apppay.service.OperationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operations")
public class OperationController {

    private static final Logger log = LoggerFactory.getLogger(OperationController.class);

    private final OperationService operationService;

    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping
    public ResponseEntity<Operation> save(@RequestBody Operation operation) {
        log.debug("REST to post save operation: {}", operation);
        operationService.save(operation);
        return ResponseEntity.ok(operation);
    }
}
