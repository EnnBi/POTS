import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class Item {

    private static final ArrayList<Item> myItemList = new ArrayList<>();
    private String itemID,itemName,quantity,restockLevel,prices,category;

    public Item(String itemID, String itemName, String quantity, String restockLevel,String prices,String category) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.restockLevel = restockLevel;
        this.prices = prices;
        this.category = category;
    }

    public String getItemID() {return itemID;}
    public String getItemName() {return itemName;}
    public String getQuantity() {return quantity;}
    public String getRestockLevel() {return restockLevel;}
    public String getPrices() {return prices;}
    public String getCategory() {return category;}

    public static void appendToList(Item item) {
        myItemList.add(item);
    }

    public static ArrayList<Item> getMyItemList() {
        return myItemList;
    }

    public String getRestockRequire() {
        if (Integer.parseInt(this.quantity) >= Integer.parseInt(this.restockLevel)) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public static Object[][] getTableObject() {
        ArrayList<Item> list = getMyItemList();
        Object[][] data = new Object[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getItemID();
            data[i][1] = list.get(i).getItemName();
            data[i][2] = list.get(i).getCategory();
            data[i][3] = list.get(i).getQuantity();
        }
        return data;
    }
    
     public static Object[][] getTableObjectInventory() {
        ArrayList<Item> list = getMyItemList();
        Object[][] data = new Object[list.size()][6];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getItemID();
            data[i][1] = list.get(i).getItemName();
            data[i][2] = list.get(i).getCategory();
            data[i][3] = list.get(i).getQuantity();
            data[i][4] = list.get(i).getRestockLevel();
            data[i][5] = list.get(i).getPrices();
        }
        return data;
    }

    public static Object[][] getTableObjectForStock() {
        ArrayList<Item> list = getMyItemList();
        Object[][] data = new Object[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getItemID();
            data[i][1] = list.get(i).getItemName();
            data[i][2] = list.get(i).getQuantity();
            data[i][3] = list.get(i).getRestockLevel();
            data[i][4] = list.get(i).getRestockRequire();
        }
        return data;
    }
    
    public static Object[][] getTableObjectForUpdateStock() {
        ArrayList<Item> list = getMyItemList();
        Object[][] data = new Object[list.size()][6];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getItemID();
            data[i][1] = list.get(i).getItemName();
            data[i][2] = list.get(i).getCategory();
            data[i][3] = list.get(i).getQuantity();
            data[i][4] = list.get(i).getRestockLevel();
            data[i][5] = list.get(i).getPrices();
        }
        return data;
    }

    public static Object[][] sortTableObjectForStock(boolean require) {
        String status = require ? "Yes" : "No";
        List<Object[]> filteredData = new ArrayList<>();

        for (Item item : getMyItemList()) {
            if (item.getRestockRequire().equals(status)) {
                Object[] row = new Object[5];
                row[0] = item.getItemID();
                row[1] = item.getItemName();
                row[2] = item.getQuantity();
                row[3] = item.getRestockLevel();
                row[4] = item.getRestockRequire();
                filteredData.add(row);
            }
        }

        Object[][] data = new Object[filteredData.size()][5];
        return filteredData.toArray(data);
    }

    public static Object[][] searchTableObject(String input) {
        ArrayList<Item> list = getMyItemList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Item item : list) {
            if (item.getItemName().toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {item.getItemID(), item.getItemName(), item.getCategory(), item.getQuantity()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }
    
    public static Object[][] searchItemTableObject(String input) {
        ArrayList<Item> list = getMyItemList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Item item : list) {
            if (item.getItemName().toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {item.getItemID(), item.getItemName(), item.getCategory(), item.getQuantity(),item.getRestockLevel(),item.getPrices()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][6];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }

    public static Object[][] searchTableObjectForStock(String input) {
        ArrayList<Item> list = getMyItemList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Item item : list) {
            if (item.getItemName().toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {item.getItemID(), item.getItemName(), item.getQuantity(), item.getRestockLevel(), item.getRestockRequire()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }
    

    public static String [] getAllItemList() {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        ArrayList<String> itemList = new ArrayList<>();
        for (Item item : list) {
            if (itemList.contains(item.getItemName())) {
                continue;
            }
            itemList.add(item.getItemName());
        }

        return itemList.toArray(new String[0]);
    }

    public static String getItemIDFromName(String itemName) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                return item.getItemID();
            }
        }
        return null;
    }

    public static void subtractItemQuantity(String itemID, int newQuantity) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemID().equalsIgnoreCase(itemID)) {
                int quantityAfterModified = Integer.parseInt(item.quantity) - newQuantity;
                item.quantity = String.valueOf(quantityAfterModified);
            }
        }
        TextFileOperations.writeItemFile();
    }

    public static void addItemQuantity(String itemID, int newQuantity) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemID().equalsIgnoreCase(itemID)) {
                int quantityAfterModified = Integer.parseInt(item.quantity) + newQuantity;
                item.quantity = String.valueOf(quantityAfterModified);
            }
        }
        TextFileOperations.writeItemFile();
    }

    public static void clearList() {
        myItemList.clear();
    }

    public static String getNameFromID(String itemID) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemID().equalsIgnoreCase(itemID)) {
                return item.getItemName();
            }
        }
        return null;
    }

    public static int getQuantityFromName(String name) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                return Integer.parseInt(item.quantity);
            }
        }
        return -1;
    }

    public static double getPriceFromName(String name) {
        TextFileOperations.readItemFile();
        ArrayList<Item> list = getMyItemList();
        for (Item item : list) {
            if (item.getItemName().equalsIgnoreCase(name)) {
                return Double.parseDouble(item.prices);
            }
        }
        return -1;
    }

    public static String[] generateItemName() {
        ArrayList<String> myList = new ArrayList<>();
        for (Item item: getMyItemList()) {
            if (!myList.contains(item.itemName) && Integer.parseInt(item.quantity) < Integer.parseInt(item.restockLevel)) {
                myList.add(item.itemName);
            }
        }
        return myList.toArray(new String[0]);
    }

}

