import java.util.ArrayList;

public class PurchaseRequisition {

    private static final ArrayList<PurchaseRequisition> myPRList = new ArrayList<PurchaseRequisition>();
    private final String purchaseID,requesterName,itemName,quantity,date,status, remark;

    public PurchaseRequisition(String purchaseID, String requesterName, String itemName, String quantity, String date,String status, String remark) {
       this.purchaseID = purchaseID;
       this.requesterName = requesterName;
       this.itemName = itemName;
       this.quantity = quantity;
       this.date = date;
       this.status = status;
       this.remark = remark;
    }

    public String getRequesterName() {
        return requesterName;
    }
    public String getPurchaseID() {
        return purchaseID;
    }
    public String getQuantity() {
        return quantity;
    }
    public String getItemName() {return itemName;}
    public String getDate() {return date;}
    public String getStatus() {return status;}
    public String getRemark() {return remark;}

    public static void appendToList(PurchaseRequisition purchaseRequisition) {
        myPRList.add(purchaseRequisition);
    }

    public static ArrayList<PurchaseRequisition> getMyPRList() {
        return myPRList;
    }

}

