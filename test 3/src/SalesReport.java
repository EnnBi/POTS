import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.MouseListener;
import java.util.Date;

public class SalesReport extends javax.swing.JFrame {

    public SalesReport(User salesManager) {
        SalesReport.salesManager = salesManager;
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        ViewItem = new javax.swing.JPanel();
        SearchItem = new javax.swing.JTextField();
        ItemSortByLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(835, 680));
        setResizable(false);

        jDateChooser1.addPropertyChangeListener("date", evt -> {
                Date inputDate = jDateChooser1.getDate();
                Date currentDate = new Date();
                if (inputDate != null && inputDate.after(currentDate)) {
                    JOptionPane.showMessageDialog(null, "Wrong date. Please re-enter the date and ensure that it is before today.");
                    jDateChooser1.setDate(null);
                } else if (inputDate != null) {
                    Object[][] newTableObject = Sales.searchTableObjectByDate(inputDate);
                    tableModel.setRowCount(0);
                    for (Object[] row : newTableObject) {
                        tableModel.addRow(row);
                    }
                    jLabel2.setText(String.valueOf(Sales.getSumFromArray(newTableObject)));
                }
            }
        );

        ViewItem.setBackground(new java.awt.Color(153, 255, 255));
        ViewItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        ViewItem.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        ViewItem.setName("Sales Report\n"); // NOI18N

        SearchItem.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        SearchItem.setText("Search for an item...");
        SearchItem.setToolTipText("");
        SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchItemActionPerformed(evt);
            }
        });
        SearchItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchItemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchItemFocusLost(evt);
            }
        });

        ItemSortByLabel.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        ItemSortByLabel.setText("Sort by Date:");

        BackButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        tableModel = new javax.swing.table.DefaultTableModel(
                tableObject,
                new String [] {
                        "SalesID", "Item", "Date", " Sales Quantity"
                }
        );
        jTable1.setModel(tableModel);
        jTable1.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
        jTable1.setToolTipText("");
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionForeground(new java.awt.Color(245, 245, 220));
        jTable1.setRowHeight(50);

        // Left align for all columns
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        jTable1.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(leftRenderer);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Total Sales Quantity:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText(String.valueOf(Sales.getSumFromArray(tableObject)));

        javax.swing.GroupLayout ViewItemLayout = new javax.swing.GroupLayout(ViewItem);
        ViewItem.setLayout(ViewItemLayout);
        ViewItemLayout.setHorizontalGroup(
                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewItemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(BackButton))
                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(ViewItemLayout.createSequentialGroup()
                                                                .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(ItemSortByLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 23, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        ViewItemLayout.setVerticalGroup(
                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ViewItemLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewItemLayout.createSequentialGroup()
                                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ItemSortByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel1))
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(BackButton)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 858, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 600, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(ViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

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

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new SalesManagerPage(salesManager).setVisible(true);
        dispose();
    }

    private void SearchItemActionPerformed(java.awt.event.ActionEvent evt) {
        String searchInput = SearchItem.getText();
        Object[][] updatedItems = Sales.searchTableObject(searchInput);
        tableObject = updatedItems;
        tableModel.setRowCount(0);
        for (Object[] row : updatedItems) {
            tableModel.addRow(row);
        }
        jLabel2.setText(String.valueOf(Sales.getSumFromArray(updatedItems)));
    }


    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport(salesManager).setVisible(true);
            }
        });
    }

    private static User salesManager;
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel ItemSortByLabel;
    private javax.swing.JTextField SearchItem;
    private javax.swing.JPanel ViewItem;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Object[][] tableObject = Sales.getTableObject();
    private javax.swing.table.DefaultTableModel tableModel;
}