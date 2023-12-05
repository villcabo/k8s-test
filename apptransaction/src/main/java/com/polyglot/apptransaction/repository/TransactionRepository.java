package com.polyglot.apptransaction.repository;

import com.polyglot.apptransaction.domain.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<Transaction, Integer> {
}
