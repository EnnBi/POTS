//import javax.swing.*;
//import javax.swing.table.DefaultTableCellRenderer;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class ViewItem2 extends javax.swing.JFrame {
//    /**
//     * Creates new form ViewItem
//     */
//    public ViewItem2(User salesManager) {
//        initComponents();
//    }
//
//    /**
//     * This method is called from within the constructor to initialize the form.
//     * WARNING: Do NOT modify this code. The content of this method is always
//     * regenerated by the Form Editor.
//     */
//    @SuppressWarnings("unchecked")
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//    private void initComponents() {
//
//        ViewItem = new javax.swing.JPanel();
//        SearchItem = new javax.swing.JTextField();
//        ViewItemScrollPane1 = new javax.swing.JScrollPane();
//        ItemTable1 = new javax.swing.JTable();
//        SortItem = new javax.swing.JComboBox<>();
//        ItemSortByLabel = new javax.swing.JLabel();
//        BackButton = new javax.swing.JButton();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        setResizable(false);
//
//        ViewItem.setBackground(new java.awt.Color(204, 255, 255));
//        ViewItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Items", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 24), new java.awt.Color(139, 69, 19))); // NOI18N
//        ViewItem.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
//        ViewItem.setName("ViewItem"); // NOI18N
//
//        SearchItem.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
//        SearchItem.setText("Search for an item...");
//        SearchItem.setToolTipText("");
//        SearchItem.addFocusListener(new java.awt.event.FocusAdapter() {
//            public void focusGained(java.awt.event.FocusEvent evt) {
//                SearchItemFocusGained(evt);
//            }
//            public void focusLost(java.awt.event.FocusEvent evt) {
//                SearchItemFocusLost(evt);
//            }
//        });
//        SearchItem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                SearchItemActionPerformed(evt);
//            }
//        });
//
//        ViewItemScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
//        ViewItemScrollPane1.setBorder(null);
//        ViewItemScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
//        ViewItemScrollPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
//
//        ItemTable1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
//        ItemTable1.setForeground(new java.awt.Color(0, 0, 0));
//        tableModel = new javax.swing.table.DefaultTableModel(
//                tableObject,
//                new String [] {
//                        "Item ID", "Item Name", "Category", "Quantity"
//                }
//        ) {
//            Class[] types = new Class [] {
//                    java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class
//            };
//            boolean[] canEdit = new boolean [] {
//                    false, false, false, false
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        };
//        ItemTable1.setModel(tableModel);
//        ItemTable1.setToolTipText("");
//        ItemTable1.getTableHeader().setFont(new Font("Verdana", Font.BOLD, 16));
//        ItemTable1.setGridColor(new java.awt.Color(204, 204, 204));
//        ItemTable1.setSelectionForeground(new java.awt.Color(245, 245, 220));
//        ItemTable1.setRowHeight(50);
//
//        // Left align for all columns
//        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
//        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
//        ItemTable1.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
//        ItemTable1.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);
//        ItemTable1.getColumnModel().getColumn(3).setCellRenderer(leftRenderer);
//
//        ViewItemScrollPane1.setViewportView(ItemTable1);
//
//        SortItem.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
//        SortItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item Name A-Z", "Item Name Z-A", "Lowest Quantity - Highest Quantity", "Highest Quantity - Lower Quantity" }));
//        SortItem.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                SortItemActionPerformed(evt);
//            }
//        });
//
//        ItemSortByLabel.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
//        ItemSortByLabel.setForeground(new java.awt.Color(139, 69, 19));
//        ItemSortByLabel.setText("Sort by:");
//
//        BackButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
//        BackButton.setText("Back");
//        BackButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                new PurchaseManagerPage(purchaseManager).setVisible(true);
//                dispose();
//            }
//        });
//
//        javax.swing.GroupLayout ViewItemLayout = new javax.swing.GroupLayout(ViewItem);
//        ViewItem.setLayout(ViewItemLayout);
//        ViewItemLayout.setHorizontalGroup(
//                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewItemLayout.createSequentialGroup()
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                .addComponent(BackButton)
//                                .addContainerGap())
//                        .addGroup(ViewItemLayout.createSequentialGroup()
//                                .addContainerGap()
//                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
//                                        .addComponent(ViewItemScrollPane1)
//                                        .addGroup(ViewItemLayout.createSequentialGroup()
//                                                .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(18, 18, 18)
//                                                .addComponent(ItemSortByLabel)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(SortItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addContainerGap(12, Short.MAX_VALUE))
//        );
//        ViewItemLayout.setVerticalGroup(
//                ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(ViewItemLayout.createSequentialGroup()
//                                .addGap(18, 18, 18)
//                                .addGroup(ViewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(SearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(ItemSortByLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(SortItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(18, 18, 18)
//                                .addComponent(ViewItemScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(BackButton)
//                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(0, 0, Short.MAX_VALUE)
//                                .addComponent(ViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(0, 0, Short.MAX_VALUE)
//                                .addComponent(ViewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//        );
//
//        pack();
//    }// </editor-fold>
//
//    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {
//        CardLayout cl = (CardLayout)(getContentPane().getLayout());
//        cl.show(getContentPane(), "InventoryManagerMainMenu");
//    }
//
//    private void SortItemActionPerformed(java.awt.event.ActionEvent evt) {
//        if (SortItem.getSelectedItem().equals("Item Name A-Z")) {
//
//            // Comparator
//            Comparator<Object[]> comparator = new Comparator<>() {
//                @Override
//                public int compare(Object[] row1, Object[] row2) {
//                    return ((String) row1[1]).compareTo((String) row2[1]);
//                }
//            };
//
//            // Sort the array
//            Arrays.sort(tableObject, comparator);
//
//            tableModel.setRowCount(0);
//            for (Object[] row : tableObject) {
//                tableModel.addRow(row);
//            }
//
//        } else if (SortItem.getSelectedItem().equals("Item Name Z-A")) {
//            Comparator<Object[]> comparator = new Comparator<>() {
//                @Override
//                public int compare(Object[] row1, Object[] row2) {
//                    return ((String) row2[1]).compareTo((String) row1[1]);
//                }
//            };
//
//            Arrays.sort(tableObject, comparator);
//
//            tableModel.setRowCount(0); for (Object[] row : tableObject) {
//                tableModel.addRow(row);
//            }
//        } else if (SortItem.getSelectedItem().equals("Lowest Quantity - Highest Quantity")) {
//            Comparator<Object[]> comparator = new Comparator<>() {
//                @Override
//                public int compare(Object[] row1, Object[] row2) {
//                    Integer number1 = Integer.parseInt((String) row1[3]);
//                    Integer number2 = Integer.parseInt((String) row2[3]);
//                    return (number1.compareTo(number2));
//                    }
//            };
//            Arrays.sort(tableObject, comparator);
//            tableModel.setRowCount(0);
//            for (Object[] row : tableObject) {
//                tableModel.addRow(row);
//            }
//        } else if (SortItem.getSelectedItem().equals("Highest Quantity - Lower Quantity")) {
//            Comparator<Object[]> comparator = new Comparator<>() {
//                @Override
//                public int compare(Object[] row1, Object[] row2) {
//                    Integer number1 = Integer.parseInt((String) row1[3]);
//                    Integer number2 = Integer.parseInt((String) row2[3]);
//                    return (number2.compareTo(number1));
//                }
//            };
//            Arrays.sort(tableObject, comparator); tableModel.setRowCount(0);
//            for (Object[] row : tableObject) {
//                tableModel.addRow(row);
//            }
//        }
//    }
//
//    private void SearchItemActionPerformed(java.awt.event.ActionEvent evt) {
//        String searchInput = SearchItem.getText();
//        Object[][] updatedItems = Item.searchTableObject(searchInput);
//        tableObject = updatedItems;
//        tableModel.setRowCount(0);
//        for (Object[] row : updatedItems) {
//            tableModel.addRow(row);
//        }
//    }
//
//    private void SearchItemFocusGained(java.awt.event.FocusEvent evt) {
//        if(SearchItem.getText().equals("Search for an item...")){
//            SearchItem.setText("");
//        }
//    }
//
//    private void SearchItemFocusLost(java.awt.event.FocusEvent evt) {
//        if(SearchItem.getText().equals("")){
//            SearchItem.setText("Search for an item...");
//        }
//    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ViewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//            }
//        });
//    }
//
//    // Variables declaration - do not modify
//    private javax.swing.JButton BackButton;
//    private javax.swing.JLabel ItemSortByLabel;
//    private javax.swing.JTable ItemTable1;
//    private javax.swing.JTextField SearchItem;
//    private javax.swing.JComboBox<String> SortItem;
//    private javax.swing.JPanel ViewItem;
//    private javax.swing.JScrollPane ViewItemScrollPane1;
//    private DefaultTableModel tableModel;
//    private Object[][] tableObject = Item.getTableObject();
//    // End of variables declaration
//}
