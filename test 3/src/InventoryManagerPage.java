import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.table.DefaultTableCellRenderer;

public class InventoryManagerPage extends javax.swing.JFrame {
    public InventoryManagerPage() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InventoryManagerMainMenuPage = new javax.swing.JPanel();
        InventoryManagerHomePage = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        BarIcon = new javax.swing.JButton();
        HomePageTab = new javax.swing.JButton();
        EditDeleteItemTab = new javax.swing.JButton();
        ViewStockLevelsTab = new javax.swing.JButton();
        AddItemTab = new javax.swing.JButton();
        AddSupplierTab = new javax.swing.JButton();
        EditDeleteSupplierTab = new javax.swing.JButton();
        UpdateStockLevelsTab = new javax.swing.JButton();
        LogOutTab = new javax.swing.JButton();
        SwitchingTabPanel = new javax.swing.JTabbedPane();
        HomePage = new javax.swing.JPanel();
        AddItemPage = new javax.swing.JPanel();
        AddItem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AddItemTable = new javax.swing.JTable();
        NewItemInputPanel = new javax.swing.JPanel();
        AddItemIDLabel = new javax.swing.JLabel();
        ItemIDInput = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        ItemNameInput = new javax.swing.JTextField();
        AddCategoryLabel = new javax.swing.JLabel();
        CategoryInput = new javax.swing.JComboBox<>();
        AddQuantityLabel = new javax.swing.JLabel();
        QuantityInput = new javax.swing.JSpinner();
        AddIReorderLevelLabel = new javax.swing.JLabel();
        ReorderLevelInput = new javax.swing.JSpinner();
        AddPriceLabel = new javax.swing.JLabel();
        PriceInput = new javax.swing.JTextField();
        AddNewItemButton = new javax.swing.JButton();
        CancelAddItemButton = new javax.swing.JButton();
        EditDeleteItemPage = new javax.swing.JPanel();
        EditDeleteItem = new javax.swing.JPanel();
        EditItemInputPanel = new javax.swing.JPanel();
        EditItemID = new javax.swing.JLabel();
        InputItemID = new javax.swing.JTextField();
        EditItemName = new javax.swing.JLabel();
        InputItemName = new javax.swing.JTextField();
        EditCategory = new javax.swing.JLabel();
        InputCategory = new javax.swing.JComboBox<>();
        EditQuantity = new javax.swing.JLabel();
        InputQuantity = new javax.swing.JSpinner();
        EditReorderLevel = new javax.swing.JLabel();
        InputReorderLevel = new javax.swing.JSpinner();
        EditPrice = new javax.swing.JLabel();
        InputPrice = new javax.swing.JTextField();
        UpdateItemButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        DeleteItem = new javax.swing.JButton();
        SortItemChoice = new javax.swing.JComboBox<>();
        SortItemBy = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        EditDeleteItemTable = new javax.swing.JTable();
        SearchItemInput = new javax.swing.JTextField();
        AddSupplierPage = new javax.swing.JPanel();
        AddSupplier = new javax.swing.JPanel();
        NewSupplierInputPanel = new javax.swing.JPanel();
        AddSupplierIDLabel = new javax.swing.JLabel();
        SupplierIDInput = new javax.swing.JTextField();
        AddSupplierNameLabel = new javax.swing.JLabel();
        SupplierNameInput = new javax.swing.JTextField();
        AddContactNumberLabel = new javax.swing.JLabel();
        ContactNumberInput = new javax.swing.JTextField();
        AddEmailAddressLabel = new javax.swing.JLabel();
        EmailAddressInput = new javax.swing.JTextField();
        AddAddressLabel = new javax.swing.JLabel();
        AddressInput = new javax.swing.JTextField();
        AddNewSupplierButton = new javax.swing.JButton();
        CancelAddSupplierButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        AddSupplierTable = new javax.swing.JTable();
        EditDeleteSupplierPage = new javax.swing.JPanel();
        EditDeleteSupplier = new javax.swing.JPanel();
        UpdateSupplier = new javax.swing.JButton();
        DeleteSupplier = new javax.swing.JButton();
        BackButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        EditDeleteSupplierTable = new javax.swing.JTable();
        EditSupplierInputPanel = new javax.swing.JPanel();
        EditSupplierID = new javax.swing.JLabel();
        InputSupplierID = new javax.swing.JTextField();
        EditSupplierName = new javax.swing.JLabel();
        InputSupplierName = new javax.swing.JTextField();
        EditContactNumber = new javax.swing.JLabel();
        InputContactNumber = new javax.swing.JTextField();
        EditEmailAddress = new javax.swing.JLabel();
        InputEmailAddress = new javax.swing.JTextField();
        EditAddress = new javax.swing.JLabel();
        InputAddress = new javax.swing.JTextField();
        SortSupplierChoice = new javax.swing.JComboBox<>();
        SortSupplierBy = new javax.swing.JLabel();
        SearchSupplierInput = new javax.swing.JTextField();
        ViewStockLevelsPage = new javax.swing.JPanel();
        ViewStockLevels = new javax.swing.JPanel();
        SortStockChoice = new javax.swing.JComboBox<>();
        SortItemBy1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ViewStockLevelsTable = new javax.swing.JTable();
        searchStockLevel = new javax.swing.JTextField();
        UpdateStockLevelsPage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SortItemChoice2 = new javax.swing.JComboBox<>();
        SortItemBy2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        ViewStockLevelsTable1 = new javax.swing.JTable();
        SearchUpdateStockLevel = new javax.swing.JTextField();
        LogOutPage = new javax.swing.JPanel();
        jOptionPane1 = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Manager");
        setPreferredSize(new java.awt.Dimension(1040, 720));
        getContentPane().setLayout(new java.awt.CardLayout());

        InventoryManagerMainMenuPage.setBackground(new java.awt.Color(224, 242, 254));
        InventoryManagerMainMenuPage.setLayout(new java.awt.CardLayout());

        InventoryManagerHomePage.setBackground(new java.awt.Color(224, 242, 254));
        InventoryManagerHomePage.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(30, 58, 138));
        jPanel2.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INVENTORY MANAGER SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        InventoryManagerHomePage.add(jPanel2);
        jPanel2.setBounds(210, 0, 810, 40);

        Menu.setBackground(new java.awt.Color(30, 58, 138));

        BarIcon.setBackground(new java.awt.Color(30, 58, 138));
        BarIcon.setBorderPainted(false);

        HomePageTab.setBackground(new java.awt.Color(59, 130, 246));
        HomePageTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        HomePageTab.setForeground(new java.awt.Color(255, 255, 255));
        HomePageTab.setText("Home Page");
        HomePageTab.setToolTipText("Home Page");
        HomePageTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomePageTabActionPerformed(evt);
            }
        });

        EditDeleteItemTab.setBackground(new java.awt.Color(59, 130, 246));
        EditDeleteItemTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        EditDeleteItemTab.setForeground(new java.awt.Color(255, 255, 255));
        EditDeleteItemTab.setText("Edit/Delete Item");
        EditDeleteItemTab.setToolTipText("Add Supplier");
        EditDeleteItemTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDeleteItemTabActionPerformed(evt);
            }
        });

        ViewStockLevelsTab.setBackground(new java.awt.Color(59, 130, 246));
        ViewStockLevelsTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ViewStockLevelsTab.setForeground(new java.awt.Color(255, 255, 255));
        ViewStockLevelsTab.setText("View Stock Levels");
        ViewStockLevelsTab.setToolTipText("View Stock Levels");
        ViewStockLevelsTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStockLevelsTabActionPerformed(evt);
            }
        });

        AddItemTab.setBackground(new java.awt.Color(59, 130, 246));
        AddItemTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AddItemTab.setForeground(new java.awt.Color(255, 255, 255));
        AddItemTab.setText("Add Item");
        AddItemTab.setToolTipText("Add Item");
        AddItemTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemTabActionPerformed(evt);
            }
        });

        AddSupplierTab.setBackground(new java.awt.Color(59, 130, 246));
        AddSupplierTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        AddSupplierTab.setForeground(new java.awt.Color(255, 255, 255));
        AddSupplierTab.setText("Add Supplier");
        AddSupplierTab.setToolTipText("Add Supplier");
        AddSupplierTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupplierTabActionPerformed(evt);
            }
        });

        EditDeleteSupplierTab.setBackground(new java.awt.Color(59, 130, 246));
        EditDeleteSupplierTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        EditDeleteSupplierTab.setForeground(new java.awt.Color(255, 255, 255));
        EditDeleteSupplierTab.setText("Edit/Delete Supplier");
        EditDeleteSupplierTab.setToolTipText("View Stock Levels");
        EditDeleteSupplierTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDeleteSupplierTabActionPerformed(evt);
            }
        });

        UpdateStockLevelsTab.setBackground(new java.awt.Color(59, 130, 246));
        UpdateStockLevelsTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        UpdateStockLevelsTab.setForeground(new java.awt.Color(255, 255, 255));
        UpdateStockLevelsTab.setText("Update Stock Levels");
        UpdateStockLevelsTab.setToolTipText("View Stock Levels");
        UpdateStockLevelsTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStockLevelsTabActionPerformed(evt);
            }
        });

        LogOutTab.setBackground(new java.awt.Color(59, 130, 246));
        LogOutTab.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        LogOutTab.setForeground(new java.awt.Color(255, 255, 255));
        LogOutTab.setText("Log Out");
        LogOutTab.setToolTipText("View Stock Levels");
        LogOutTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ViewStockLevelsTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditDeleteItemTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddItemTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HomePageTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddSupplierTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditDeleteSupplierTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateStockLevelsTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LogOutTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(BarIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HomePageTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddItemTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditDeleteItemTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddSupplierTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditDeleteSupplierTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewStockLevelsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateStockLevelsTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogOutTab, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        InventoryManagerHomePage.add(Menu);
        Menu.setBounds(0, 0, 200, 680);

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SwitchingTabPanel.addTab("Home Page", HomePage);

        AddItemPage.setPreferredSize(new java.awt.Dimension(800, 600));
        AddItemPage.setLayout(new java.awt.CardLayout());

        AddItem.setBackground(new java.awt.Color(224, 242, 254));
        AddItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Item", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N
        AddItem.setName("Add Item Panel"); // NOI18N

        AddItemTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddItemTable.setModel(new javax.swing.table.DefaultTableModel(
            tableObject,
            new String [] {
                "Item ID", "Item Name", "Category", "Quantity", "Reorder Level", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(AddItemTable);
        if (AddItemTable.getColumnModel().getColumnCount() > 0) {
            AddItemTable.getColumnModel().getColumn(0).setResizable(false);
            AddItemTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            AddItemTable.getColumnModel().getColumn(1).setResizable(false);
            AddItemTable.getColumnModel().getColumn(2).setResizable(false);
            AddItemTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            AddItemTable.getColumnModel().getColumn(3).setResizable(false);
            AddItemTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            AddItemTable.getColumnModel().getColumn(4).setResizable(false);
            AddItemTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            AddItemTable.getColumnModel().getColumn(5).setResizable(false);
            AddItemTable.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        NewItemInputPanel.setBackground(new java.awt.Color(224, 242, 254));
        NewItemInputPanel.setToolTipText("");
        NewItemInputPanel.setLayout(new java.awt.GridLayout(7, 2, -400, 10));

        AddItemIDLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddItemIDLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddItemIDLabel.setText("Item ID:");
        AddItemIDLabel.setRequestFocusEnabled(false);
        AddItemIDLabel.setVerifyInputWhenFocusTarget(false);
        NewItemInputPanel.add(AddItemIDLabel);

        ItemIDInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        NewItemInputPanel.add(ItemIDInput);

        AddItemNameLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddItemNameLabel.setText("Item Name:");
        NewItemInputPanel.add(AddItemNameLabel);

        ItemNameInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        NewItemInputPanel.add(ItemNameInput);

        AddCategoryLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddCategoryLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddCategoryLabel.setText("Category:");
        NewItemInputPanel.add(AddCategoryLabel);

        CategoryInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CategoryInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Household Appliances", "Electrical Appliances", "Household Essentials" }));
        NewItemInputPanel.add(CategoryInput);

        AddQuantityLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddQuantityLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddQuantityLabel.setText("Quantity:");
        NewItemInputPanel.add(AddQuantityLabel);

        QuantityInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        QuantityInput.setModel(new javax.swing.SpinnerNumberModel());
        NewItemInputPanel.add(QuantityInput);
        JFormattedTextField qtyTextField = ((JSpinner.DefaultEditor) QuantityInput.getEditor()).getTextField();
        qtyTextField.setHorizontalAlignment(SwingConstants.LEFT);

        AddIReorderLevelLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddIReorderLevelLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddIReorderLevelLabel.setText("Reorder Level:");
        NewItemInputPanel.add(AddIReorderLevelLabel);

        ReorderLevelInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ReorderLevelInput.setModel(new javax.swing.SpinnerNumberModel());
        NewItemInputPanel.add(ReorderLevelInput);
        JFormattedTextField reorderTextField = ((JSpinner.DefaultEditor) ReorderLevelInput.getEditor()).getTextField();
        reorderTextField.setHorizontalAlignment(SwingConstants.LEFT);

        AddPriceLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddPriceLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddPriceLabel.setText("Price (RM):");
        NewItemInputPanel.add(AddPriceLabel);

        PriceInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PriceInput.setActionCommand("<Not Set>");
        NewItemInputPanel.add(PriceInput);

        AddNewItemButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddNewItemButton.setText("Add");
        AddNewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewItemButtonActionPerformed(evt);
            }
        });

        CancelAddItemButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CancelAddItemButton.setText("Cancel");
        CancelAddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAddItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemLayout = new javax.swing.GroupLayout(AddItem);
        AddItem.setLayout(AddItemLayout);
        AddItemLayout.setHorizontalGroup(
            AddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(AddNewItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CancelAddItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(302, 302, 302))
            .addGroup(AddItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewItemInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane3)
        );
        AddItemLayout.setVerticalGroup(
            AddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewItemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewItemButton)
                    .addComponent(CancelAddItemButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AddItemPage.add(AddItem, "Addtem");

        SwitchingTabPanel.addTab("Add Item", AddItemPage);

        EditDeleteItemPage.setLayout(new java.awt.CardLayout());

        EditDeleteItem.setBackground(new java.awt.Color(224, 242, 254));
        EditDeleteItem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit/ Delete Item", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N

        EditItemInputPanel.setBackground(new java.awt.Color(224, 242, 254));
        EditItemInputPanel.setToolTipText("");
        EditItemInputPanel.setLayout(new java.awt.GridLayout(7, 2, -400, 10));

        EditItemID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditItemID.setForeground(new java.awt.Color(100, 116, 139));
        EditItemID.setText("Item ID:");
        EditItemID.setRequestFocusEnabled(false);
        EditItemID.setVerifyInputWhenFocusTarget(false);
        EditItemInputPanel.add(EditItemID);

        InputItemID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditItemInputPanel.add(InputItemID);

        EditItemName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditItemName.setForeground(new java.awt.Color(100, 116, 139));
        EditItemName.setText("Item Name:");
        EditItemInputPanel.add(EditItemName);

        InputItemName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditItemInputPanel.add(InputItemName);

        EditCategory.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditCategory.setForeground(new java.awt.Color(100, 116, 139));
        EditCategory.setText("Category:");
        EditItemInputPanel.add(EditCategory);

        InputCategory.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        InputCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "Household Appliances", "Electrical Appliances", "Household Essentials" }));
        EditItemInputPanel.add(InputCategory);

        EditQuantity.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditQuantity.setForeground(new java.awt.Color(100, 116, 139));
        EditQuantity.setText("Quantity:");
        EditItemInputPanel.add(EditQuantity);

        InputQuantity.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        InputQuantity.setModel(new javax.swing.SpinnerNumberModel());
        EditItemInputPanel.add(InputQuantity);
        JFormattedTextField qtyTextFieldEdit = ((JSpinner.DefaultEditor) InputQuantity.getEditor()).getTextField();
        qtyTextFieldEdit.setHorizontalAlignment(SwingConstants.LEFT);

        EditReorderLevel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditReorderLevel.setForeground(new java.awt.Color(100, 116, 139));
        EditReorderLevel.setText("Reorder Level:");
        EditItemInputPanel.add(EditReorderLevel);

        InputReorderLevel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        InputReorderLevel.setModel(new javax.swing.SpinnerNumberModel());
        EditItemInputPanel.add(InputReorderLevel);
        JFormattedTextField reorderTextFieldEdit = ((JSpinner.DefaultEditor) InputReorderLevel.getEditor()).getTextField();
        reorderTextFieldEdit.setHorizontalAlignment(SwingConstants.LEFT);

        EditPrice.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditPrice.setForeground(new java.awt.Color(100, 116, 139));
        EditPrice.setText("Price:");
        EditItemInputPanel.add(EditPrice);

        InputPrice.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        InputPrice.setActionCommand("<Not Set>");
        EditItemInputPanel.add(InputPrice);

        UpdateItemButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UpdateItemButton.setText("Update");
        UpdateItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateItemButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BackButton.setText("Cancel");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteItem.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        DeleteItem.setText("Delete");
        DeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteItemActionPerformed(evt);
            }
        });

        SortItemChoice.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortItemChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item ID Descending", "Item ID Ascending", "Item Name A-Z", "Item Name Z-A" }));
        SortItemChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortItemChoiceActionPerformed(evt);
            }
        });

        SortItemBy.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortItemBy.setText("Sort by:");

        EditDeleteItemTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableModel = new javax.swing.table.DefaultTableModel(
            tableObject,
            new String [] {
                "Item ID", "Item Name", "Category", "Quantity", "Reorder Level", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        EditDeleteItemTable.setModel(tableModel
        );
        jScrollPane5.setViewportView(EditDeleteItemTable);
        if (EditDeleteItemTable.getColumnModel().getColumnCount() > 0) {
            EditDeleteItemTable.getColumnModel().getColumn(0).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            EditDeleteItemTable.getColumnModel().getColumn(1).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(2).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            EditDeleteItemTable.getColumnModel().getColumn(3).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            EditDeleteItemTable.getColumnModel().getColumn(4).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            EditDeleteItemTable.getColumnModel().getColumn(5).setResizable(false);
            EditDeleteItemTable.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        SearchItemInput.setText("Search for an item...");
        SearchItemInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchItemInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchItemInputFocusLost(evt);
            }
        });
        SearchItemInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchItemInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditDeleteItemLayout = new javax.swing.GroupLayout(EditDeleteItem);
        EditDeleteItem.setLayout(EditDeleteItemLayout);
        EditDeleteItemLayout.setHorizontalGroup(
            EditDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(EditDeleteItemLayout.createSequentialGroup()
                .addGroup(EditDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditItemInputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(EditDeleteItemLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SearchItemInput, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SortItemBy)
                        .addGap(18, 18, 18)
                        .addComponent(SortItemChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditDeleteItemLayout.createSequentialGroup()
                .addGap(0, 267, Short.MAX_VALUE)
                .addComponent(UpdateItemButton)
                .addGap(18, 18, 18)
                .addComponent(DeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        EditDeleteItemLayout.setVerticalGroup(
            EditDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditDeleteItemLayout.createSequentialGroup()
                .addComponent(EditItemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateItemButton)
                    .addComponent(DeleteItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortItemBy)
                    .addComponent(SortItemChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchItemInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EditDeleteItemPage.add(EditDeleteItem, "EditDeleteItem");

        SwitchingTabPanel.addTab("Edit/ Delete Item", EditDeleteItemPage);

        AddSupplierPage.setBackground(new java.awt.Color(224, 242, 254));
        AddSupplierPage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Supplier", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N
        AddSupplierPage.setLayout(new java.awt.CardLayout());

        AddSupplier.setBackground(new java.awt.Color(224, 242, 254));

        NewSupplierInputPanel.setBackground(new java.awt.Color(224, 242, 254));
        NewSupplierInputPanel.setToolTipText("");
        NewSupplierInputPanel.setLayout(new java.awt.GridLayout(5, 2, -400, 20));

        AddSupplierIDLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddSupplierIDLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddSupplierIDLabel.setText("Supplier ID:");
        AddSupplierIDLabel.setRequestFocusEnabled(false);
        AddSupplierIDLabel.setVerifyInputWhenFocusTarget(false);
        NewSupplierInputPanel.add(AddSupplierIDLabel);

        SupplierIDInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SupplierIDInput.setText("SUP01");
        SupplierIDInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SupplierIDInputFocusGained(evt);
            }
        });
        NewSupplierInputPanel.add(SupplierIDInput);

        AddSupplierNameLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddSupplierNameLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddSupplierNameLabel.setText("Supplier Name:");
        NewSupplierInputPanel.add(AddSupplierNameLabel);

        SupplierNameInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SupplierNameInput.setText("LG Electronics");
        SupplierNameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SupplierNameInputFocusGained(evt);
            }
        });
        NewSupplierInputPanel.add(SupplierNameInput);

        AddContactNumberLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddContactNumberLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddContactNumberLabel.setText("Contact Number:");
        NewSupplierInputPanel.add(AddContactNumberLabel);

        ContactNumberInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ContactNumberInput.setText("012-3456789");
        ContactNumberInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContactNumberInputFocusGained(evt);
            }
        });
        NewSupplierInputPanel.add(ContactNumberInput);

        AddEmailAddressLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddEmailAddressLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddEmailAddressLabel.setText("Email Address:");
        NewSupplierInputPanel.add(AddEmailAddressLabel);

        EmailAddressInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EmailAddressInput.setText("lgelectronics@gmail.com");
        EmailAddressInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailAddressInputFocusGained(evt);
            }
        });
        NewSupplierInputPanel.add(EmailAddressInput);

        AddAddressLabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        AddAddressLabel.setForeground(new java.awt.Color(100, 116, 139));
        AddAddressLabel.setText("Address:");
        NewSupplierInputPanel.add(AddAddressLabel);

        AddressInput.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddressInput.setText("23, Jalan Barat, Seksyen 8 Petaling Jaya, 46050 Petaling Jaya, Selangor");
        AddressInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddressInputFocusGained(evt);
            }
        });
        NewSupplierInputPanel.add(AddressInput);

        AddNewSupplierButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        AddNewSupplierButton.setText("Add");
        AddNewSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewSupplierButtonActionPerformed(evt);
            }
        });

        CancelAddSupplierButton.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CancelAddSupplierButton.setText("Cancel");
        CancelAddSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAddSupplierButtonActionPerformed(evt);
            }
        });

        AddSupplierTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        AddSupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            tableSupplierObject,
            new String [] {
                "Supplier ID", "Supplier Name", "Contact Number", "Email Address", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AddSupplierTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane4.setViewportView(AddSupplierTable);
        AddSupplierTable.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout AddSupplierLayout = new javax.swing.GroupLayout(AddSupplier);
        AddSupplier.setLayout(AddSupplierLayout);
        AddSupplierLayout.setHorizontalGroup(
            AddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSupplierLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(AddNewSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(CancelAddSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(306, 306, 306))
            .addGroup(AddSupplierLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(NewSupplierInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane4)
        );
        AddSupplierLayout.setVerticalGroup(
            AddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewSupplierInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewSupplierButton)
                    .addComponent(CancelAddSupplierButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        AddSupplierPage.add(AddSupplier, "AddSupplier");

        SwitchingTabPanel.addTab("Add Supplier", AddSupplierPage);

        EditDeleteSupplierPage.setBackground(new java.awt.Color(224, 242, 254));
        EditDeleteSupplierPage.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit/ Delete Supplier", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N
        EditDeleteSupplierPage.setLayout(new java.awt.CardLayout());

        EditDeleteSupplier.setBackground(new java.awt.Color(224, 242, 254));

        UpdateSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UpdateSupplier.setText("Update");
        UpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSupplierActionPerformed(evt);
            }
        });

        DeleteSupplier.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        DeleteSupplier.setText("Delete");
        DeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSupplierActionPerformed(evt);
            }
        });

        BackButton1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        BackButton1.setText("Cancel");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        EditDeleteSupplierTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableModel2 = new javax.swing.table.DefaultTableModel(
            tableSupplierObject,
            new String [] {
                "Supplier ID", "Supplier Name", "Contact Number", "Email Address", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            };
        };
        EditDeleteSupplierTable.setModel(tableModel2);
        jScrollPane6.setViewportView(EditDeleteSupplierTable);

        EditSupplierInputPanel.setBackground(new java.awt.Color(224, 242, 254));
        EditSupplierInputPanel.setToolTipText("");
        EditSupplierInputPanel.setLayout(new java.awt.GridLayout(5, 2, -400, 10));

        EditSupplierID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditSupplierID.setForeground(new java.awt.Color(100, 116, 139));
        EditSupplierID.setText("SupplierID:");
        EditSupplierID.setRequestFocusEnabled(false);
        EditSupplierID.setVerifyInputWhenFocusTarget(false);
        EditSupplierInputPanel.add(EditSupplierID);

        InputSupplierID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditSupplierInputPanel.add(InputSupplierID);

        EditSupplierName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditSupplierName.setForeground(new java.awt.Color(100, 116, 139));
        EditSupplierName.setText("Supplier Name:");
        EditSupplierInputPanel.add(EditSupplierName);

        InputSupplierName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditSupplierInputPanel.add(InputSupplierName);

        EditContactNumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditContactNumber.setForeground(new java.awt.Color(100, 116, 139));
        EditContactNumber.setText("Contact Number:");
        EditSupplierInputPanel.add(EditContactNumber);

        InputContactNumber.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        InputContactNumber.setActionCommand("<Not Set>");
        EditSupplierInputPanel.add(InputContactNumber);

        EditEmailAddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditEmailAddress.setForeground(new java.awt.Color(100, 116, 139));
        EditEmailAddress.setText("Email Address:");
        EditSupplierInputPanel.add(EditEmailAddress);

        InputEmailAddress.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditSupplierInputPanel.add(InputEmailAddress);

        EditAddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EditAddress.setForeground(new java.awt.Color(100, 116, 139));
        EditAddress.setText("Address:");
        EditSupplierInputPanel.add(EditAddress);

        InputAddress.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        EditSupplierInputPanel.add(InputAddress);

        SortSupplierChoice.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortSupplierChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier ID Descending", "Supplier ID Ascending", "Supplier Name A-Z", "Supplier Name Z-A", " " }));
        SortSupplierChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortSupplierChoiceActionPerformed(evt);
            }
        });

        SortSupplierBy.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortSupplierBy.setText("Sort by:");

        SearchSupplierInput.setText("Search for Supplier name...");
        SearchSupplierInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchSupplierInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchSupplierInputFocusLost(evt);
            }
        });
        SearchSupplierInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSupplierInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditDeleteSupplierLayout = new javax.swing.GroupLayout(EditDeleteSupplier);
        EditDeleteSupplier.setLayout(EditDeleteSupplierLayout);
        EditDeleteSupplierLayout.setHorizontalGroup(
            EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                .addGroup(EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                        .addGroup(EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(UpdateSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(SearchSupplierInput, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addComponent(SortSupplierBy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SortSupplierChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(EditSupplierInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane6)
        );
        EditDeleteSupplierLayout.setVerticalGroup(
            EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditDeleteSupplierLayout.createSequentialGroup()
                .addComponent(EditSupplierInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateSupplier)
                    .addComponent(DeleteSupplier)
                    .addComponent(BackButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EditDeleteSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortSupplierBy)
                    .addComponent(SortSupplierChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchSupplierInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );

        EditDeleteSupplierPage.add(EditDeleteSupplier, "EditDeleteSupplier");

        SwitchingTabPanel.addTab("Edit/ Delete Supplier", EditDeleteSupplierPage);

        ViewStockLevelsPage.setLayout(new java.awt.CardLayout());

        ViewStockLevels.setBackground(new java.awt.Color(224, 242, 254));
        ViewStockLevels.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Stock Level", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N

        SortStockChoice.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortStockChoice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Require Restock", "Does not Require Restock" }));
        SortStockChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortStockChoiceActionPerformed(evt);
            }
        });

        SortItemBy1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortItemBy1.setText("Sort by:");

        ViewStockLevelsTable.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableModel3 = new javax.swing.table.DefaultTableModel(
            tableStockObject,
            new String [] {
                "Item ID", "Item Name", "Quantity", "Reorder Level", "Require Restock?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        ViewStockLevelsTable.setModel(tableModel3);
        jScrollPane7.setViewportView(ViewStockLevelsTable);

        searchStockLevel.setText("Search for an item...");
        searchStockLevel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchStockLevelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchStockLevelFocusLost(evt);
            }
        });
        searchStockLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStockLevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewStockLevelsLayout = new javax.swing.GroupLayout(ViewStockLevels);
        ViewStockLevels.setLayout(ViewStockLevelsLayout);
        ViewStockLevelsLayout.setHorizontalGroup(
            ViewStockLevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewStockLevelsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(searchStockLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SortItemBy1)
                .addGap(18, 18, 18)
                .addComponent(SortStockChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        ViewStockLevelsLayout.setVerticalGroup(
            ViewStockLevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewStockLevelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewStockLevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortItemBy1)
                    .addComponent(SortStockChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchStockLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );

        ViewStockLevelsPage.add(ViewStockLevels, "ViewStockLevels");

        SwitchingTabPanel.addTab("View Stock Level", ViewStockLevelsPage);

        UpdateStockLevelsPage.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(224, 242, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139)), "Update Stock Level", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Verdana", 1, 20), new java.awt.Color(100, 116, 139))); // NOI18N

        SortItemChoice2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortItemChoice2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item ID Descending", "Item ID Ascending", "Item Name A-Z", "Item Name Z-A" }));
        SortItemChoice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortItemChoice2ActionPerformed(evt);
            }
        });

        SortItemBy2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        SortItemBy2.setText("Sort by:");

        ViewStockLevelsTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableModel4 = new javax.swing.table.DefaultTableModel(
            tableUpdateStockObject,
            new String [] {
                "Item ID", "Item Name","Category", "Quantity", "Reorder Level","Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Short.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
        ViewStockLevelsTable1.setModel(tableModel4);
        jScrollPane8.setViewportView(ViewStockLevelsTable1);

        SearchUpdateStockLevel.setText("Search for an item...");
        SearchUpdateStockLevel.setToolTipText("");
        SearchUpdateStockLevel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SearchUpdateStockLevelFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchUpdateStockLevelFocusLost(evt);
            }
        });
        SearchUpdateStockLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateStockLevelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(SearchUpdateStockLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SortItemBy2)
                .addGap(18, 18, 18)
                .addComponent(SortItemChoice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SortItemChoice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SortItemBy2))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchUpdateStockLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );

        UpdateStockLevelsPage.add(jPanel1, "card2");

        SwitchingTabPanel.addTab("Update Stock Level", UpdateStockLevelsPage);

        LogOutPage.setBackground(new java.awt.Color(224, 242, 254));

        javax.swing.GroupLayout LogOutPageLayout = new javax.swing.GroupLayout(LogOutPage);
        LogOutPage.setLayout(LogOutPageLayout);
        LogOutPageLayout.setHorizontalGroup(
            LogOutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutPageLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        LogOutPageLayout.setVerticalGroup(
            LogOutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogOutPageLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        SwitchingTabPanel.addTab("Log Out", LogOutPage);

        InventoryManagerHomePage.add(SwitchingTabPanel);
        SwitchingTabPanel.setBounds(210, 0, 810, 680);

        InventoryManagerMainMenuPage.add(InventoryManagerHomePage, "card3");

        getContentPane().add(InventoryManagerMainMenuPage, "card11");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetItemInputFields() {
    // Reset text fields
    ItemIDInput.setText("HA004");
    ItemNameInput.setText("Electric Kettle");
    PriceInput.setText("100.00");
    // Reset ComboBoxes
    CategoryInput.setSelectedIndex(0);   
    // Reset Spinners
    QuantityInput.setValue(0); 
    ReorderLevelInput.setValue(0); 
}

    private void ResetSupplierInputFields() {
        SupplierIDInput.setText("SUP01");
        SupplierNameInput.setText("LG Electronics");
        ContactNumberInput.setText("012-3456789");
        EmailAddressInput.setText("lgelectronics@gmail.com");
        AddressInput.setText("23, Jalan Barat, Seksyen 8 Petaling Jaya, 46050 Petaling Jaya, Selangor");
    }
    
    
    private void CancelAddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAddItemButtonActionPerformed
        SwitchingTabPanel.setSelectedIndex(0);
        // Set input fields
        ResetItemInputFields();
    }//GEN-LAST:event_CancelAddItemButtonActionPerformed

    private void CancelAddSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAddSupplierButtonActionPerformed
        SwitchingTabPanel.setSelectedIndex(0);
        ResetSupplierInputFields();
    }//GEN-LAST:event_CancelAddSupplierButtonActionPerformed

    private void AddNewItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewItemButtonActionPerformed
    // Check for any empty field
    if (ItemIDInput.getText().trim().isEmpty() || ItemNameInput.getText().trim().isEmpty() || 
        CategoryInput.getSelectedItem() == null || (Integer) QuantityInput.getValue() == 0 || 
        (Integer) ReorderLevelInput.getValue() == 0 || PriceInput.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all data!");
            return;
        }
  
    // Check if ItemID is unique
    String newItemID = ItemIDInput.getText();
    DefaultTableModel tblModel = (DefaultTableModel) AddItemTable.getModel();
    for (int i = 0; i < tblModel.getRowCount(); i++) {
        String existingItemID = (String) tblModel.getValueAt(i, 0);
        if (newItemID.equals(existingItemID)) {
            JOptionPane.showMessageDialog(this, "ItemID already exists! Please enter a unique ItemID.");
            return;
        }
    }
    
    // Check if Quantity and Reorder Level are positive integers
if ((Integer) QuantityInput.getValue() <= 0) {
    JOptionPane.showMessageDialog(this, "Quantity must be a positive integer!");
    return;
}

if ((Integer) ReorderLevelInput.getValue() <= 0) {
    JOptionPane.showMessageDialog(this, "Reorder Level must be a positive integer!");
    return;
}

    // Validate Price
    double price;
    try {
        price = Double.parseDouble(PriceInput.getText().trim());
        
        // Check if the price is negative
        if (price < 0) {
            JOptionPane.showMessageDialog(this, "Price cannot be negative!");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.");
        return;
    }

    // Format the price as RM currency
    DecimalFormat priceFormatter = new DecimalFormat("RM #,###.00");
    String formattedPrice = priceFormatter.format(price);

    // Get values from ComboBox and Spinner
    String Category = CategoryInput.getSelectedItem().toString();
    int Quantity = (Integer) QuantityInput.getValue();
    int ReorderLevel = (Integer) ReorderLevelInput.getValue();

    // Gather input data into an array
    String[] data = {
        ItemIDInput.getText(),
        ItemNameInput.getText(),
        Category,        
        String.valueOf(Quantity),
        String.valueOf(ReorderLevel),
        formattedPrice,                   
    };

    // Add data to the table model
    tblModel.addRow(data);

    // Create a new DefaultTableCellRenderer
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

    // Loop through each column and set the renderer for AddItemTable
    for (int i = 0; i < AddItemTable.getColumnCount(); i++) {
        AddItemTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }

    // Show confirmation message
    JOptionPane.showMessageDialog(this, "New item has been successfully added!");

    // Reset input fields
    ResetItemInputFields();
    }//GEN-LAST:event_AddNewItemButtonActionPerformed

    private void AddNewSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewSupplierButtonActionPerformed
        //Check for any empty field
        if (SupplierIDInput.getText().isEmpty() || SupplierNameInput.getText().isEmpty() ||
                ContactNumberInput.getText().isEmpty() || EmailAddressInput.getText().isEmpty() ||
                AddressInput.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all data!");
        } else {
            // Gather input data into an array
            String[] data = {
                    SupplierIDInput.getText(),
                    SupplierNameInput.getText(),
                    ContactNumberInput.getText(),
                    EmailAddressInput.getText(),
                    AddressInput.getText(),
            };

            // Add data to the table model
            DefaultTableModel tblModel = (DefaultTableModel) AddSupplierTable.getModel();
            tblModel.addRow(data);
            
            // Show confirmation message
            JOptionPane.showMessageDialog(this, "New supplier has been successfully added!");

            // Set input fields
            ResetSupplierInputFields(); 
        }
    }//GEN-LAST:event_AddNewSupplierButtonActionPerformed

    private void SupplierIDInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SupplierIDInputFocusGained
        // Clear the text when focus is gained
        if (SupplierIDInput.getText().equals("SUP01")) {
            SupplierIDInput.setText("");
        }
    }//GEN-LAST:event_SupplierIDInputFocusGained

    private void SupplierNameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SupplierNameInputFocusGained
        // Clear the text when focus is gained
        if (SupplierNameInput.getText().equals("LG Electronics")) {
            SupplierNameInput.setText("");
        }
    }//GEN-LAST:event_SupplierNameInputFocusGained

    private void ContactNumberInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContactNumberInputFocusGained
        // Clear the text when focus is gained
        if (ContactNumberInput.getText().equals("012-3456789")) {
            ContactNumberInput.setText("");
        }
    }//GEN-LAST:event_ContactNumberInputFocusGained

    private void EmailAddressInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailAddressInputFocusGained
        // Clear the text when focus is gained
        if (EmailAddressInput.getText().equals("lgelectronics@gmail.com")) {
            EmailAddressInput.setText("");
        }
    }//GEN-LAST:event_EmailAddressInputFocusGained

    private void AddressInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressInputFocusGained
        // Clear the text when focus is gained
        if (AddressInput.getText().equals("23, Jalan Barat, Seksyen 8 Petaling Jaya, 46050 Petaling Jaya, Selangor")) {
            AddressInput.setText("");
        }
    }//GEN-LAST:event_AddressInputFocusGained

    private void UpdateItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateItemButtonActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) EditDeleteItemTable.getModel();
        if (EditDeleteItemTable.getSelectedRowCount() == 1){
            // if single row is selected then update
            String ItemID = InputItemID.getText();
            String ItemName = InputItemName.getText();
            String Category = (String) InputCategory.getSelectedItem();
            String Quantity = String.valueOf(InputQuantity.getValue());
            String ReorderLevel = String.valueOf(InputReorderLevel.getValue());
            String Price = String.valueOf(InputPrice.getText());
            
            tblModel.setValueAt(ItemID, EditDeleteItemTable.getSelectedRow(), 0);
            tblModel.setValueAt(ItemName, EditDeleteItemTable.getSelectedRow(), 1);
            tblModel.setValueAt(Category, EditDeleteItemTable.getSelectedRow(), 2);
            tblModel.setValueAt(Quantity, EditDeleteItemTable.getSelectedRow(), 3);
            tblModel.setValueAt(ReorderLevel, EditDeleteItemTable.getSelectedRow(), 4);
            tblModel.setValueAt(Price, EditDeleteItemTable.getSelectedRow(), 5);
            
            // Show updated message
            JOptionPane.showMessageDialog(this, "Item details has been successfully updated!");
        }
        else{
            if(EditDeleteItemTable.getRowCount() == 0){
                // if table is empty
                JOptionPane.showMessageDialog(this, "Item table is empty...");
            }
            else{
                // if row is not selected or multiple row are selected
                JOptionPane.showMessageDialog(this, "Please select single row for update");
            }
        }
    }//GEN-LAST:event_UpdateItemButtonActionPerformed

    private void DeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteItemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) EditDeleteItemTable.getModel();
        // Check if a single row is selected
        if (EditDeleteItemTable.getSelectedRowCount() == 1) {
            // Show delete confirmation
            int response = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete this item?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
            );

            // If user confirms deletion
            if (response == JOptionPane.YES_OPTION) {
                // Delete the selected row
                tblModel.removeRow(EditDeleteItemTable.getSelectedRow());
                JOptionPane.showMessageDialog(this, "Item deleted successfully.");
            }
        } else {
            // Handle empty table
            if (EditDeleteItemTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Item table is empty...");
            } else {
                // Handle no row or multiple rows selected
                JOptionPane.showMessageDialog(this, "Please select a single row to delete...");
            }
        }
    }//GEN-LAST:event_DeleteItemActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        SwitchingTabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void UpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSupplierActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) EditDeleteSupplierTable.getModel();
        if (EditDeleteSupplierTable.getSelectedRowCount() == 1){
            // if single row is selected then update
            String SupplierID = InputSupplierID.getText();
            String SupplierName = InputSupplierName.getText();
            String ContactNumber = InputContactNumber.getText();
            String EmailAddress= InputEmailAddress.getText();
            String Address = InputAddress.getText();
            
            tblModel.setValueAt(SupplierID, EditDeleteSupplierTable.getSelectedRow(), 0);
            tblModel.setValueAt(SupplierName, EditDeleteSupplierTable.getSelectedRow(), 1);
            tblModel.setValueAt(ContactNumber, EditDeleteSupplierTable.getSelectedRow(), 2);
            tblModel.setValueAt(EmailAddress, EditDeleteSupplierTable.getSelectedRow(), 3);
            tblModel.setValueAt(Address, EditDeleteSupplierTable.getSelectedRow(), 4);
            
            // Show updated message
            JOptionPane.showMessageDialog(this, "Supplier details has been successfully updated!");
        }
        else{
            if(EditDeleteSupplierTable.getRowCount() == 0){
                // if table is empty
                JOptionPane.showMessageDialog(this, "Supplier table is empty...");
            }
            else{
                // if row is not selected or multiple row are selected
                JOptionPane.showMessageDialog(this, "Please select single row for update");
            }
        }
    }//GEN-LAST:event_UpdateSupplierActionPerformed

    private void DeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSupplierActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) EditDeleteSupplierTable.getModel();
        // delete row
        if (EditDeleteSupplierTable.getSelectedRowCount() == 1){
            // if single row is selected then delete row
            tblModel.removeRow(EditDeleteSupplierTable.getSelectedRow());
        }
        else{
            if(EditDeleteSupplierTable.getRowCount() == 0){
                // if table is empty
                JOptionPane.showMessageDialog(this, "Supplier table is empty...");
            }
            else{
                // if row is not selected or multiple row are selected
                JOptionPane.showMessageDialog(this, "Please select single row to delete...");
            }
        }
    }//GEN-LAST:event_DeleteSupplierActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        SwitchingTabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_BackButton1ActionPerformed

    private void SortSupplierChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortSupplierChoiceActionPerformed
        if (SortSupplierChoice.getSelectedItem().equals("Supplier ID Descending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[0]).compareTo((String) row2[0]);
                }
            };

            Arrays.sort( tableSupplierObject, comparator);

            tableModel2.setRowCount(0); for (Object[] row :  tableSupplierObject) {
                tableModel2.addRow(row);
            } 
        } 
        else if (SortSupplierChoice.getSelectedItem().equals("Supplier ID Ascending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[0]).compareTo((String) row1[0]);
                }
            };

            Arrays.sort( tableSupplierObject, comparator);

            tableModel2.setRowCount(0); for (Object[] row :  tableSupplierObject) {
                tableModel2.addRow(row);
            } 
        }
         if (SortSupplierChoice.getSelectedItem().equals("Supplier Name A-Z")) {

            // Comparator
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[1]).compareTo((String) row2[1]);
                }
            };

            // Sort the array
            Arrays.sort( tableSupplierObject, comparator);

            tableModel2.setRowCount(0);
            for (Object[] row :  tableSupplierObject) {
                tableModel2.addRow(row);
            }

        } else if (SortSupplierChoice.getSelectedItem().equals("Supplier Name Z-A")) {
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[1]).compareTo((String) row1[1]);
                }
            };

            Arrays.sort( tableSupplierObject, comparator);

            tableModel2.setRowCount(0); for (Object[] row :  tableSupplierObject) {
                tableModel2.addRow(row);
            } 
//        if (SortItemChoice.getSelectedItem().equals("Supplier ID Descending")) 
//        {
//            tableObject = Item.sortTableObjectForStock(true);
//            tblModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tblModel.addRow(row);
//            }
//        } 
//        else if (SortItemChoice.getSelectedItem().equals("Supplier ID Ascending")) 
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tblModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tblModel.addRow(row);
//            }
//        }
//        else if (SortItemChoice.getSelectedItem().equals("Supplier Name A-Z"))
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tblModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tblModel.addRow(row);
//            }
//        }
//        else if (SortItemChoice.getSelectedItem().equals("Supplier Name Z-A")) 
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tblModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tblModel.addRow(row);
//            }
//        }
    }//GEN-LAST:event_SortSupplierChoiceActionPerformed

    }
    private void SortItemChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortItemChoiceActionPerformed
        if (SortItemChoice.getSelectedItem().equals("Item ID Descending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[0]).compareTo((String) row2[0]);
                }
            };

            Arrays.sort(tableObject, comparator);

            tableModel.setRowCount(0); for (Object[] row : tableObject) {
                tableModel.addRow(row);
            } 
        } 
        else if (SortItemChoice.getSelectedItem().equals("Item ID Ascending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[0]).compareTo((String) row1[0]);
                }
            };

            Arrays.sort(tableObject, comparator);

            tableModel.setRowCount(0); for (Object[] row : tableObject) {
                tableModel.addRow(row);
            } 
        }
         if (SortItemChoice.getSelectedItem().equals("Item Name A-Z")) {

            // Comparator
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[1]).compareTo((String) row2[1]);
                }
            };

            // Sort the array
            Arrays.sort(tableObject, comparator);

            tableModel.setRowCount(0);
            for (Object[] row : tableObject) {
                tableModel.addRow(row);
            }

        } else if (SortItemChoice.getSelectedItem().equals("Item Name Z-A")) {
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[1]).compareTo((String) row1[1]);
                }
            };

            Arrays.sort(tableObject, comparator);

            tableModel.setRowCount(0); for (Object[] row : tableObject) {
                tableModel.addRow(row);
            } 
//        } else if (SortItemChoice.getSelectedItem().equals("Price Descending")) 
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tableModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tableModel.addRow(row);
//            }
//        }
//        else if (SortItemChoice.getSelectedItem().equals("Price Ascending")) 
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tableModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tableModel.addRow(row);
//            }
//        }
//        else if (SortItemChoice.getSelectedItem().equals("Category - Household Essentials")) 
//        {
//            tableObject = Item.sortTableObjectForStock(false);
//            tableModel.setRowCount(0);
//            for (Object[] row : tableObject) 
//            {
//                tableModel.addRow(row);
//            }
//        }
        }
    }//GEN-LAST:event_SortItemChoiceActionPerformed

    private void SortStockChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortStockChoiceActionPerformed
        if (SortStockChoice.getSelectedItem().equals("Require Restock")) {

             tableStockObject = Item.sortTableObjectForStock(true);

            tableModel3.setRowCount(0);
            for (Object[] row :  tableStockObject) {
                tableModel3.addRow(row);
            }

        } else if (SortStockChoice.getSelectedItem().equals("Does not Require Restock")) {

             tableStockObject = Item.sortTableObjectForStock(false);

            tableModel3.setRowCount(0);
            for (Object[] row :  tableStockObject) {
                tableModel3.addRow(row);
            }
        }
    }//GEN-LAST:event_SortStockChoiceActionPerformed

    private void HomePageTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomePageTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_HomePageTabActionPerformed

    private void EditDeleteItemTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDeleteItemTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(2);
    }//GEN-LAST:event_EditDeleteItemTabActionPerformed

    private void ViewStockLevelsTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStockLevelsTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(5);
    }//GEN-LAST:event_ViewStockLevelsTabActionPerformed

    private void AddItemTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(1);
    }//GEN-LAST:event_AddItemTabActionPerformed

    private void SortItemChoice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortItemChoice2ActionPerformed
     if (SortItemChoice2.getSelectedItem().equals("Item ID Descending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[0]).compareTo((String) row2[0]);
                }
            };

            Arrays.sort(tableUpdateStockObject, comparator);

            tableModel4.setRowCount(0); for (Object[] row : tableUpdateStockObject) {
                tableModel4.addRow(row);
            } 
        } 
        else if (SortItemChoice2.getSelectedItem().equals("Item ID Ascending")) 
        {
             Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[0]).compareTo((String) row1[0]);
                }
            };

            Arrays.sort(tableUpdateStockObject, comparator);

            tableModel4.setRowCount(0); for (Object[] row : tableUpdateStockObject) {
                tableModel4.addRow(row);
            } 
        }
         if (SortItemChoice2.getSelectedItem().equals("Item Name A-Z")) {

            // Comparator
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row1[1]).compareTo((String) row2[1]);
                }
            };

            // Sort the array
            Arrays.sort(tableUpdateStockObject, comparator);

            tableModel4.setRowCount(0);
            for (Object[] row : tableUpdateStockObject) {
                tableModel4.addRow(row);
            }

        } else if (SortItemChoice2.getSelectedItem().equals("Item Name Z-A")) {
            Comparator<Object[]> comparator = new Comparator<>() {
                @Override
                public int compare(Object[] row1, Object[] row2) {
                    return ((String) row2[1]).compareTo((String) row1[1]);
                }
            };

            Arrays.sort(tableUpdateStockObject, comparator);

            tableModel4.setRowCount(0); for (Object[] row : tableUpdateStockObject) {
                tableModel4.addRow(row);
            } 
        }
    }//GEN-LAST:event_SortItemChoice2ActionPerformed

    private void AddSupplierTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupplierTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(3);
    }//GEN-LAST:event_AddSupplierTabActionPerformed

    private void EditDeleteSupplierTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDeleteSupplierTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(4);
    }//GEN-LAST:event_EditDeleteSupplierTabActionPerformed

    private void UpdateStockLevelsTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStockLevelsTabActionPerformed
        SwitchingTabPanel.setSelectedIndex(6);
    }//GEN-LAST:event_UpdateStockLevelsTabActionPerformed

    private void LogOutTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutTabActionPerformed
        // Log out confirmation message
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            login loginFrame = new login();
            loginFrame.frame.setVisible(true); 
            this.dispose(); // 
        }
    }//GEN-LAST:event_LogOutTabActionPerformed

    private void SearchItemInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchItemInputActionPerformed
      String searchInput = SearchItemInput.getText();
        Object[][] updatedItems = Item.searchItemTableObject(searchInput);
        tableObject = updatedItems;
        tableModel.setRowCount(0);
        for (Object[] row : updatedItems) {
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_SearchItemInputActionPerformed

    private void SearchItemInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchItemInputFocusGained
        if(SearchItemInput.getText().equals("Search for an item...")){
            SearchItemInput.setText("");
        }
    }//GEN-LAST:event_SearchItemInputFocusGained

    private void SearchItemInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchItemInputFocusLost
        if(SearchItemInput.getText().equals("")){
            SearchItemInput.setText("Search for an item...");
        }
    }//GEN-LAST:event_SearchItemInputFocusLost

    private void SearchSupplierInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSupplierInputActionPerformed
        String searchInput = SearchSupplierInput.getText();
        Object[][] updatedSupplier = Supplier.searchTableObjectForSupplier(searchInput);
        tableSupplierObject = updatedSupplier;
        tableModel2.setRowCount(0);
        for (Object[] row : updatedSupplier) {
            tableModel2.addRow(row);
        }
    }//GEN-LAST:event_SearchSupplierInputActionPerformed

    private void SearchSupplierInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchSupplierInputFocusGained
        if(SearchSupplierInput.getText().equals("Search for Supplier name...")){
            SearchSupplierInput.setText("");
        }
    }//GEN-LAST:event_SearchSupplierInputFocusGained

    private void SearchSupplierInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchSupplierInputFocusLost
        if(SearchSupplierInput.getText().equals("")){
            SearchSupplierInput.setText("Search for Supplier name...");
        }
    }//GEN-LAST:event_SearchSupplierInputFocusLost

    private void searchStockLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStockLevelActionPerformed
        String searchInput = searchStockLevel.getText();
        Object[][] updatedItems = Item.searchTableObjectForStock(searchInput);
        tableStockObject = updatedItems;
        tableModel3.setRowCount(0);
        for (Object[] row : updatedItems) {
            tableModel3.addRow(row);
        }
    }//GEN-LAST:event_searchStockLevelActionPerformed

    private void searchStockLevelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchStockLevelFocusGained
        if(searchStockLevel.getText().equals("Search for an item...")){
            searchStockLevel.setText("");
        }
    }//GEN-LAST:event_searchStockLevelFocusGained

    private void searchStockLevelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchStockLevelFocusLost
         if(searchStockLevel.getText().equals("")){
            searchStockLevel.setText("Search for an item...");
        }
    }//GEN-LAST:event_searchStockLevelFocusLost

    private void SearchUpdateStockLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateStockLevelActionPerformed
        String searchInput =  SearchUpdateStockLevel.getText();
        Object[][] updatedItems = Item.searchTableObjectForStock(searchInput);
        tableObject = updatedItems;
        tableModel4.setRowCount(0);
        for (Object[] row : updatedItems) {
            tableModel4.addRow(row);
        }
    }//GEN-LAST:event_SearchUpdateStockLevelActionPerformed

    private void SearchUpdateStockLevelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchUpdateStockLevelFocusGained
        if(SearchUpdateStockLevel.getText().equals("Search for an item...")){
            SearchUpdateStockLevel.setText("");
        }
    }//GEN-LAST:event_SearchUpdateStockLevelFocusGained

    private void SearchUpdateStockLevelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchUpdateStockLevelFocusLost
        if(SearchUpdateStockLevel.getText().equals("")){
            SearchUpdateStockLevel.setText("Search for an item...");
        }
    }//GEN-LAST:event_SearchUpdateStockLevelFocusLost
    
    public void loadDataToViewStockLevelsTable() {
    DefaultTableModel stockLevelModel = (DefaultTableModel) ViewStockLevelsTable.getModel();

    // Clear existing rows
    stockLevelModel.setRowCount(0);

    ArrayList<Item> itemList = Item.getMyItemList();  // Get list of items

    // Iterate through the item list and add data to the model
    for (Item item : itemList) {
        int quantity = Integer.parseInt(item.getQuantity());
        int reorderLevel = Integer.parseInt(item.getRestockLevel());

        // Get stock status based on quantity and reorder level
        String stockStatus = getStockStatus(quantity, reorderLevel);

        // Add row data to the model
        Object[] rowData = {
            item.getItemID(),
            item.getItemName(),
            item.getCategory(),
            quantity,
            reorderLevel,
            stockStatus  // Stock status for the last column
        };
        stockLevelModel.addRow(rowData);
    }

    // Apply row color based on stock status
    for (int i = 0; i < ViewStockLevelsTable.getRowCount(); i++) {
        String status = (String) ViewStockLevelsTable.getValueAt(i, 5);  // Get stock status from the last column
        if (status.equals("Out of stock")) {
            // Set row color to red
            ViewStockLevelsTable.setRowSelectionInterval(i, i);
            ViewStockLevelsTable.setSelectionBackground(Color.RED);
        } else if (status.equals("Low stock")) {
            // Set row color to yellow
            ViewStockLevelsTable.setRowSelectionInterval(i, i);
            ViewStockLevelsTable.setSelectionBackground(Color.YELLOW);
        } else if (status.equals("In stock")) {
            // Set row color to green
            ViewStockLevelsTable.setRowSelectionInterval(i, i);
            ViewStockLevelsTable.setSelectionBackground(Color.GREEN);
        }
    }
}

// Method to determine stock status based on quantity and reorder level
private String getStockStatus(int quantity, int reorderLevel) {
    if (quantity == 0) {
        return "Out of stock";
    } else if (quantity < reorderLevel) {
        return "Low stock";
    } else {
        return "In stock";
    }
}

    
    public static void main(String[] args) {
        new InventoryManagerPage();
    }
    
    private Object[][] tableUpdateStockObject = Item.getTableObjectForUpdateStock();
    private Object[][] tableStockObject = Item.getTableObjectForStock();
    private Object[][] tableSupplierObject = Supplier.getTableObjectSupplier();
    private Object[][] tableObject = Item.getTableObjectInventory();
    private DefaultTableModel tableModel;
    private DefaultTableModel tableModel2;
    private DefaultTableModel tableModel3;
    private DefaultTableModel tableModel4;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAddressLabel;
    private javax.swing.JLabel AddCategoryLabel;
    private javax.swing.JLabel AddContactNumberLabel;
    private javax.swing.JLabel AddEmailAddressLabel;
    private javax.swing.JLabel AddIReorderLevelLabel;
    private javax.swing.JPanel AddItem;
    private javax.swing.JLabel AddItemIDLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPage;
    private javax.swing.JButton AddItemTab;
    private javax.swing.JTable AddItemTable;
    private javax.swing.JButton AddNewItemButton;
    private javax.swing.JButton AddNewSupplierButton;
    private javax.swing.JLabel AddPriceLabel;
    private javax.swing.JLabel AddQuantityLabel;
    private javax.swing.JPanel AddSupplier;
    private javax.swing.JLabel AddSupplierIDLabel;
    private javax.swing.JLabel AddSupplierNameLabel;
    private javax.swing.JPanel AddSupplierPage;
    private javax.swing.JButton AddSupplierTab;
    private javax.swing.JTable AddSupplierTable;
    private javax.swing.JTextField AddressInput;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton BarIcon;
    private javax.swing.JButton CancelAddItemButton;
    private javax.swing.JButton CancelAddSupplierButton;
    private javax.swing.JComboBox<String> CategoryInput;
    private javax.swing.JTextField ContactNumberInput;
    private javax.swing.JButton DeleteItem;
    private javax.swing.JButton DeleteSupplier;
    private javax.swing.JLabel EditAddress;
    private javax.swing.JLabel EditCategory;
    private javax.swing.JLabel EditContactNumber;
    private javax.swing.JPanel EditDeleteItem;
    private javax.swing.JPanel EditDeleteItemPage;
    private javax.swing.JButton EditDeleteItemTab;
    private javax.swing.JTable EditDeleteItemTable;
    private javax.swing.JPanel EditDeleteSupplier;
    private javax.swing.JPanel EditDeleteSupplierPage;
    private javax.swing.JButton EditDeleteSupplierTab;
    private javax.swing.JTable EditDeleteSupplierTable;
    private javax.swing.JLabel EditEmailAddress;
    private javax.swing.JLabel EditItemID;
    private javax.swing.JPanel EditItemInputPanel;
    private javax.swing.JLabel EditItemName;
    private javax.swing.JLabel EditPrice;
    private javax.swing.JLabel EditQuantity;
    private javax.swing.JLabel EditReorderLevel;
    private javax.swing.JLabel EditSupplierID;
    private javax.swing.JPanel EditSupplierInputPanel;
    private javax.swing.JLabel EditSupplierName;
    private javax.swing.JTextField EmailAddressInput;
    private javax.swing.JPanel HomePage;
    private javax.swing.JButton HomePageTab;
    private javax.swing.JTextField InputAddress;
    private javax.swing.JComboBox<String> InputCategory;
    private javax.swing.JTextField InputContactNumber;
    private javax.swing.JTextField InputEmailAddress;
    private javax.swing.JTextField InputItemID;
    private javax.swing.JTextField InputItemName;
    private javax.swing.JTextField InputPrice;
    private javax.swing.JSpinner InputQuantity;
    private javax.swing.JSpinner InputReorderLevel;
    private javax.swing.JTextField InputSupplierID;
    private javax.swing.JTextField InputSupplierName;
    private javax.swing.JPanel InventoryManagerHomePage;
    private javax.swing.JPanel InventoryManagerMainMenuPage;
    private javax.swing.JTextField ItemIDInput;
    private javax.swing.JTextField ItemNameInput;
    private javax.swing.JPanel LogOutPage;
    private javax.swing.JButton LogOutTab;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel NewItemInputPanel;
    private javax.swing.JPanel NewSupplierInputPanel;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JSpinner QuantityInput;
    private javax.swing.JSpinner ReorderLevelInput;
    private javax.swing.JTextField SearchItemInput;
    private javax.swing.JTextField SearchSupplierInput;
    private javax.swing.JTextField SearchUpdateStockLevel;
    private javax.swing.JLabel SortItemBy;
    private javax.swing.JLabel SortItemBy1;
    private javax.swing.JLabel SortItemBy2;
    private javax.swing.JComboBox<String> SortItemChoice;
    private javax.swing.JComboBox<String> SortItemChoice2;
    private javax.swing.JComboBox<String> SortStockChoice;
    private javax.swing.JLabel SortSupplierBy;
    private javax.swing.JComboBox<String> SortSupplierChoice;
    private javax.swing.JTextField SupplierIDInput;
    private javax.swing.JTextField SupplierNameInput;
    private javax.swing.JTabbedPane SwitchingTabPanel;
    private javax.swing.JButton UpdateItemButton;
    private javax.swing.JPanel UpdateStockLevelsPage;
    private javax.swing.JButton UpdateStockLevelsTab;
    private javax.swing.JButton UpdateSupplier;
    private javax.swing.JPanel ViewStockLevels;
    private javax.swing.JPanel ViewStockLevelsPage;
    private javax.swing.JButton ViewStockLevelsTab;
    private javax.swing.JTable ViewStockLevelsTable;
    private javax.swing.JTable ViewStockLevelsTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField searchStockLevel;
    // End of variables declaration//GEN-END:variables
}