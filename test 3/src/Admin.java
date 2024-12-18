public class Admin extends User {
    private String adminId;

    public Admin(String username, String password, String position, String fullName, String gender, String email, String addressLine1, String addressLine2, String addressLine3, String contactNo, String adminId)  {
        super(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo);
        this.adminId = adminId;
    }

    public String getAdminId() {
        return adminId;
    }
}
