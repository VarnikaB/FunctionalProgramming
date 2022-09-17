package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("1234567890"));
        System.out.println(isPhoneNumberValid("0123456789"));


    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("1") && phoneNumber.length() == 10;
    }
}
