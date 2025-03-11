package com.creditcardpayment.creditcardpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.creditcardpayment.creditcardpayment")
public class CreditCardPaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardPaymentApplication.class, args);
	}

}
