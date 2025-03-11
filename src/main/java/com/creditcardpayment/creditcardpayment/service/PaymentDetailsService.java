package com.creditcardpayment.creditcardpayment.service;

import com.creditcardpayment.creditcardpayment.respository.PaymentDetailsRepository;
import lombok.RequiredArgsConstructor;
import model.CreatePaymentDetailsRequest;
import model.CreatePaymentDetailsResponse;
import com.creditcardpayment.creditcardpayment.entity.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentDetailsService {

    private final PaymentDetailsRepository paymentDetailsRepository;

    public CreatePaymentDetailsResponse savePaymentDetails(CreatePaymentDetailsRequest paymentDetailsRequest) throws Exception {

        // Create a PaymentDetails entity from the request
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setCardHolderName(paymentDetailsRequest.getCardHolderName());
        paymentDetails.setCardNumber(paymentDetailsRequest.getCardNumber());
        paymentDetails.setCvv(paymentDetailsRequest.getCvv());
        paymentDetails.setExpiryDate(paymentDetailsRequest.getExpiryDate());

        // Save entity to db
        PaymentDetails savedPaymentDetails = paymentDetailsRepository.save(paymentDetails);

        // Prepare response
        CreatePaymentDetailsResponse response = new CreatePaymentDetailsResponse();
        response.setReferenceId(savedPaymentDetails.getReferenceId());
        response.setStatus("SUCCESS");
        response.setMessage("Payment card details saved successfully.");

        return response;
    }
}
