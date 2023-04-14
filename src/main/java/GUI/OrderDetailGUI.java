/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.CustomerBLL;
import BLL.OrderDetailBLL;
import BLL.VegetableBLL;
import DAL.PatternCheck;
import DTO.Order;
import DTO.OrderDetail;
import DTO.Vegetable;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Naomi On
 */
public class OrderDetailGUI extends javax.swing.JFrame {

    public final CustomerBLL customerBLL=new CustomerBLL();
    public final OrderDetailBLL orderDetailBLL=new OrderDetailBLL();
    public final VegetableBLL vegetableBLL=new VegetableBLL();
    public final PatternCheck check=new PatternCheck();
    public static Order order;
    
    public OrderDetailGUI(Order order) {
        initComponents();
        OrderDetailGUI.order=order;
        
        loadVegetable();
        loadOrderDetailByID();
        setUpCmbSearch();
        setUpVegetableID();
        setNumbericSpinner();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnRefreshVegetable = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVegetable = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        cmbSearch = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtOrderID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVegetableName = new javax.swing.JTextField();
        cmbVegetableID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRefreshOrderDetail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Orders Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Vegetable ID", "VegetableName", "Quantity", "Price"
            }
        ));
        tblOrderDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderDetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrderDetail);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefreshVegetable.setText("Refresh Vegetable");
        btnRefreshVegetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshVegetableActionPerformed(evt);
            }
        });

        tblVegetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "VegetableID", "VegetableName", "CategoryID", "Category Name", "Unit", "Amount", "Image", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblVegetable);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Order ID:");

        txtOrderID.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vegetable ID:");

        txtVegetableName.setEnabled(false);

        cmbVegetableID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVegetableID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVegetableIDActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Vegetable Name:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Price:");

        txtPrice.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Quantity:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRefreshOrderDetail.setText("Refresh Order Detail");
        btnRefreshOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshOrderDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel7)
                                .addGap(67, 67, 67)
                                .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmbVegetableID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(242, 242, 242))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefreshOrderDetail)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnRefreshVegetable)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVegetableName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVegetableID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnRefreshOrderDetail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnRefreshVegetable))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if (txtSearch.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out the information at the search box");
            return;
        }
        
        //vegID
        if(cmbSearch.getSelectedIndex()==0)
        {
            if(!check.CheckNumber(txtSearch.getText().toString()))
            {
                JOptionPane.showMessageDialog(this, "Search format is incorrect please try again!");
                return;
            }
            loadVegetableByVegetableID(Integer.parseInt(txtSearch.getText().toString()));
            
        }else if(cmbSearch.getSelectedIndex()==1)//vegName
        {
            loadVegetableByVegetableName(txtSearch.getText().toString());
            
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshVegetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshVegetableActionPerformed
        
        vegetableRefresh();
        
    }//GEN-LAST:event_btnRefreshVegetableActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       
        if(Integer.parseInt(spnQuantity.getValue().toString())<=0)
        {
            JOptionPane.showMessageDialog(this, "Please fill out all the information!");
            return;
        }
        
        int quantity=Integer.parseInt(spnQuantity.getValue().toString());
        int vegetableAmount=vegetableBLL.getVegetableListByID(Integer.parseInt(cmbVegetableID.getSelectedItem().toString())).getAmount();
        
        if(vegetableAmount==0)
        {
            JOptionPane.showMessageDialog(this, "This vegetable is out of stock please try again!");
            return;
        }
        else if(quantity>vegetableAmount)
        {
            JOptionPane.showMessageDialog(this, "The number of selected vegetable exceeds the limit please try again!");
            return;
        }
        
        OrderDetail orderDetail=new OrderDetail();
        orderDetail.setOrder(order);
        orderDetail.setQuantity(quantity);
        orderDetail.setVegetable(vegetableBLL.getVegetableListByID(Integer.parseInt(cmbVegetableID.getSelectedItem().toString())));
        float price=orderDetailBLL.calculatePrice(orderDetail.getVegetable().getVegetableID(), orderDetail.getQuantity());
        if(price==-1)
        {
            JOptionPane.showMessageDialog(this, "Calculate Price went wrong please try again");
            return;
        }
        orderDetail.setPrice(price);
        
        int result=orderDetailBLL.addOrderDetail(orderDetail);
        
        if(result==0)
        {
            JOptionPane.showMessageDialog(this, "Add OrderDetail Success!");
        }else
        {
            JOptionPane.showMessageDialog(this, "Add OrderDetail Failure!");
        }
        orderDetailRefresh();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbVegetableIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVegetableIDActionPerformed
        
        if(cmbVegetableID.getSelectedItem()!=null)
        {   
            Vegetable vegetable=vegetableBLL.getVegetableListByID(Integer.parseInt(cmbVegetableID.getSelectedItem().toString()));
            if(vegetable==null)
            {
                JOptionPane.showMessageDialog(this, "Can't load VegetableName");
                return;
            }
            txtVegetableName.setText(vegetable.getVegetableName());
        }
        
    }//GEN-LAST:event_cmbVegetableIDActionPerformed

    private void btnRefreshOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshOrderDetailActionPerformed
        orderDetailRefresh();
    }//GEN-LAST:event_btnRefreshOrderDetailActionPerformed

    private void tblOrderDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderDetailMouseClicked
        
        int selectedRow=tblOrderDetail.getSelectedRow();
        
        txtOrderID.setText(tblOrderDetail.getValueAt(selectedRow,0 ).toString());
        cmbVegetableID.setSelectedItem(tblOrderDetail.getValueAt(selectedRow,1).toString());
        spnQuantity.setValue(tblOrderDetail.getValueAt(selectedRow,3));
        txtPrice.setText(tblOrderDetail.getValueAt(selectedRow,4).toString());
        
    }//GEN-LAST:event_tblOrderDetailMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        OrderGUI ql = new OrderGUI();
        ql.setLocationRelativeTo(null);
        ql.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ql.setVisible(true);

        dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int selectedRow = tblOrderDetail.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "There is no row selected");
            return;
        }
        int orderID = Integer.parseInt(tblOrderDetail.getValueAt(selectedRow, 0).toString());
        int vegetableID= Integer.parseInt(tblOrderDetail.getValueAt(selectedRow, 1).toString());
                
        if (orderDetailBLL.deleteOrderDetailByIDAndVegetableID(orderID,vegetableID) == 0) {
            JOptionPane.showMessageDialog(this, "Delete OrderDetail Success!");
        } else {
            JOptionPane.showMessageDialog(this, "Delete OrderDetail Failed!");
        }

        orderDetailRefresh();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(OrderDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderDetailGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderDetailGUI(order).setVisible(true);
            }
        });
    }
    
    private void loadOrderDetail()
    {
        Object[][] data = orderDetailBLL.getOrderDetail();
        String[] title = {"Order ID","Vegetable ID","Vegetable Name","Quantity","Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblOrderDetail.setModel(model);
    }
    
    private void loadOrderDetailByID()
    {
        Object[][] data = orderDetailBLL.getOrderDetailByID(order.getOrderID());
        String[] title = {"Order ID","Vegetable ID","Vegetable Name","Quantity","Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblOrderDetail.setModel(model);
    }
    
    private void loadVegetable()
    {
        Object[][] data = vegetableBLL.getVegetable();
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Vegetable ID","Vegetable Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
    }
    
    private void loadVegetableByVegetableID(int vegetableID)
    {
        Object[][] data= vegetableBLL.getVegetableByID(vegetableID);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        
        String[] title = {"Vegetable ID","Vegetable Name","Vegetable ID","Vegetable Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
    }
    
    private void loadVegetableByVegetableName(String vegetableName)
    {
        Object[][] data= vegetableBLL.getVegetableByVegetableName(vegetableName);
        if(data.length==0)
        {
            JOptionPane.showMessageDialog(this, "Vegetable Is Null Or Error Please Try Again");
            return;
        }
        String[] title = {"Vegetable ID","Vegetable Name","Vegetable ID","Vegetable Name" ,"Unit", "Amount", "Images", "Price"};
        DefaultTableModel model = new DefaultTableModel(data, title);
        tblVegetable.setModel(model);
    }
    
    private void setUpCmbSearch()
    {
        cmbSearch.removeAllItems();
        cmbSearch.addItem("Vegetable ID");
        cmbSearch.addItem("Vegetable Name");
    }
    
    private void setUpVegetableID()
    {
        cmbVegetableID.removeAllItems();
        List<Vegetable> vegetableList=vegetableBLL.getVegetableList();
        if(vegetableList.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Get Vegetable Error Please Try Again");
            return;
        }
        for(Vegetable vegetable :vegetableList)
        {
            cmbVegetableID.addItem(String.valueOf(vegetable.getVegetableID()));
        }
    }
    
    private void setNumbericSpinner()
    {
        JFormattedTextField txt1 = ((JSpinner.NumberEditor) spnQuantity.getEditor()).getTextField();
        ((NumberFormatter) txt1.getFormatter()).setAllowsInvalid(false);
        
    }
    
    private void vegetableRefresh()
    {
        loadVegetable();
    }
    
    private void orderDetailRefresh()
    {
        txtOrderID.setText("");
        txtPrice.setText("");
        cmbVegetableID.setSelectedIndex(0);
        txtVegetableName.setText("");
        spnQuantity.setValue(0);
        
        loadOrderDetailByID();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefreshOrderDetail;
    private javax.swing.JButton btnRefreshVegetable;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbSearch;
    private javax.swing.JComboBox<String> cmbVegetableID;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTable tblVegetable;
    private javax.swing.JTextField txtOrderID;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtVegetableName;
    // End of variables declaration//GEN-END:variables
}
