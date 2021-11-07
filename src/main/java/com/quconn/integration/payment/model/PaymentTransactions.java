package com.quconn.integration.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor

@NoArgsConstructor
@Data
public class PaymentTransactions {

    private  PaymentTransactionLocal[] PaymentTransactions;
}
