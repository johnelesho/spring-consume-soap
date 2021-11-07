package com.quconn.integration.config;


import com.quconn.integration.service.PaymentClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PaymentConfiguration {

    @Value("${url:#{null}}")
    public static String url;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.quconn.integration.wsdl");
        return marshaller;
    }

    @Bean
    public PaymentClient paymentClient(Jaxb2Marshaller marshaller) {
      PaymentClient client = new PaymentClient();
        client.setDefaultUri(url);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}