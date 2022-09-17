package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isValidPhoneNumber = phoneNumber ->
            phoneNumber.startsWith("1") && phoneNumber.length() == 10;

    public static void main(String[] args) {

        System.out.println(isValidPhoneNumber.test("1234567890"));
        System.out.println(isValidPhoneNumber.test("0123456789"));
        System.out.println(isValidPhoneNumber.test("01234567890"));


    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("1") && phoneNumber.length() == 10;
    }
}
