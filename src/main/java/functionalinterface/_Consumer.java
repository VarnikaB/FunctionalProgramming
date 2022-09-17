package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    static Consumer<Customer> greetConsumerCustomer = customer ->
            System.out.println("Hello " + customer.name
                    + ", thanks for registering for phone number "
                    + customer.phoneNumber);

    public static void main(String[] args) {

        Customer customer = new Customer("Varnika", "1234567890");

        greetConsumerCustomer.accept(customer);

    }


    static class Customer {

        private final String name;
        private final String phoneNumber;

        Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
}
