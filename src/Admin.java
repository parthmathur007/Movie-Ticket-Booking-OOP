public class Admin extends User {

    private String adminId;

    public Admin(String name, String email, String adminId) {
        super(name, email);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    @Override
    public void displayUser() {
        System.out.println("Admin: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Admin ID: " + adminId);
    }

    public void displayAdmin() {
        displayUser();
    }
}