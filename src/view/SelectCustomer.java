/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CustomerControl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Customer;
import model.Invoice;

/**
 *
 * @author DELL
 */
public class SelectCustomer extends javax.swing.JDialog {

    /**
     * Creates new form SelectCustomer
     */
    public SelectCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        selectCustomers(CustomerControl.getAllCustomer());
        setModal(true);
    }
    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialog = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectCustomerSearchText = new javax.swing.JTextField();
        selectCustomerSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectCustomerTable = new javax.swing.JTable();
        selectCustomerOkButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialog.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("Customers");

        selectCustomerSearch.setText("Search");
        selectCustomerSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCustomerSearchActionPerformed(evt);
            }
        });

        selectCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                " ID", " Name", "Email", "Address", "Contact Number", "Date Of Birth", "Gender"
            }
        ));
        selectCustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectCustomerTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(selectCustomerTable);

        selectCustomerOkButton.setText("OK");
        selectCustomerOkButton.setActionCommand("OK");
        selectCustomerOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCustomerOkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogLayout = new javax.swing.GroupLayout(dialog);
        dialog.setLayout(dialogLayout);
        dialogLayout.setHorizontalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel1)
                    .addContainerGap(588, Short.MAX_VALUE))
                .addGroup(dialogLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(120, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogLayout.createSequentialGroup()
                        .addComponent(selectCustomerSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectCustomerSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogLayout.createSequentialGroup()
                        .addComponent(selectCustomerOkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        dialogLayout.setVerticalGroup(
            dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(dialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCustomerSearchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectCustomerSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectCustomerOkButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectCustomerSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCustomerSearchActionPerformed
        
            List<Customer> searchCustomers = CustomerControl.getSearchCustomer(selectCustomerSearchText.getText());
            selectCustomers(searchCustomers);
        
    }//GEN-LAST:event_selectCustomerSearchActionPerformed

    private void selectCustomerTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCustomerTableMouseEntered
        /*  int index = customerTable.getSelectedRow();
        TableModel model = customerTable.getModel();

        Customer c=new Customer();
        c.setCustomerName(model.getValueAt(index, 0).toString());
        Invoices a=new Invoices();
        a.invoiceCustomerText.setText(c.getCustomerName());
        */
    }//GEN-LAST:event_selectCustomerTableMouseEntered

    private void selectCustomerOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCustomerOkButtonActionPerformed
      if(!selectCustomerTable.getSelectionModel().isSelectionEmpty()){
        int index = selectCustomerTable.getSelectedRow();
        TableModel model = selectCustomerTable.getModel();
        customer=new Customer();
        customer.setCustomerId(Integer.parseInt(model.getValueAt(index, 0).toString()));
        customer.setCustomerName(model.getValueAt(index, 1).toString());
        setCustomer(customer);
        
        this.dispose();
      }else{
      JOptionPane.showMessageDialog(null, "Please Select customer ", "ERROR", JOptionPane.INFORMATION_MESSAGE);
      } 
        
      
     
    }//GEN-LAST:event_selectCustomerOkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectCustomer dialog = new SelectCustomer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectCustomerOkButton;
    private javax.swing.JButton selectCustomerSearch;
    private javax.swing.JTextField selectCustomerSearchText;
    private javax.swing.JTable selectCustomerTable;
    // End of variables declaration//GEN-END:variables
void selectCustomers(List<Customer> customers) {
        DefaultTableModel model = (DefaultTableModel) selectCustomerTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for (int i = 0; i < customers.size(); i++) {
            row[0] = customers.get(i).getCustomerId();
            row[1] = customers.get(i).getCustomerName();
            row[2] = customers.get(i).getCustomerEmail();
            row[3] = customers.get(i).getAddress();
            row[4] = customers.get(i).getContactNumber();
            row[5] = customers.get(i).getDateOfBirth();
            row[6] = customers.get(i).getGender();

            model.addRow(row);

        }
        selectCustomerTable.setModel(model);
    }
}
