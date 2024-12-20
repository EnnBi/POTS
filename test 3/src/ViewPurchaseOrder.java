import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author limha
 */
public class ViewPurchaseOrder extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form SalesReport
     */
    public ViewPurchaseOrder(User salesManager) {
        this.salesManager = salesManager;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ViewItem = new javax.swing.JPanel();
        SearchItem = new javax.swing.JTextField();
        ItemSortByLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewItem.setBackground(new java.awt.Color(153, 255, 255));
        ViewItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Purchase Order", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 24), new java.awt.Color(139, 69, 19))); // NOI18N
        ViewItem.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ViewItem.setName("Sales Report\n"); // NOI18N

        SearchItem.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        SearchItem.setText("Search for an item...");
        SearchItem.setToolTipText("");
        SearchItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchItemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchItemFocusLost(evt);
            }
        });
        SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchItemActionPerformed(evt);
            }
        });

        ItemSortByLabel.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        ItemSortByLabel.setText("Status:");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        tableModel = new javax.swing.table.DefaultTableModel(
                tableObject,
                new String [] {
                        "OrderID", "ItemID", "ItemName", "Quantity", "SupplierID", "Status", "Remarks"
                }
        );
        jTable1.setModel(tableModel);
        jTable1.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(245, 245, 220));
        jTable1.setRowHeight(50);
        jTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected", "Pending", "Received" }));
        jComboBox1.addActionListener(this);

        javax.swing.GroupLayout ViewItemLayout = new javax.swing.GroupLayout(ViewItem);
        ViewItem.setLayout(ViewItemLayout);
        ViewItemLayout.setHorizontalGroup(
                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewItemLayout.createSequentialGroup()
                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BackButton))
                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                .addGap(460, 460, 460)
                                                .addComponent(ItemSortByLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(ViewItemLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        ViewItemLayout.setVerticalGroup(
                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewItemLayout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ItemSortByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BackButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 858, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ViewItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 637, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(ViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 2, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new SalesManagerPage(salesManager).setVisible(true);
        dispose();
    }

    private void SearchItemActionPerformed(java.awt.event.ActionEvent evt) {
        String searchInput = SearchItem.getText();
        Object[][] updatedItems = PurchaseOrder.searchTableObject(searchInput);
        tableObject = updatedItems;
        tableModel.setRowCount(0);
        for (Object[] row : updatedItems) {
            tableModel.addRow(row);
        }
    }

    private void SearchItemFocusGained(java.awt.event.FocusEvent evt) {
        if(SearchItem.getText().equals("Search for an item...")){
            SearchItem.setText("");
        }
    }

    private void SearchItemFocusLost(java.awt.event.FocusEvent evt) {
        if(SearchItem.getText().isEmpty()){
            SearchItem.setText("Search for an item...");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPurchaseOrder(salesManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private static User salesManager;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ItemSortByLabel;
    private javax.swing.JTextField SearchItem;
    private javax.swing.JPanel ViewItem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Object[][] tableObject = PurchaseOrder.getTableObject();
    private javax.swing.table.DefaultTableModel tableModel;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jComboBox1) {
            String selection = jComboBox1.getSelectedItem().toString();
            Object[][] newList = PurchaseOrder.filterTableObjectFromStatus(selection);
            tableObject = newList;
            tableModel.setRowCount(0);
            for (Object[] row : newList) {
                tableModel.addRow(row);
            }
        }
    }
    // End of variables declaration                   
}