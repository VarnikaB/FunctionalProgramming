package functionalinterface;

public class _Consumer {
    public static void main(String[] args) {

        Customer customer = new Customer("Varnika", "1234567890");
        greetCustomer(customer);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name
                + ", thanks for registering for phone number "
                + customer.phoneNumber);
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
