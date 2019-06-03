/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classesDialogues.AddTransaction;
import classesDialogues.AddProduct;
import classesDialogues.AddClient;
import services.CSV.CSV;
import services.database.DataManager;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import static services.database.DataManager.Connect;
import static services.database.DataManager.getTransactions;
import static services.database.DataManager.rezultat;

/**
 *
 * @author marius
 */



public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private ServiceClass Service;
    private int Category = 0;
    public Main() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel tableModel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        jTable.setModel(tableModel);
        jTable.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
        Service = new ServiceClass();
        Connect();
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTrans = new javax.swing.JButton();
        jProds = new javax.swing.JButton();
        jClients = new javax.swing.JButton();
        jDealers = new javax.swing.JButton();
        jClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jAddTable = new javax.swing.JButton();
        jDelete = new javax.swing.JButton();
        jModify = new javax.swing.JButton();
        jTrans1 = new javax.swing.JButton();
        jTrans2 = new javax.swing.JButton();
        jTrans3 = new javax.swing.JButton();
        jTrans4 = new javax.swing.JButton();
        jCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 270));

        jTrans.setText("Tranzactii");
        jTrans.setMaximumSize(new java.awt.Dimension(82, 29));
        jTrans.setMinimumSize(new java.awt.Dimension(82, 29));
        jTrans.setPreferredSize(new java.awt.Dimension(82, 29));
        jTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTransActionPerformed(evt);
            }
        });

        jProds.setText("Produse");
        jProds.setMaximumSize(new java.awt.Dimension(82, 29));
        jProds.setMinimumSize(new java.awt.Dimension(82, 29));
        jProds.setPreferredSize(new java.awt.Dimension(82, 29));
        jProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdsActionPerformed(evt);
            }
        });

        jClients.setText("Clienti");
        jClients.setMaximumSize(new java.awt.Dimension(82, 29));
        jClients.setMinimumSize(new java.awt.Dimension(82, 29));
        jClients.setPreferredSize(new java.awt.Dimension(82, 29));
        jClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientsActionPerformed(evt);
            }
        });

        jDealers.setText("Furnizori");
        jDealers.setMaximumSize(new java.awt.Dimension(82, 29));
        jDealers.setMinimumSize(new java.awt.Dimension(82, 29));
        jDealers.setPreferredSize(new java.awt.Dimension(82, 29));

        jClose.setText("Iesire");
        jClose.setMaximumSize(new java.awt.Dimension(82, 29));
        jClose.setMinimumSize(new java.awt.Dimension(82, 29));
        jClose.setPreferredSize(new java.awt.Dimension(82, 29));
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        jAddTable.setText("Adauga");
        jAddTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddTableActionPerformed(evt);
            }
        });

        jDelete.setText("Sterge");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });

        jModify.setText("Modifica");
        jModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifyActionPerformed(evt);
            }
        });

        jTrans1.setText("Mancaruri");

        jTrans2.setText("Angajati");
        jTrans2.setMaximumSize(new java.awt.Dimension(82, 29));
        jTrans2.setMinimumSize(new java.awt.Dimension(82, 29));
        jTrans2.setPreferredSize(new java.awt.Dimension(82, 29));

        jTrans3.setText("Taxe");
        jTrans3.setMaximumSize(new java.awt.Dimension(82, 29));
        jTrans3.setMinimumSize(new java.awt.Dimension(82, 29));
        jTrans3.setPreferredSize(new java.awt.Dimension(82, 29));

        jTrans4.setText("Carduri");
        jTrans4.setMaximumSize(new java.awt.Dimension(82, 29));
        jTrans4.setMinimumSize(new java.awt.Dimension(82, 29));
        jTrans4.setPreferredSize(new java.awt.Dimension(82, 29));

        jCSV.setText("CSV");
        jCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDealers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrans1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrans2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrans3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTrans4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jModify, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jCSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jModify)
                            .addComponent(jAddTable)
                            .addComponent(jDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDealers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTrans1)
                        .addGap(18, 18, 18)
                        .addComponent(jTrans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTrans3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTrans4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTransActionPerformed
        // TODO add your handling code here:
        Category = 0;
        try {
            populate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTransActionPerformed

    private void jAddTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddTableActionPerformed
        // TODO add your handling code here:
        if(Category == 0) 
        {
            AddTransaction addTransaction = new AddTransaction(this,true,Service);
            addTransaction.setLocationRelativeTo(null);
            addTransaction.setVisible(true);
            addTransaction.addWindowListener(new WindowAdapter() 
            {
              public void windowClosed(WindowEvent e)
              {
                  try {
                      populate();
                  } catch (SQLException ex) {
                      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
            });
            DataManager.log("Adauga Tranzactie");
        }
        if(Category == 1) 
        {
            AddProduct addProduct = new AddProduct(this,true,Service);
            addProduct.setLocationRelativeTo(null);
            addProduct.setVisible(true);
            addProduct.addWindowListener(new WindowAdapter() 
            {
              public void windowClosed(WindowEvent e)
              {
                  try {
                      populate();
                  } catch (SQLException ex) {
                      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
            });DataManager.log("Adauga produs");
        }
        if(Category == 2)
        {
            AddClient addClient = new AddClient(this,true,Service);
            addClient.setLocationRelativeTo(null);
            addClient.setVisible(true);
            addClient.addWindowListener(new WindowAdapter() 
            {
              public void windowClosed(WindowEvent e)
              {
                  try {
                      populate();
                  } catch (SQLException ex) {
                      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
            });
            DataManager.log("Adauga client");
        }
    }//GEN-LAST:event_jAddTableActionPerformed

    private void jProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdsActionPerformed
        // TODO add your handling code here:
        Category = 1;
        try {
            populate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jProdsActionPerformed

    private void jClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientsActionPerformed
        // TODO add your handling code here:
        Category = 2;
        try {
            populate();
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jClientsActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        if(Category == 0) 
        {
            Transaction trans = Service.getTransactions().get(jTable.getSelectedRow());
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Esti sigur ca vrei sa stergi tranzactia?", "Sterge tranzactie", dialogButton);
            if(dialogResult == 0) {
                DataManager.deleteTransaction(String.valueOf(trans.getID()));
                try {
                    populate();
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
              
            } 
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifyActionPerformed
        if(Category == 0) 
        {
            Transaction trans = Service.getTransactions().get(jTable.getSelectedRow());
            AddTransaction modifyTrans = new AddTransaction(this,true,trans);
            modifyTrans.setLocationRelativeTo(null);
            modifyTrans.setVisible(true);
            modifyTrans.addWindowListener(new WindowAdapter() 
            {
              public void windowClosed(WindowEvent e)
              {
                  try {
                      populate();
                  } catch (SQLException ex) {
                      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
            });
            DataManager.log("Modifica Tranzactie "+String.valueOf(trans.getID()));
        }
    }//GEN-LAST:event_jModifyActionPerformed

    private void jCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSVActionPerformed
        // TODO add your handling code here:
        if(Category == 0) 
        {
            String[] transColumns = {"ID","Data","Tip","Descriere","Client","Valoare","Discount","Final"};
            CSV.createCsv("Tranzactii",transColumns);
            for (Iterator<Transaction> it = Service.getTransactions().iterator(); it.hasNext();) {
                Transaction trans = it.next();
                CSV.writeDataLineByLine(trans.toArray(),"Tranzactii");
            }
            DataManager.log("CSV Tranzactii");
        }
        if(Category == 1) 
        {
            String[] prodColumns = {"ID","Nume","Furnizor","Expirare","Stoc","Pret"};
            CSV.createCsv("Produse",prodColumns);
            for (Iterator<Product> it = Service.getProducts().iterator(); it.hasNext();) {
                Product prod = it.next();
                CSV.writeDataLineByLine(prod.toArray(),"Produse");
            }
            DataManager.log("CSV Produse");
        }
        if(Category == 2) 
        {
            String[] transColumns = {"ID","Nume","CI","CNP","Limita","Balanta"};
            CSV.createCsv("Clienti",transColumns);
            for (Iterator<Client> it = Service.getClients().iterator(); it.hasNext();) {
                Client client = it.next();
                CSV.writeDataLineByLine(client.toArray(),"Clienti");
            }
            DataManager.log("CSV Clienti");
        }
        
    }//GEN-LAST:event_jCSVActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                                try {
                                          new Main().setVisible(true);
                                } catch (SQLException ex) {
                                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                                }
                              }
        });
    }    
    public void populate() throws SQLException
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnModel = jTable.getColumnModel();
        if(Category == 0)
        {
            String[] transColumns = {"ID","Data","Tip","Descriere","Client","Valoare","Discount","Final"};
            DefaultTableModel model = (DefaultTableModel)jTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            //model.setColumnCount(1);
            for(int i=0;i<transColumns.length; i++)
            {

                model.addColumn(transColumns[i]);
            }
            jTable.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
            jTable.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
            jTable.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
            jTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            getTransactions();
        
            while(rezultat.next())
            {
                Transaction trans = new Transaction();
                trans.setID(rezultat.getInt(1));
                trans.setData(rezultat.getDate(2));
                trans.setType(Constants.getType(rezultat.getString(3)));
                trans.setDescription(rezultat.getString(4));
                trans.setClient(rezultat.getString(5));
                trans.setValue(rezultat.getDouble(6));
                trans.setDiscount(rezultat.getDouble(7));
                model.addRow(trans.toObject());
                Service.addTransaction(trans);
            }
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(0).setWidth(10);
            columnModel.getColumn(1).setPreferredWidth(45);
            columnModel.getColumn(3).setPreferredWidth(45);
            columnModel.getColumn(4).setPreferredWidth(45);
            columnModel.getColumn(5).setPreferredWidth(45);
            columnModel.getColumn(6).setPreferredWidth(45);
            columnModel.getColumn(7).setPreferredWidth(45);
        }
        if(Category == 1)
        {
            String[] transColumns = {"ID","Nume","Furnizor","Expirare","Stoc","Pret"};
            DefaultTableModel model = (DefaultTableModel)jTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            //model.setColumnCount(1);
            for(int i=0;i<transColumns.length; i++)
            {

                model.addColumn(transColumns[i]);
            }
            jTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
            jTable.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
            DataManager.getProducts();
            while(rezultat.next())
            {
                Product product = new Product();
                product.setID(rezultat.getInt(1));
                product.setName(rezultat.getString(2));
                product.setStock(rezultat.getDouble(3));
                product.setPrice(rezultat.getDouble(4));
                product.setExpiration(rezultat.getDate(5));
                product.setSupplier(null);
                Service.addProduct(product);
                model.addRow(product.toObject());
            }
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(0).setWidth(10);
            columnModel.getColumn(1).setPreferredWidth(45);
            columnModel.getColumn(3).setPreferredWidth(45);
            columnModel.getColumn(4).setPreferredWidth(45);
            columnModel.getColumn(5).setPreferredWidth(45);
        }
        if(Category == 2)
        {
            String[] transColumns = {"ID","Nume","CI","CNP","Limita","Balanta"};
            DefaultTableModel model = (DefaultTableModel)jTable.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            //model.setColumnCount(1);
            for(int i=0;i<transColumns.length; i++)
            {

                model.addColumn(transColumns[i]);
            }
            jTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
            jTable.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
            DataManager.getClients();
            while(rezultat.next())
            {
                Client client = new Client();
                client.setID(rezultat.getInt(1));
                client.setFirstName(rezultat.getString(2));
                client.setLastName(rezultat.getString(3));
                client.setCI(rezultat.getString(4));
                client.setCNP(rezultat.getString(5));
                Service.addClient(client);
                model.addRow(client.toObject());
            }
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(0).setWidth(10);
            columnModel.getColumn(1).setPreferredWidth(45);
            columnModel.getColumn(3).setPreferredWidth(45);
            columnModel.getColumn(4).setPreferredWidth(45);
            columnModel.getColumn(5).setPreferredWidth(45);
        }
        
        
     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddTable;
    private javax.swing.JButton jCSV;
    private javax.swing.JButton jClients;
    private javax.swing.JButton jClose;
    private javax.swing.JButton jDealers;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jModify;
    private javax.swing.JButton jProds;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jTrans;
    private javax.swing.JButton jTrans1;
    private javax.swing.JButton jTrans2;
    private javax.swing.JButton jTrans3;
    private javax.swing.JButton jTrans4;
    // End of variables declaration//GEN-END:variables
}
