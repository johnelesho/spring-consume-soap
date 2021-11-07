package com.quconn.integration.service;

import com.quconn.integration.balance.GetAccountBalance;
import com.quconn.integration.balance.GetAccountBalanceResponse;
import com.quconn.integration.payment.AddPaymentLocalResponse;
import com.quconn.integration.payment.model.AddPaymentLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

//import com.quconn.integration.wsdl.GetCountryRequest;
//import com.quconn.integration.wsdl.GetCountryResponse;
public class PaymentClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(PaymentClient.class);

    @Value("${url:#{null}}")
    public static String url;

    public AddPaymentLocalResponse getPayment(AddPaymentLocal request) {

        log.info("Payment Request " + request);

       AddPaymentLocalResponse response = (AddPaymentLocalResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request, null);

        log.info("Add Payment Local " + response);
        return response;
    }

    public GetAccountBalanceResponse getBalanceEnquiry(GetAccountBalance request) {



        log.info("Balance Enquiry " + request);

        GetAccountBalanceResponse response = (GetAccountBalanceResponse) getWebServiceTemplate()
                .marshalSendAndReceive(url, request,null);

        log.info("Balance Response " + response);
        return response;
    }

}