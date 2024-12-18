
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileOperations {
    public static void readUserFile() {
        try {
            File file = new File("test 3/Text file/User.txt");
            Scanner read = new Scanner(file);
            while (read.hasNext()) {
                String[] information = read.nextLine().split(";");
                String username = information[0].strip();
                String password = information[1].strip();
                String position = information[2].strip();
                String fullName = information[4].strip();
                String gender = information[5].strip();
                String email = information[6].strip();
                String addressLine1 = information[7].strip();
                String addressLine2 = information[8].strip();
                String addressLine3 = information[9].strip();
                String contactNo = information[10].strip();
                if (position.equals("Sales Manager")) {
                    String salesId = information[3].strip();
                    SalesManager newSalesManager = new SalesManager(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo, salesId);
                    User.appendToList(newSalesManager);
                } else if (position.equals("Admin")) {
                    String adminId = information[3].strip();
                    Admin newAdmin = new Admin(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo, adminId);
                    User.appendToList(newAdmin);
                } else {
                    User newUser = new User(username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo);
                    User.appendToList(newUser);
                }
            }
            read.close();
        } catch (IOException ex) {
            System.out.println("Error while reading user file.");
        }

    }
    public static void readItemFile() {
        Item.clearList();
        try {
            File file = new File("test 3/Text file/Item.txt");
            Scanner read2 = new Scanner(file);
            while (read2.hasNext()) {
                String[] information = read2.nextLine().split(";");
                String itemID = information[0].strip();
                String itemName = information[1].strip();
                String quantity = information[2].strip();
                String restockLevel = information[3].strip();
                String prices = information[4].strip();
                String category = information[5].strip();
                Item newItem = new Item(itemID,itemName,quantity,restockLevel,prices,category);
                Item.appendToList(newItem);
            }
            read2.close();
        } catch (IOException ex) {
            System.out.println("Error while reading item file.");
        }
    }
    public static void readSupplierFile() {
        try {
            File file = new File("test 3/Text file/Supplier.txt");
            Scanner read3 = new Scanner(file);
            while (read3.hasNext()) {
                String[] information;
                information = read3.nextLine().split(";");
                String supplierID = information[0].strip();
                String supplierName = information[1].strip();
                String contact = information[2].strip();
                String email = information[3].strip();
                String address = information[4].strip();
                Supplier newSupplier = new Supplier(supplierID,supplierName,contact,email,address);
                Supplier.appendToList(newSupplier);
            }
            read3.close();
        } catch (IOException ex) {
            System.out.println("Error while reading supplier file.");
        }
    }
    public static void readPRFile() {
        try {
            File file = new File("test 3/Text file/Purchase Requisition.txt");
            Scanner read4 = new Scanner(file);
            while (read4.hasNext()) {
                String[] information;
                information = read4.nextLine().split(";");
                String purchaseID = information[0].strip();
                String requesterName = information[1].strip();
                String itemName = information[2].strip();
                String quantity  = information[3].strip();
                String date = information[4].strip();
                String status = information[5].strip();
                String remark = information[6].strip();
                PurchaseRequisition newPR = new PurchaseRequisition(purchaseID,requesterName,itemName,quantity,date,status, remark);
                PurchaseRequisition.appendToList(newPR);
            }
            read4.close();
        } catch (IOException ex) {
            System.out.println("Error while reading PR file.");
        }
    }
    public static void readPOFile() {
        try {
            File file = new File("test 3/Text file/Purchaser Orders.txt");
            Scanner read = new Scanner(file);
            while (read.hasNext()) {
                String[] information;
                information = read.nextLine().split(";");
                String orderID = information[0].strip();
                String itemID = information[1].strip();
                String itemName = information[2].strip();
                String quantity  = information[3].strip();
                String supplierID = information[4].strip();
                String status = information[5].strip();
                String review = information[6].strip();
                PurchaseOrder newPO = new PurchaseOrder(orderID,itemID,itemName,quantity,supplierID,status, review);
                PurchaseOrder.appendToList(newPO);
            }
            read.close();
        } catch (IOException ex) {
            System.out.println("Error while reading PO file.");
        }
    }

    public static void readSalesFile() {
        try {
            File file = new File("test 3/Text file/Sales.txt");
            Scanner read = new Scanner(file);
            while (read.hasNext()) {
                String[] information;
                information = read.nextLine().split(";");
                String salesID = information[0].strip();
                String itemID = information[1].strip();
                String salesDate = information[2].strip();
                int salesQuantity = Integer.parseInt(information[3].strip());
                Sales newSales = new Sales(salesID,itemID,salesDate,salesQuantity);
                Sales.appendToList(newSales);
            }
            read.close();
        } catch (IOException ex) {
            System.out.println("Error while reading Sales file.");
        }
    }

    /**
     * Write file
     */
    public static void writeUserFile() {
        ArrayList<User> myList = User.getMyUserList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        // username ; password ; usertype ; user id ; full name ; gender ; email ; address line 1 ; address line 2 ; address line 3 ; contact no
        while (i < myList.size()) {
            String username = String.format("%-20s", myList.get(i).getUsername());
            String password = String.format("%-20s", myList.get(i).getPassword());
            String position = String.format("%-25s", myList.get(i).getPosition());
            String fullName = String.format("%-30s", myList.get(i).getFullName());
            String gender = String.format("%-20s", myList.get(i).getGender());
            String email = String.format("%-30s", myList.get(i).getEmail());
            String addressLine1 = String.format("%-50s", myList.get(i).getAddressLine1());
            String addressLine2 = String.format("%-50s", myList.get(i).getAddressLine2());
            String addressLine3 = String.format("%-50s", myList.get(i).getAddressLine3());
            String contactNo = String.format("%-15s", myList.get(i).getContactNo());
            String line;
            if (myList.get(i) instanceof SalesManager salesManager) {
                String salesManagerID = String.format("%-10s", salesManager.getSalesManagerID());
                line = username + ";" + password + ";" + position + ";" + salesManagerID + ";" + fullName + ";" + gender + ";" + email + ";" + addressLine1 + ";" + addressLine2 + ";" + addressLine3 + ";" + contactNo;
            } else if (myList.get(i) instanceof Admin admin) {
                String adminId = String.format("%-10s", admin.getAdminId());
                line = username + ";" + password + ";" + position + ";" + adminId + ";" + fullName + ";" + gender + ";" + email + ";" + addressLine1 + ";" + addressLine2 + ";" + addressLine3 + ";" + contactNo;
            } else {
                line = username + ";" + password + ";" + position + ";" + "-         " + ";" + fullName + ";" + gender + ";" + email + ";" + addressLine1 + ";" + addressLine2 + ";" + addressLine3 + ";" + contactNo;
            }

            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/User.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing file.");
        }
    }
    public static void writeItemFile() {
        ArrayList<Item> myList = Item.getMyItemList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        while (i < myList.size()) {
            String itemID = String.format("%-10s", myList.get(i).getItemID());
            String itemName =String.format("%-25s", myList.get(i).getItemName());
            String quantity = String.format("%-5s", myList.get(i).getQuantity());
            String restockLevel = String.format("%-5s", myList.get(i).getRestockLevel());
            String prices = String.format("%-10s", myList.get(i).getPrices());
            String category = String.format("%-35s", myList.get(i).getCategory());

            String line = itemID + ";" + itemName + ";" + quantity + ";" + restockLevel + ";" + prices + ";" + category;
            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/Item.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing Item file.");
        }
    }
    public static void writeSupplierFile() {
        ArrayList<Supplier> myList = Supplier.getMySupplierList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        while (i < myList.size()) {
            String supplierID = String.format("%-10s", myList.get(i).getSupplierID());
            String supplierName = String.format("%-30s", myList.get(i).getSupplierName());
            String contact = String.format("%-15s", myList.get(i).getContact());
            String email = String.format("%-20s", myList.get(i).getEmail());
            String address = String.format("%-30s", myList.get(i).getAddress());

            String line = supplierID + ";" + supplierName + ";" + contact + ";" + email + ";" + address;
            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/Supplier.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing file.");
        }
    }
    public static void writePurchaseRequisitionFile() {
        ArrayList<PurchaseRequisition> myList = PurchaseRequisition.getMyPRList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        while (i < myList.size()) {
            String purchaseID = String.format("%-10s", myList.get(i).getPurchaseID());
            String requesterName =String.format("%-20s", myList.get(i).getRequesterName());
            String itemName = String.format("%-20s", myList.get(i).getItemName());
            String quantity  = String.format("%-10s", myList.get(i).getQuantity());
            String date = String.format("%-15s", myList.get(i).getDate());
            String status = String.format("%-15s", myList.get(i).getStatus());
            String remark = String.format("%-50s", myList.get(i).getRemark());

            String line = purchaseID + ";" + requesterName + ";" + itemName + ";" + quantity + ";" + date + ";" + status + ";" + remark;
            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/Purchase Requisition.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing PR file.");
        }
    }
    public static void writePurchaseOrdersFile() {
        ArrayList<PurchaseOrder> myList = PurchaseOrder.getMyPOList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        while (i < myList.size()) {
            String orderID = String.format("%-10s", myList.get(i).getOrderID());
            String itemID = String.format("%-10s", myList.get(i).getItemID());
            String itemName = String.format("%-20s", myList.get(i) .getItemName());
            String quantity  = String.format("%-7s", myList.get(i).getQuantity());
            String supplierID = String.format("%-10s", myList.get(i).getSupplierID());
            String status = String.format("%-15s", myList.get(i).getStatus());
            String review = String.format("%-50s", myList.get(i).getReview());
            String line = orderID + ";" + itemID + ";" + itemName + ";" + quantity + ";" + supplierID + ";" + status + ";" + review;
            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/Purchaser Orders.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing Po file.");
        }
    }
    public static void writeSalesFile() {
        ArrayList<Sales> myList = Sales.getMySalesList();
        ArrayList<String> textToWrite = new ArrayList<>();
        int i = 0;
        while (i < myList.size()) {
            String salesID = String.format("%-5s", myList.get(i).getSalesID());
            String itemID = String.format("%-5s", myList.get(i).getItemID());
            String salesDate = String.format("%-15s", myList.get(i).getDate());
            String quantity  = String.format("%-5s", myList.get(i).getSalesQuantity());

            String line = salesID + ";" + itemID + ";" + salesDate + ";" + quantity;
            textToWrite.add(line);
            i ++;
        }

        try {
            PrintWriter write = new PrintWriter("test 3/Text file/Sales.txt");
            for (String line : textToWrite) {
                write.println(line);
            }
            write.close();
        } catch (IOException ex) {
            System.out.println("Error while writing Sales file.");
        }
    }



}
