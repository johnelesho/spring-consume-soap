package com.quconn.integration.payment;

import com.quconn.integration.entity.AddPaymentLocalResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddPaymentLocalResponse {

    private AddPaymentLocalResult AddPaymentLocalResult;
}
