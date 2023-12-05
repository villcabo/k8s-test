package com.polyglot.apppay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.polyglot.apppay.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

}