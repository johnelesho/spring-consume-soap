package com.quconn.integration.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@AllArgsConstructor

@NoArgsConstructor
@Data
public class PaymentTransactionLocal {
    private   String DestinationBankCode;
    private   String Beneficiary;
    private  String BeneficiaryEmail;
    private  String BeneficiaryPhone;
    private   String AccountNumber;
    private  String Amount;
    private  String Narration;
    private  LocalDate ValueDate;
}
