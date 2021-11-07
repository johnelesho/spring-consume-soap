package com.quconn.integration.balance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAccountBalanceResult {
    private  String CorporateCode;
    private  String AccountNumber;
    private  String Balance;
    private  String StatusCode;
    private  String StatusDescription;
}
