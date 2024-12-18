import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PurchaseManagerPage {
}

//public class PurchaseManagerPage extends javax.swing.JFrame implements ActionListener, MouseListener, WindowListener {
//
//    User purchaseManager;
//
//    public PurchaseManagerPage(User purchaseManager) {
//        initComponents(purchaseManager);
//        this.purchaseManager = purchaseManager;
//    }
//
//    @SuppressWarnings("unchecked")
//    private void initComponents(User purchaseManager) {
//        // Components Initialization
//        jPanel1 = new javax.swing.JPanel();
//        jPanel2 = new javax.swing.JPanel();
//        jPanel3 = new javax.swing.JPanel();
//        jPanel4 = new javax.swing.JPanel();
//        jPanel5 = new javax.swing.JPanel();
//        jPanel6 = new javax.swing.JPanel();
//        jPanel7 = new javax.swing.JPanel();
//        jPanel8 = new javax.swing.JPanel();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        jLabel4 = new javax.swing.JLabel();
//        jLabel5 = new javax.swing.JLabel();
//        jLabel6 = new javax.swing.JLabel();
//        jLabel7 = new javax.swing.JLabel();
//        jLabel8 = new javax.swing.JLabel();
//
//        // Exit Button
//        exitButton = new JLabel();
//        ImageIcon exitIcon = new ImageIcon("path/to/exit.png");
//        exitButton.setIcon(exitIcon);
//        exitButton.setBounds(700, 12, exitIcon.getIconWidth(), exitIcon.getIconHeight());
//        exitButton.addMouseListener(this);
//
//        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//        setPreferredSize(new Dimension(800, 500));
//        setResizable(false);
//        setSize(new Dimension(800, 500));
//        addWindowListener(this);
//
//        jPanel1.setBackground(new Color(51, 153, 255));
//
//        jLabel1.setFont(new Font("Comic Sans MS", Font.BOLD, 36));
//        jLabel1.setText("Purchase Manager Page");
//
//        // Button Panels with Mouse Listeners
//        createPanel(jPanel3, jLabel2, "View Item List");
//        createPanel(jPanel4, jLabel3, "View Suppliers List");
//        createPanel(jPanel5, jLabel4, "Create Requisition");
//        createPanel(jPanel6, jLabel5, "Create Purchase Order");
//        createPanel(jPanel7, jLabel6, "Modify Purchase Order");
//        createPanel(jPanel8, jLabel7, "View Purchase Order List");
//
//        jLabel8.setFont(new Font("Forte", Font.PLAIN, 28));
//        jLabel8.setText("Welcome, " + purchaseManager.getFullName());
//
//        // Panel Layouts
//        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel2Layout.createSequentialGroup()
//                    .addGap(50)
//                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
//                        .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                    .addGap(50)
//                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
//                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jPanel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                    .addGap(50)
//                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
//                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jPanel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                    .addContainerGap(50, Short.MAX_VALUE))
//                .addGroup(jPanel2Layout.createSequentialGroup()
//                    .addContainerGap()
//                    .addComponent(jLabel8)
//                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel2Layout.createSequentialGroup()
//                    .addContainerGap()
//                    .addComponent(jLabel8)
//                    .addGap(20)
//                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                    .addGap(30)
//                    .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                        .addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(jPanel7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                        .addComponent(jPanel8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
//                    .addContainerGap(20, Short.MAX_VALUE))
//        );
//
//        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel1Layout.createSequentialGroup()
//                    .addContainerGap()
//                    .addComponent(jLabel1)
//                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel1Layout.createSequentialGroup()
//                    .addComponent(jLabel1)
//                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
//                    .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
//                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        GroupLayout layout = new GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//        );
//
//        pack();
//    }
//
//    private void createPanel(JPanel panel, JLabel label, String text) {
//        panel.setBackground(new Color(153, 255, 255));
//        panel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
//        panel.addMouseListener(this);
//
//        label.setFont(new Font("Kristen ITC", Font.PLAIN, 18));
//        label.setText(text);
//
//        GroupLayout panelLayout = new GroupLayout(panel);
//        panel.setLayout(panelLayout);
//        panelLayout.setHorizontalGroup(
//            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(panelLayout.createSequentialGroup()
//                    .addGap(20)
//                    .addComponent(label)
//                    .addGap(20))
//        );
//        panelLayout.setVerticalGroup(
//            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
//                .addGroup(panelLayout.createSequentialGroup()
//                    .addGap(10)
//                    .addComponent(label)
//                    .addGap(10))
//        );
//    }
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        // Handle navigation based on which panel is clicked
//        if (e.getSource() == jPanel3) {
//            new ViewItem2(purchaseManager).setVisible(true);
//            dispose();
//        } else if (e.getSource() == jPanel4) {
//            new ViewSupplierPage(purchaseManager).setVisible(true);
//            dispose();
//        } else if (e.getSource() == jPanel5) {
//            new CreateRequisitionPage(purchaseManager).setVisible(true);
//            dispose();
//        } else if (e.getSource() == jPanel6) {
//            new CreatePurchaseOrderPage(purchaseManager).setVisible(true);
//            dispose();
//        } else if (e.getSource() == jPanel7) {
//            new ModifyPurchaseOrderPage(purchaseManager).setVisible(true);
//            dispose();
//        } else if (e.getSource() == jPanel8) {
//            new ViewPurchaseOrderPage(purchaseManager).setVisible(true);
//            dispose();
//        }
//    }
//
//    // Unused interface methods
//    @Override public void actionPerformed(ActionEvent e) {}
//    @Override public void mousePressed(MouseEvent e) {}
//    @Override public void mouseReleased(MouseEvent e) {}
//    @Override public void mouseEntered(MouseEvent e) {}
//    @Override public void mouseExited(MouseEvent e) {}
//    @Override public void windowOpened(WindowEvent e) {}
//    @Override public void windowClosing(WindowEvent e) {}
//    @Override public void windowClosed(WindowEvent e) {}
//    @Override public void windowIconified(WindowEvent e) {}
//    @Override public void windowDeiconified(WindowEvent e) {}
//    @Override public void windowActivated(WindowEvent e) {}
//    @Override public void windowDeactivated(WindowEvent e) {}
//
//    private javax.swing.JPanel jPanel1, jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, jPanel8;
//    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8;
//    private javax.swing.JLabel exitButton;
//
//    public static void main(String[] args) {
//        User pmUser = new User("pm", "password", "Purchase Manager", "John Doe", "Male", "pm@example.com", "Address1", "Address2", "Address3", "1234567890");
//        new PurchaseManagerPage(pmUser).setVisible(true);
//    }
//}
