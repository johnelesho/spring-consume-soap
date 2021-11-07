package com.quconn.integration.controller;

import com.quconn.integration.balance.GetAccountBalance;
import com.quconn.integration.balance.GetAccountBalanceResponse;
import com.quconn.integration.payment.AddPaymentLocalResponse;
import com.quconn.integration.payment.model.AddPaymentLocal;
import com.quconn.integration.service.PaymentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentIntegrationController {

    @Autowired
    private PaymentClient paymentClient;


    @PostMapping("")
    public ResponseEntity<AddPaymentLocalResponse> addPayment(@RequestBody() AddPaymentLocal request){
        return new ResponseEntity<AddPaymentLocalResponse>(paymentClient.getPayment(request), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<GetAccountBalanceResponse> getBalance(@RequestBody() GetAccountBalance request){
        return new ResponseEntity<GetAccountBalanceResponse>(paymentClient.getBalanceEnquiry(request), HttpStatus.OK);
    }
}
