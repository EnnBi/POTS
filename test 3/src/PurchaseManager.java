public class PurchaseManager extends User{
    private String PurchaseManagerID;

    public PurchaseManager(String username, String password, String position, String fullName, String gender, String email, String addressLine1, String addressLine2, String addressLine3, String contactNo, String PurchaseManagerID)  {
        super(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo);
        this.PurchaseManagerID = PurchaseManagerID;
    }
    public String getSalesManagerID() {
        return PurchaseManagerID;
    }
    public void setSalesManagerID(String SalesManagerID) {
        this.PurchaseManagerID = SalesManagerID;
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
