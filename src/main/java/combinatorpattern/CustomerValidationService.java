package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidationService {

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneValid(String phone) {
        return phone.length() == 10;
    }

    private boolean isAdult(LocalDate DOB) {
        return Period.between(DOB, LocalDate.now()).getYears() >= 18;
    }

    public boolean isValid(Customer customer) {
        return isAdult(customer.getDob())
                && isPhoneValid(customer.getPhone())
                && isEmailValid(customer.getEmail());
    }

}
