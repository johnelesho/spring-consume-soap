package com.quconn.integration.payment;

import com.quconn.integration.payment.model.PaymentTransactions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dto {

    private PaymentTransactions paymentTransactions;

    private  String corporateCode;
    private  String currency;
    private  String singleDebitNarration;
    private  int enableDebitNarration;
    private LocalDate date;
    private int totalTransactions;
    private  String sourceAccount;
    private double amount;
    private String paymentMethodId;
    private String paymentTypeId;
    private String batchReference;
    private String username;
    private String password;
}
