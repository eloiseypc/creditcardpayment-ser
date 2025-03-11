package model;

import lombok.Getter;
import lombok.Setter;

import java.time.YearMonth;

@Getter
@Setter
public class CreatePaymentDetailsResponse {

    private Long referenceId;
    private String status;
    private String message;


}
