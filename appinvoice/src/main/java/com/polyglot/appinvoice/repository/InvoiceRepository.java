package com.polyglot.appinvoice.repository;

import com.polyglot.appinvoice.domain.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
