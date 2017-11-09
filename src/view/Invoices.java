/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProductControl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Customer;
import model.Invoice;
import model.Product;

/**
 *
 * @author DELL
 */
public class Invoices extends javax.swing.JFrame {

    /**
     * Creates new form Invoices
     */
    Invoice i = new Invoice();
    List<Product> addproduct = new ArrayList();
    Product currentproduct;

    public Invoices() {
        initComponents();
        this.setLocationRelativeTo(null);
        displayProduct1(ProductControl.getAllProducts());
    }
    Customer c;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewInvoiceButton = new javax.swing.JButton();
        invoiceHomeButton = new javax.swing.JButton();
        invoiceSearchText = new javax.swing.JTextField();
        invoiceSearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewProductTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        invoiceProductIdText = new javax.swing.JTextField();
        invoiceProductName = new javax.swing.JLabel();
        invoiceProductNameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        invoiceQtyText = new javax.swing.JTextField();
        invoiceAddButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addProductTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invoiceTotal2Text = new javax.swing.JTextField();
        invoiceDiscountText = new javax.swing.JTextField();
        invoiceTotal1Text = new javax.swing.JTextField();
        invoicePrintButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        invoiceCustomerText = new javax.swing.JTextField();
        invoiceAddCustomerButton = new javax.swing.JButton();
        invoiceRemoveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Generate Invoice");

        viewInvoiceButton.setText("View All Invoice");
        viewInvoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvoiceButtonActionPerformed(evt);
            }
        });

        invoiceHomeButton.setText("Home");
        invoiceHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceHomeButtonActionPerformed(evt);
            }
        });

        invoiceSearchButton.setText("Search");
        invoiceSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceSearchButtonActionPerformed(evt);
            }
        });

        viewProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Description", "Selling Price", "Quantity"
            }
        ));
        viewProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewProductTable);
        if (viewProductTable.getColumnModel().getColumnCount() > 0) {
            viewProductTable.getColumnModel().getColumn(0).setMinWidth(5);
            viewProductTable.getColumnModel().getColumn(0).setMaxWidth(50);
            viewProductTable.getColumnModel().getColumn(1).setMinWidth(5);
            viewProductTable.getColumnModel().getColumn(1).setMaxWidth(200);
            viewProductTable.getColumnModel().getColumn(2).setMinWidth(2);
            viewProductTable.getColumnModel().getColumn(2).setMaxWidth(150);
            viewProductTable.getColumnModel().getColumn(3).setMinWidth(2);
            viewProductTable.getColumnModel().getColumn(3).setMaxWidth(100);
            viewProductTable.getColumnModel().getColumn(4).setMinWidth(2);
            viewProductTable.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Product ID");

        invoiceProductName.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        invoiceProductName.setForeground(new java.awt.Color(204, 204, 0));
        invoiceProductName.setText("Product Name");

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Qty");

        invoiceAddButton.setText("Add to Invoice");
        invoiceAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceAddButtonActionPerformed(evt);
            }
        });

        addProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Quantity", "Unit Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(addProductTable);
        if (addProductTable.getColumnModel().getColumnCount() > 0) {
            addProductTable.getColumnModel().getColumn(0).setMinWidth(2);
            addProductTable.getColumnModel().getColumn(0).setMaxWidth(50);
            addProductTable.getColumnModel().getColumn(1).setMinWidth(2);
            addProductTable.getColumnModel().getColumn(1).setMaxWidth(300);
            addProductTable.getColumnModel().getColumn(2).setMinWidth(2);
            addProductTable.getColumnModel().getColumn(2).setMaxWidth(100);
            addProductTable.getColumnModel().getColumn(3).setMinWidth(2);
            addProductTable.getColumnModel().getColumn(3).setMaxWidth(100);
            addProductTable.getColumnModel().getColumn(4).setMinWidth(2);
            addProductTable.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Total");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Discount");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Total");

        invoiceDiscountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceDiscountTextActionPerformed(evt);
            }
        });
        invoiceDiscountText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                invoiceDiscountTextKeyTyped(evt);
            }
        });
        invoiceDiscountText.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                invoiceDiscountTextVetoableChange(evt);
            }
        });

        invoicePrintButton.setText("Print");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Customer");

        invoiceAddCustomerButton.setText("Search Customer");
        invoiceAddCustomerButton.setToolTipText("");
        invoiceAddCustomerButton.setActionCommand("");
        invoiceAddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceAddCustomerButtonActionPerformed(evt);
            }
        });

        invoiceRemoveButton.setText("Remove Product");
        invoiceRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(invoiceSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(invoiceSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(invoiceTotal1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(invoiceCustomerText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(invoiceAddCustomerButton)
                                        .addGap(66, 66, 66)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(invoiceDiscountText)
                                    .addComponent(invoiceRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invoicePrintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoiceTotal2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(invoiceProductIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(invoiceProductName)
                                    .addGap(18, 18, 18)
                                    .addComponent(invoiceProductNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(invoiceQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(invoiceAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewInvoiceButton)
                        .addGap(38, 38, 38)
                        .addComponent(invoiceHomeButton)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(viewInvoiceButton)
                    .addComponent(invoiceHomeButton))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceSearchButton))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(invoiceProductIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceProductName)
                    .addComponent(invoiceProductNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(invoiceQtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceAddButton))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(invoiceTotal2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceDiscountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceTotal1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(invoicePrintButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(invoiceCustomerText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceAddCustomerButton)
                            .addComponent(invoiceRemoveButton))))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceSearchButtonActionPerformed
        List<Product> searchProducts = ProductControl.getSearchProducts(invoiceSearchText.getText());
        displayProduct1(searchProducts);
    }//GEN-LAST:event_invoiceSearchButtonActionPerformed

    private void viewInvoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvoiceButtonActionPerformed
        new ViewInvoice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewInvoiceButtonActionPerformed

    private void invoiceHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceHomeButtonActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_invoiceHomeButtonActionPerformed

    private void invoiceAddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceAddCustomerButtonActionPerformed
        SelectCustomer dialog = new SelectCustomer(this, rootPaneCheckingEnabled);

        dialog.setVisible(true);
        c = new Customer();
        c = dialog.getCustomer();

        invoiceCustomerText.setText(c.getCustomerName());


    }//GEN-LAST:event_invoiceAddCustomerButtonActionPerformed

    private void viewProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductTableMouseClicked
        int index = viewProductTable.getSelectedRow();
        TableModel model = viewProductTable.getModel();
        currentproduct = new Product();
        currentproduct.setProductId(Integer.parseInt(model.getValueAt(index, 0).toString()));
        currentproduct.setProductName(model.getValueAt(index, 1).toString());
        currentproduct.setSellingPrice(new BigDecimal(model.getValueAt(index, 3).toString()));
        invoiceProductIdText.setText(Integer.toString(currentproduct.getProductId()));
        invoiceProductNameText.setText(currentproduct.getProductName());

    }//GEN-LAST:event_viewProductTableMouseClicked

    private void invoiceAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceAddButtonActionPerformed
        // TODO add your handling code here:
        if (!viewProductTable.getSelectionModel().isSelectionEmpty() && invoiceQtyText.getText().length() > 0) {
            currentproduct.setQuantity(Integer.parseInt(invoiceQtyText.getText()));

            addproduct.add(currentproduct);
            addProduct1(addproduct);

            BigDecimal amount = BigDecimal.ZERO;

            for (int i = 0; i < addProductTable.getRowCount(); i++) {
                //TableModel model = viewProductTable.getModel();
                BigDecimal total = new BigDecimal(addProductTable.getValueAt(i, 4).toString());
                amount = amount.add(total);

            }
            invoiceTotal1Text.setText(amount.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Please Select products ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
        //BigDecimal a=100;


    }//GEN-LAST:event_invoiceAddButtonActionPerformed

    private void invoiceDiscountTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceDiscountTextKeyTyped

    }//GEN-LAST:event_invoiceDiscountTextKeyTyped

    private void invoiceDiscountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceDiscountTextActionPerformed
        if (invoiceDiscountText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Discount", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            BigDecimal discount = null;
            BigDecimal finalTotal = null;
            discount = (new BigDecimal(invoiceTotal1Text.getText()).multiply(new BigDecimal(invoiceDiscountText.getText())).divide(new BigDecimal(100)));
            finalTotal = new BigDecimal(invoiceTotal1Text.getText()).subtract(discount);
            invoiceTotal2Text.setText(finalTotal.toString());
        }
    }//GEN-LAST:event_invoiceDiscountTextActionPerformed

    private void invoiceDiscountTextVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_invoiceDiscountTextVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceDiscountTextVetoableChange

    private void invoiceRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceRemoveButtonActionPerformed
        int index = addProductTable.getSelectedRow();
        ((DefaultTableModel) addProductTable.getModel()).removeRow(index);
        addproduct.remove(index);
    }//GEN-LAST:event_invoiceRemoveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable addProductTable;
    private javax.swing.JButton invoiceAddButton;
    private javax.swing.JButton invoiceAddCustomerButton;
    private javax.swing.JTextField invoiceCustomerText;
    private javax.swing.JTextField invoiceDiscountText;
    private javax.swing.JButton invoiceHomeButton;
    private javax.swing.JButton invoicePrintButton;
    private javax.swing.JTextField invoiceProductIdText;
    private javax.swing.JLabel invoiceProductName;
    private javax.swing.JTextField invoiceProductNameText;
    private javax.swing.JTextField invoiceQtyText;
    private javax.swing.JButton invoiceRemoveButton;
    private javax.swing.JButton invoiceSearchButton;
    private javax.swing.JTextField invoiceSearchText;
    private javax.swing.JTextField invoiceTotal1Text;
    private javax.swing.JTextField invoiceTotal2Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton viewInvoiceButton;
    private javax.swing.JTable viewProductTable;
    // End of variables declaration//GEN-END:variables

    void displayProduct1(List<Product> products) {
        DefaultTableModel model = (DefaultTableModel) viewProductTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < products.size(); i++) {
            row[0] = products.get(i).getProductId();
            row[1] = products.get(i).getProductName();
            row[2] = products.get(i).getDescripion();
            row[3] = products.get(i).getSellingPrice();
            row[4] = products.get(i).getQuantity();

            model.addRow(row);

        }
        viewProductTable.setModel(model);
    }

    void addProduct1(List<Product> products) {
        DefaultTableModel model = (DefaultTableModel) addProductTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < products.size(); i++) {
            row[0] = products.get(i).getProductId();
            row[1] = products.get(i).getProductName();
            row[2] = products.get(i).getQuantity();
            row[3] = products.get(i).getSellingPrice();
            row[4] = products.get(i).getSellingPrice().multiply(new BigDecimal(products.get(i).getQuantity()));

            model.addRow(row);

        }
        addProductTable.setModel(model);
    }

}
