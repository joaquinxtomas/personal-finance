/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.personalFinance.igu;

import com.mycompany.personalFinance.logic.Controller;
import com.mycompany.personalFinance.logic.Operation;
import com.mycompany.personalFinance.logic.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Menu extends javax.swing.JFrame {

    Controller control;
    User validateUser;

    public Menu(Controller control, User validateUser) {
        initComponents();
        this.control = control;
        this.validateUser = validateUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        operationsTable = new javax.swing.JTable();
        newOperationBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        sentAmount = new javax.swing.JLabel();
        totalReceived = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        totalField = new javax.swing.JLabel();
        categoryFilter = new javax.swing.JComboBox<>();
        typeFilter = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        operationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(operationsTable);

        newOperationBtn.setText("Nuevo");
        newOperationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOperationBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        welcomeLabel.setText("Bienvenido, !");

        sentAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sentAmount.setText("jLabel1");

        totalReceived.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalReceived.setText("jLabel1");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Refresh_icon.svg.png")); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Refresh_icon.svg.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        totalField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalField.setText("jLabel1");

        categoryFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comida", "Servicios", "All" }));
        categoryFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryFilterItemStateChanged(evt);
            }
        });
        categoryFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFilterActionPerformed(evt);
            }
        });

        typeFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso", "Egreso", "All" }));
        typeFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeFilterItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(217, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addGap(18, 18, 18)
                                .addComponent(newOperationBtn)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(sentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(typeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteBtn)
                                .addComponent(newOperationBtn)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentAmount)
                    .addComponent(totalReceived)
                    .addComponent(totalField)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String name = validateUser.getName().toUpperCase();

        welcomeLabel.setText("Bienvenido, " + name + "!");

        loadTable();

    }//GEN-LAST:event_formWindowOpened

    private void newOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOperationBtnActionPerformed
        NewOperation nOperation = new NewOperation(control);
        nOperation.setVisible(true);
        nOperation.setLocationRelativeTo(null);
    }//GEN-LAST:event_newOperationBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (operationsTable.getRowCount() > 0) {
            if (operationsTable.getSelectedRow() != -1) {
                int idOp = (int) operationsTable.getValueAt(operationsTable.getSelectedRow(), 0);
                int option = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar ésta operación?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    control.deleteOperation(idOp);
                    JOptionPane.showMessageDialog(null, "El movimiento se borró de manera exitosa.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    loadTable();
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void categoryFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryFilterItemStateChanged
        filterTable(categoryFilter.getSelectedItem().toString(), typeFilter.getSelectedItem().toString());
    }//GEN-LAST:event_categoryFilterItemStateChanged

    private void typeFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeFilterItemStateChanged
        filterTable(categoryFilter.getSelectedItem().toString(), typeFilter.getSelectedItem().toString());
    }//GEN-LAST:event_typeFilterItemStateChanged

    private void categoryFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFilterActionPerformed
        //filterTable(categoryFilter.getSelectedItem().toString(), typeFilter.getSelectedItem().toString());
    }//GEN-LAST:event_categoryFilterActionPerformed

    DefaultTableModel tableModel;

    private void loadTable() {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titles[] = {"id_op", "Fecha", "Monto", "Descripcion", "Tipo", "Categoría"};
        tableModel.setColumnIdentifiers(titles);

        String selectedCategory = (String) categoryFilter.getSelectedItem();
        String selectedType = (String) typeFilter.getSelectedItem();

        List<Operation> operationList = control.getOperations();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");

        for (Operation operation : operationList) {
            if (operation.getUser().getId() == validateUser.getId()) {
                String formattedDate = dateFormat.format(operation.getDate());

                Object[] rowData = {operation.getId(), formattedDate, operation.getAmount(), operation.getDescr(), operation.getType(), operation.getCategory()};
                tableModel.addRow(rowData);

            }
        }

        operationsTable.setModel(tableModel);
    }

    private void calcTotal() {
        int amountColumn = 2;
        int typeColumn = 4;
        Double totalSent = 0.0;
        Double totalRec = 0.0;
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Object value = tableModel.getValueAt(i, amountColumn);
            Object type = tableModel.getValueAt(i, typeColumn);

            if (value instanceof Double) {
                if (type.equals("Ingreso")) {
                    totalRec += (Double) value;
                } else if (type.equals("Egreso")) {
                    totalSent += (Double) value;
                }
            }

        }
        totalReceived.setText("Ingreso: " + "$" + String.valueOf(totalRec));
        sentAmount.setText("Gastado: " + "$" + String.valueOf(totalSent));
        totalField.setText("Total: " + "$" + String.valueOf(totalRec + totalSent));
    }

    private void filterTable(String queryCat, String queryType) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        operationsTable.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filters = new ArrayList<>();
        if (!queryCat.equals("All")) {
            filters.add(RowFilter.regexFilter(queryCat, 5));
        }

        if (!queryType.equals("All")) {
            filters.add(RowFilter.regexFilter(queryType, 4));
        }

        RowFilter<Object, Object> combinedFilters = RowFilter.andFilter(filters);
        sorter.setRowFilter(combinedFilters);


    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryFilter;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton newOperationBtn;
    private javax.swing.JTable operationsTable;
    private javax.swing.JLabel sentAmount;
    private javax.swing.JLabel totalField;
    private javax.swing.JLabel totalReceived;
    private javax.swing.JComboBox<String> typeFilter;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
