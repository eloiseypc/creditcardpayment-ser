package com.creditcardpayment.creditcardpayment.controller;

import com.creditcardpayment.creditcardpayment.service.PaymentDetailsService;
import lombok.RequiredArgsConstructor;
import model.CreatePaymentDetailsRequest;
import model.CreatePaymentDetailsResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/paymentDetails", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class PaymentDetailsController {

    private final PaymentDetailsService paymentDetailsService;

    @PostMapping
    public CreatePaymentDetailsResponse paymentDetails (@Valid @RequestBody CreatePaymentDetailsRequest paymentDetailsRequest)
        throws Exception {

        return paymentDetailsService.savePaymentDetails(paymentDetailsRequest);

    }
}
