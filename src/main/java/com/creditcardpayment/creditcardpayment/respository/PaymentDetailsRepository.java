package com.creditcardpayment.creditcardpayment.respository;

import com.creditcardpayment.creditcardpayment.entity.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Long> {


}
