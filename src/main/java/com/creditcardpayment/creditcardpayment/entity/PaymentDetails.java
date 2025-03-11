package com.creditcardpayment.creditcardpayment.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.YearMonth;

@Entity
@Data
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long referenceId;
    private String cardHolderName;
    private String cardNumber;
    private String cvv;
    private String expiryDate;
}
