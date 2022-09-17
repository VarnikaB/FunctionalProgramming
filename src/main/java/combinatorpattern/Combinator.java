package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Combinator {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria",
                "abc@gmail",
                "1234567890",
                LocalDate.of(1999, 10, 1));

        CustomerValidationService customerValidationService = new CustomerValidationService();
        System.out.println(customerValidationService.isValid(maria));

        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAdult())
                .apply(maria);

        System.out.println(result);




    }
}
