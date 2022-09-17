package combinatorpattern;

import java.time.LocalDate;

public class Combinator {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria",
                "abc@gmail",
                "1234567890",
                LocalDate.of(1999, 10, 1));

        CustomerValidationService customerValidationService = new CustomerValidationService();
        System.out.println(customerValidationService.isValid(maria));


    }
}
