package com.quconn.integration.balance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {

    private String CorporateCode;
    private String AccountNumber;
}
