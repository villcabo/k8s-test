package com.polyglot.apppay.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operation")
    private Integer idOperation;

    @Column(name = "id_invoice")
    private Integer idInvoice;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "date")
    private ZonedDateTime myDate;

    public Integer getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Integer idOperation) {
        this.idOperation = idOperation;
    }

    public Integer getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public ZonedDateTime getMyDate() {
        return myDate;
    }

    public void setMyDate(ZonedDateTime myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "idOperation=" + idOperation +
                ", idInvoice=" + idInvoice +
                ", amount=" + amount +
                ", myDate=" + myDate +
                '}';
    }
}