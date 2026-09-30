public class Admin extends User {

    private String adminId;

    public Admin(String name, String email, String adminId) {
        super(name, email);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }

    public void displayAdmin() {
        displayUser();
        System.out.println("Admin ID: " + adminId);
    }
}