import java.util.ArrayList;

public class User {

    private static final ArrayList<User> myUserList = new ArrayList<>();
    private String username, password, position, fullName, gender, email, addressLine1, addressLine2, addressLine3, contactNo;

    public User(String username, String password, String position, String fullName, String gender, String email, String addressLine1, String addressLine2, String addressLine3, String contactNo) {
        this.username = username;
        this.password = password;
        this.position = position;
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.contactNo = contactNo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getPosition() {
        return position;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public static void appendToList(User user) {
        myUserList.add(user);
    }

    public static ArrayList<User> getMyUserList() {
        return myUserList;
    }

    public static boolean checkCredentials(String username, String password,String position) {

        boolean correctCredentials = false;

        for (User user : myUserList) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password) && user.getPosition().equals(position)) {
                correctCredentials = true;
                break;
            }
        }

        return correctCredentials;
    }

    // Method overloading - polymorphism
    public static User getUser(String username, String password, String position) {
        for (User user : myUserList) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password) && user.getPosition().equals(position)) {
                return user;
            }
        }
        return null;
    }

    public static User getUser(String fullName) {
        for (User user : myUserList) {
            if (user.getFullName().equals(fullName)) {
                return user;
            }
        }
        return null;
    }

    public static boolean checkUsernameAvailable(String input) {
        for (User user : myUserList) {
            if (input.equalsIgnoreCase(user.getUsername())) {
                return false;
            }
        }
        return true;
    }

    public static String generateNewId(String usertype) {
        String prefix = null;
        String formattedId;
        int counter = 0;
        for (User user : myUserList) {
            if (user.getPosition().equalsIgnoreCase(usertype)) {
                counter++;
            }
        }
        prefix = switch (usertype) {
            case "Admin" -> "A";
            case "Sales Manager" -> "SM";
            case "Purchase Manager" -> "PM";
            case "Inventory Manager" -> "IM";
            case "Finance Manager" -> "FM";
            default -> prefix;
        };
        if (usertype.equalsIgnoreCase("Admin")) {
            formattedId = String.format("%s%04d", prefix, counter + 1);
        } else {
            formattedId = String.format("%s%03d", prefix, counter + 1);
        }
        return formattedId;
    }

    public static String[] generateAllNames() {
        ArrayList<String> nameList = new ArrayList<>();
        for (User user : myUserList) {
            if (nameList.contains(user.getFullName())) {
                continue;
            }
            nameList.add(user.getFullName());
        }
        return nameList.toArray(new String[0]);
    }

}
