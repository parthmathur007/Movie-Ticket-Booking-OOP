public class Customer extends User {

    private int customerId;

    public Customer(String name, String email, int customerId) {
        super(name, email);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public void displayUser() {
        System.out.println("Customer: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Customer ID: " + customerId);
    }

    public void displayCustomer() {
        displayUser();
    }
}