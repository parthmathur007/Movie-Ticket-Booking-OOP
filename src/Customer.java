public class Customer extends User {

    private int customerId;

    public Customer(String name, String email, int customerId) {
        super(name, email);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void displayCustomer() {
        displayUser();
        System.out.println("Customer ID: " + customerId);
    }
}
