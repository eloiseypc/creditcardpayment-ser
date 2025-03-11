package model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.YearMonth;

@Getter
@Setter
public class CreatePaymentDetailsRequest {

    @NotBlank(message = "Card Holder Name is required.")
    private String cardHolderName;

    @NotBlank(message = "Card Number is required.")
    @Pattern(regexp = "\\d{16}", message = "Card Number must be 16 digits.")
    private String cardNumber;

    @NotBlank(message = "CVV is required.")
    @Pattern(regexp = "\\d{3}", message = "CVV must be 3 digits.")
    private String cvv;

    @NotNull(message = "Expiry Date is required.")
    private String expiryDate;


}
