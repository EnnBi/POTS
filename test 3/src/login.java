import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeoutException;

public class login implements ActionListener, MouseListener, WindowListener {

    // Components involved
    JFrame frame;
    JPanel titlePanel, contentPanel, inputPanel, roundedRectangle;
    JLabel titleLabel1, titleLabel2, bigLogoPlaceholder, smallLogoPlaceholder, usernameText, passwordText, usertypeText, exitButton;
    JTextField usernameInput;
    JPasswordField passwordInput;
    JComboBox<String> usertypeCombo;
    JButton loginButton;

    // Constructor
    public login() {

        // Create new frame
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.addWindowListener(this);

        // Create title bar (panel)
        titlePanel = new JPanel();
        titlePanel.setBounds(0, 0, 800, 100);
        titlePanel.setBackground(new Color(42, 100, 246));
        titlePanel.setLayout(null);

        // Create title
        titleLabel1 = new JLabel();
        titleLabel1.setText("Welcome to");
        titleLabel1.setBounds(20, 10, 760, 30);
        titleLabel1.setForeground(Color.WHITE);
        titleLabel1.setFont(new Font("Snap ITC", Font.BOLD, 18));

        titleLabel2 = new JLabel();
        titleLabel2.setText("PROCUREMENT ORDER TRACKING SYSTEM (POTS)");
        titleLabel2.setBounds(20, 50, 760, 30);
        titleLabel2.setForeground(Color.WHITE);
        titleLabel2.setFont(new Font("Snap ITC", Font.BOLD, 18));

        // Create another panel for content
        contentPanel = new JPanel();
        contentPanel.setBounds(0, 105, 800, 395);
        contentPanel.setBackground(new Color(181, 219, 242));
        contentPanel.setLayout(null);

        // Insert big logo
        bigLogoPlaceholder = new JLabel();
        ImageIcon icon1 = new ImageIcon("test 3/picture/login logo.png");
        bigLogoPlaceholder.setIcon(icon1);
        bigLogoPlaceholder.setBounds(10, 80, icon1.getIconWidth(), icon1.getIconHeight());

        // Insert small logo
        smallLogoPlaceholder = new JLabel();
        ImageIcon icon2 = new ImageIcon("test 3/picture/logo.png");
        smallLogoPlaceholder.setIcon(icon2);
        smallLogoPlaceholder.setBounds(535, 150, icon2.getIconWidth(), icon2.getIconHeight());

        // Create panel for input
        inputPanel = new JPanel();
        inputPanel.setBounds(400, 190, 350, 200);
        inputPanel.setLayout(null);
        inputPanel.setBackground(new Color(255, 255, 255, 1));

        // Insert rounded rectangle to input panel
        roundedRectangle = new DrawRoundedRectangle(inputPanel.getWidth(), inputPanel.getHeight(), 10, 2);
        roundedRectangle.setBounds(0, 0, inputPanel.getWidth(), inputPanel.getHeight());

        // Insert prompts for username, password and usertype
        usernameText = new JLabel();
        usernameText.setText("Username:");
        usernameText.setForeground(Color.BLACK);
        usernameText.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameText.setBounds(30, 60, 100, 30);

        passwordText = new JLabel();
        passwordText.setText("Password:");
        passwordText.setForeground(Color.BLACK);
        passwordText.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordText.setBounds(30, 100, 100, 30);

        usertypeText = new JLabel();
        usertypeText.setText("User type:");
        usertypeText.setForeground(Color.BLACK);
        usertypeText.setFont(new Font("Arial", Font.PLAIN, 16));
        usertypeText.setBounds(30, 140, 100, 30);

        // Insert text box for username and password
        usernameInput = new JTextField();
        usernameInput.setBounds(130, 63, 190, 25);
        usernameInput.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        passwordInput = new JPasswordField();
        passwordInput.setBounds(130, 103, 190, 25);
        passwordInput.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        // Insert combo box for user type
        usertypeCombo = new JComboBox<>(new String[] {"Admin", "Sales Manager", "Purchase Manager", "Inventory Manager", "Finance Manager"});
        usertypeCombo.setBounds(130, 143, 190, 25);

        // Insert button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setBackground(Color.blue);
        loginButton.setBounds(400, 300, 350, 50);
        loginButton.addActionListener(this);

        // Insert exit button
        exitButton = new JLabel();
        ImageIcon icon3 = new ImageIcon("test 3/picture/Exit (1).png");
        exitButton.setIcon(icon3);
        exitButton.setBounds(700, 15, icon3.getIconWidth(), icon3.getIconHeight());
        exitButton.addMouseListener(this);

        // Add title labels to title panel
        titlePanel.add(titleLabel1);
        titlePanel.add(titleLabel2);
        titlePanel.add(exitButton);

        // Add components to context panel
        contentPanel.add(bigLogoPlaceholder);
        contentPanel.add(loginButton);

        // Add components to input panel
        inputPanel.add(usernameText);
        inputPanel.add(passwordText);
        inputPanel.add(usertypeText);
        inputPanel.add(usernameInput);
        inputPanel.add(passwordInput);
        inputPanel.add(usertypeCombo);
        inputPanel.add(roundedRectangle);

        // Add components to frame
        frame.add(smallLogoPlaceholder);
        frame.add(inputPanel);
        frame.add(titlePanel);
        frame.add(contentPanel);

        frame.repaint();
    }

    public static void main(String[] args) {
        TextFileOperations.readUserFile();
        TextFileOperations.readItemFile();
        TextFileOperations.readSupplierFile();
        TextFileOperations.readPOFile();
        TextFileOperations.readSalesFile();
        TextFileOperations.readPRFile();
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameInput.getText();
        char[] charPassword = passwordInput.getPassword();
        StringBuilder password = new StringBuilder();
        for (char c : charPassword) {
            password.append(c);
        }
        String stringPassword = password.toString();
        String selection = (String) usertypeCombo.getSelectedItem();

        if (User.checkCredentials(username, stringPassword,selection)) {
            if (selection.equals("Admin")) {
                new AdminPage();
            } else if (selection.equals("Sales Manager")) {
                new SalesManagerPage(SalesManager.getUser(username,stringPassword,selection)).setVisible(true);
            } else if (selection.equals("Purchase Manager")) {
                JOptionPane.showMessageDialog(
            null,                     // Parent component (null for center of the screen)
            "This is an alert message!", // Message to display
            "Alert",                  // Title of the alert box
            JOptionPane.WARNING_MESSAGE // Icon type (e.g., ERROR_MESSAGE, INFORMATION_MESSAGE, etc.)
            );
                new SalesManagerPage(Purch.getUser(username,stringPassword,selection)).setVisible(true);
            } else if (selection.equals("Inventory Manager")) {
                new InventoryManagerPage();
            } else if (selection.equals("Finance Manager")) {
                new FinanceManagerPage();
            }
            frame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == exitButton) {
            int option = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, new ImageIcon("test 3/picture/Sure.png"));
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int choice = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", "Exit Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("test 3/picture/Sure.png"));
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

class DrawRoundedRectangle extends JPanel {

    // Initializes the data of the DrawRoundedRectangle.class
    int width, height, roundedCorner, borderThickness;

    // Constructor to include the inputted strings as one of the data from the objects.
    DrawRoundedRectangle(int width, int height, int roundedCorner, int borderThickness) {
        this.width = width;
        this.height = height;
        this.roundedCorner = roundedCorner;
        this.borderThickness = borderThickness;
    }

    // A method used to draw all sorts of paintings
    @Override
    public void paintComponent(Graphics g) {

        // Using Graphics2D for better picture quality
        Graphics2D g2d = (Graphics2D) g;

        // Set the colour of the rounded rectangle
        g2d.setColor(Color.WHITE);
        g2d.fillRoundRect(5, 5, width - 10, height - 10, roundedCorner, roundedCorner);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(borderThickness));
        g2d.drawRoundRect(5, 5, width - 10, height - 10, roundedCorner, roundedCorner);
    }
}