import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private static final ArrayList<Supplier> mySupplierList = new ArrayList<>();
    private final String supplierID,supplierName,contact,email,address;

    public Supplier(String supplierID,String supplierName,String contact,String email,String address) {
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public String getSupplierID() {
        return supplierID;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public String getContact() {
        return contact;
    }
    public String getEmail() {return email;}
    public String getAddress() {return address;}

    public static void appendToList(Supplier supplier) {
        mySupplierList.add(supplier);
    }

    public static ArrayList<Supplier> getMySupplierList() {
        return mySupplierList;
    }
    
    public static Object[][] getTableObjectSupplier() {
        ArrayList<Supplier> list = getMySupplierList();
        Object[][] data = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getSupplierID();
            data[i][1] = list.get(i).getSupplierName();
            data[i][2] = list.get(i).getContact();
            data[i][3] = list.get(i).getEmail();
            data[i][4] = list.get(i).getAddress();
        }
        return data;
    }
    
     public static Object[][] searchTableObjectForSupplier(String input) {
        ArrayList<Supplier> list = getMySupplierList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Supplier supplier : list) {
            if (supplier.getSupplierName().toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {supplier.getSupplierID(),supplier.getSupplierName(),supplier.getContact(),supplier.getEmail(),supplier.getAddress()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }


}

