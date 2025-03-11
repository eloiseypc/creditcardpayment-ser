package com.creditcardpayment.creditcardpayment.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.YearMonth;

@Getter
@Setter
public class PaymentDetailsDto {

    private Long referenceId;
    private String cardHolderName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

}
