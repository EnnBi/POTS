import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    private static final ArrayList<PurchaseOrder> myPOList = new ArrayList<>();
    private final String orderID,itemID,itemName,quantity,supplierID,status,review;

    public PurchaseOrder(String orderID, String itemID, String itemName, String quantity, String supplierID, String status, String review) {
       this.orderID = orderID;
       this.itemID = itemID;
       this.itemName = itemName;
       this.quantity = quantity;
       this.supplierID = supplierID;
       this.status = status;
       this.review = review;
    }

    public String getOrderID() {return orderID;}
    public String getItemID() {return itemID;}
    public String getItemName() {return itemName;}
    public String getQuantity() {return quantity;}
    public String getSupplierID() {return supplierID;}
    public String getStatus() {return status;}
    public String getReview() {return review;}

    public static void appendToList(PurchaseOrder purchaseOrder) {
        myPOList.add(purchaseOrder);
    }

    public static ArrayList<PurchaseOrder> getMyPOList() {
        return myPOList;
    }

    public static Object[][] getTableObject() {
        ArrayList<PurchaseOrder> list = getMyPOList();
        Object[][] data = new Object[list.size()][7];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getOrderID();
            data[i][1] = list.get(i).getItemID();
            data[i][2] = list.get(i).getItemName();
            data[i][3] = list.get(i).getQuantity();
            data[i][4] = list.get(i).getSupplierID();
            data[i][5] = list.get(i).getStatus();
            data[i][6] = list.get(i).getReview();
        }
        return data;
    }

    public static Object[][] searchTableObject(String input) {
        ArrayList<PurchaseOrder> list = getMyPOList();
        List<Object[]> filteredList = new ArrayList<>();

        for (PurchaseOrder order : list) {
            if (order.getItemName().toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {order.getOrderID(), order.getItemID(), order.getItemName(), order.getQuantity(), order.getSupplierID(), order.getStatus(), order.getReview()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }

    public static Object[][] filterTableObjectFromStatus(String status) {
        ArrayList<PurchaseOrder> list = getMyPOList();
        List<Object[]> filteredList = new ArrayList<>();

        for (PurchaseOrder order : list) {
            if (order.getStatus().equalsIgnoreCase(status)) {
                Object[] dataList = {order.getOrderID(), order.getItemID(), order.getItemName(), order.getQuantity(), order.getSupplierID(), order.getStatus(), order.getReview()};
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

