package com.polyglot.apppay.service;

import com.polyglot.apppay.model.Operation;
import com.polyglot.apppay.repository.OperationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

    private static final Logger log = LoggerFactory.getLogger(OperationService.class);

    private final OperationRepository operationRepository;

    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public Operation save(Operation operation) {
        operationRepository.save(operation);
        log.info("Operation saved: {}", operation);
        return operation;
    }
}