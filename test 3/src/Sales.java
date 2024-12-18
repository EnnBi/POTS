import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sales {

    private String salesID;
    private String itemID;
    private String date;
    private int salesQuantity;
    private static ArrayList<Sales> mySalesList = new ArrayList<>();

    public Sales(String salesID, String itemID, String date, int salesQuantity) {
        this.salesID = salesID;
        this.itemID = itemID;
        this.date = date;
        this.salesQuantity = salesQuantity;
    }

    public String getSalesID() {
        return salesID;
    }

    public String getItemID() {
        return itemID;
    }

    public String getDate() {
        return date;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public static ArrayList<Sales> getMySalesList() {
        return mySalesList;
    }

    public static void appendToList(Sales sales) {
        mySalesList.add(sales);
    }

    public static String retrieveSalesID(String itemID, String date) {
        ArrayList<Sales> list = getMySalesList();
        for (Sales sale : list) {
            if (sale.getItemID().equals(itemID) && sale.getDate().equals(date)) {
                return sale.getSalesID();
            }
        }
        return null;
    }

    public static int retrieveSalesQuantity(String salesID) {
        ArrayList<Sales> list = getMySalesList();
        for (Sales sale : list) {
            if (sale.getSalesID().equals(salesID)) {
                return sale.getSalesQuantity();
            }
        }
        return -1;
    }

    public static String generateNewSalesID() {
        int newIndex = getMySalesList().size() + 1;
        return String.format("S%03d", newIndex);
    }

    public static void replaceExistingSales(String salesID, int salesQuantity) {
        String itemID = null;
        for (Sales sale : mySalesList) {
            if (sale.getSalesID().equals(salesID)) {
                itemID = sale.getItemID();
                Item.addItemQuantity(itemID, sale.salesQuantity);
                Item.subtractItemQuantity(itemID, salesQuantity);
                sale.salesQuantity = salesQuantity;
                break;
            }
        }
        TextFileOperations.writeSalesFile();
    }

    public static Object[][] getTableObject() {
        ArrayList<Sales> list = getMySalesList();
        Object[][] data = new Object[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            data[i][0] = list.get(i).getSalesID();
            data[i][1] = Item.getNameFromID(list.get(i).getItemID());
            data[i][2] = list.get(i).getDate();
            data[i][3] = list.get(i).getSalesQuantity();
        }
        return data;
    }

    public static int getSumFromArray(Object[][] list) {
        int sum = 0;
        for (Object[] row : list) {
            sum += Integer.parseInt(row[3].toString());
        }
        return sum;
    }

    public static Object[][] searchTableObject(String input) {
        ArrayList<Sales> list = getMySalesList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Sales sale : list) {
            if (Item.getNameFromID(sale.getItemID()).toLowerCase().contains(input.toLowerCase())) {
                Object[] dataList = {sale.getSalesID(), Item.getNameFromID(sale.getItemID()), sale.getDate(), sale.getSalesQuantity()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }

    public static Object[][] searchTableObjectByDate(Date date) {
        ArrayList<Sales> list = getMySalesList();
        List<Object[]> filteredList = new ArrayList<>();

        for (Sales sale : list) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String formattedDate = dateFormat.format(date);

            if (sale.getDate().equals(formattedDate)) {
                Object[] dataList = {sale.getSalesID(), Item.getNameFromID(sale.getItemID()), sale.getDate(), sale.getSalesQuantity()};
                filteredList.add(dataList);
            }
        }

        Object[][] filteredData = new Object[filteredList.size()][4];
        for (int i = 0; i < filteredList.size(); i++) {
            filteredData[i] = filteredList.get(i);
        }

        return filteredData;
    }

    public static void main(String[] args) {
        TextFileOperations.readSalesFile();
        searchTableObjectByDate(new Date());
    }
}
