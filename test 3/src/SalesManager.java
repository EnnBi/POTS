public class SalesManager extends User{
    private String SalesManagerID;

    public SalesManager(String username, String password, String position, String fullName, String gender, String email, String addressLine1, String addressLine2, String addressLine3, String contactNo, String SalesManagerID)  {
        super(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo);
        this.SalesManagerID = SalesManagerID;
    }
    public String getSalesManagerID() {
        return SalesManagerID;
    }
    public void setSalesManagerID(String SalesManagerID) {
        this.SalesManagerID = SalesManagerID;
    }
    public String getSalesName() {
        return getUsername();
    }

    public String getSalesAddress() {
        return String.format("%s, %s, %s", getAddressLine1(), getAddressLine2(), getAddressLine3());
    }

    public String getSalesEmail() {
        return getEmail();
    }

}
