/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.clerk;

import gui.clerk.ReservedBooks;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import db.*;
import dbfunctions.*;
import dbfunctions.Bookf;
import feature.*;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
import java.util.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import main.home;

/**
 *
 * @author sumit
 */
public class clerkpanel extends javax.swing.JPanel {

    public static int i=0;
    clerkpanel pan = this;
    List<Sales> saleslist = new LinkedList<Sales>();
    /**
     * Creates new form clerkpanel
     */
    public clerkpanel() {
        initComponents();
        receipttable.setRowHeight(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isbn = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipttable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reserved = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("SHOW DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ENTER ISBN FOR BOOK DETAILS :");

        receipttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "BOOK NAME", "COPIES", "PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(receipttable);
        if (receipttable.getColumnModel().getColumnCount() > 0) {
            receipttable.getColumnModel().getColumn(1).setMinWidth(100);
            receipttable.getColumnModel().getColumn(1).setPreferredWidth(100);
            receipttable.getColumnModel().getColumn(1).setMaxWidth(200);
            receipttable.getColumnModel().getColumn(2).setMinWidth(100);
            receipttable.getColumnModel().getColumn(2).setPreferredWidth(100);
            receipttable.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jButton2.setText("PRINT RECEIPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUSTOMER RECEIPT");

        reserved.setText("RESERVED BOOKS");
        reserved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reserved, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserved, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if("".equals(isbn.getText()) || !Bookf.checkISBN(isbn.getText()))
            JOptionPane.showMessageDialog(jButton1, "INVALID ISBN.");
        else
        {
            Book  b = Library.getBookByIsbn(isbn.getText());

            if(b==null)
                JOptionPane.showMessageDialog(jButton1, "BOOKSHOP DO NOT HAVE ANY BOOK BY THIS ISBN.");
            else
            {
                sellbookdetails sell = new sellbookdetails(new javax.swing.JFrame(), true,b,pan);
                sell.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            if(receipttable.print())
            {
                Library.sellBooks(saleslist);
                JOptionPane.showMessageDialog(this, "Transaction Complete");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void reservedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservedActionPerformed
        // TODO add your handling code here
        List<Reserves> reserveses = Library.getCustomerReservedBooks();
        JPanel jPanel = new JPanel();
        jPanel.setVisible(true);
        jPanel.setLayout(new GridLayout(0, 1));
        for(Reserves r:reserveses)
        {
            ReservedBooks rb = new ReservedBooks(r,pan);
            jPanel.add(rb);
        }
        home.h.setscrollpanebooks(jPanel);
    }//GEN-LAST:event_reservedActionPerformed

    public void addtablerow(Book b,int copies)
    {
        int count=0;
        if(saleslist.contains(b))
        for (Sales sales : saleslist) {
            Book x=sales.getBook();
            if(x==b)
            {
                TableModel model = receipttable.getModel();
                model.setValueAt(b.getTitle(),count, 0);
                model.setValueAt(copies, count, 1);
                model.setValueAt(b.getSellprice()*copies, count, 2);
                sales.setCopies(copies);
                return;
            }
            count++;
        }
        System.out.println("i="+i);
        System.out.println(b);
        
        TableModel model = receipttable.getModel();
        model.setValueAt(b.getTitle(),i, 0);
        model.setValueAt(copies, i, 1);
        model.setValueAt(b.getSellprice()*copies, i, 2);
        
        Sales obj = new Sales();
        obj.setBook(b);
        obj.setCopies(copies);
        
        saleslist.add(obj);
        i++;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable receipttable;
    private javax.swing.JButton reserved;
    // End of variables declaration//GEN-END:variables
}
