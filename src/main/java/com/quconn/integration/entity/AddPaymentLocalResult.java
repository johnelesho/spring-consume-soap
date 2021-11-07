package com.quconn.integration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor

@NoArgsConstructor
@Data
public class AddPaymentLocalResult {
    private  String CorporateCode;
    private String BatchReference;
    private String AccountNo;
    private String StatusCode;
    private String StatusDescription;
    private String PaymentTypeId;


}
