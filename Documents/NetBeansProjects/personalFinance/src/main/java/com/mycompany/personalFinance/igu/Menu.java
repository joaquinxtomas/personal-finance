package com.mycompany.personalFinance.igu;

import com.mycompany.personalFinance.logic.Controller;
import com.mycompany.personalFinance.logic.Operation;
import com.mycompany.personalFinance.logic.User;
import com.poiji.bind.Poiji;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

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
        refreshBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        totalField = new javax.swing.JLabel();
        categoryFilter = new javax.swing.JComboBox<>();
        typeFilter = new javax.swing.JComboBox<>();
        dateFilter = new javax.swing.JComboBox<>();
        mpImport = new javax.swing.JButton();
        yearFilter = new javax.swing.JComboBox<>();

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

        sentAmount.setForeground(new java.awt.Color(204, 0, 0));
        sentAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sentAmount.setText("jLabel1");

        totalReceived.setForeground(new java.awt.Color(51, 153, 0));
        totalReceived.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalReceived.setText("jLabel1");

        refreshBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Refresh_icon.svg.png")); // NOI18N
        refreshBtn.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Desktop\\Refresh_icon.svg.png")); // NOI18N
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        totalField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        dateFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        dateFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dateFilterItemStateChanged(evt);
            }
        });
        dateFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateFilterActionPerformed(evt);
            }
        });

        mpImport.setBackground(new java.awt.Color(0, 187, 254));
        mpImport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mpImport.setForeground(new java.awt.Color(255, 255, 255));
        mpImport.setText("Importar desde MP");
        mpImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpImportActionPerformed(evt);
            }
        });

        yearFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023" }));
        yearFilter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearFilterItemStateChanged(evt);
            }
        });
        yearFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(typeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newOperationBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mpImport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sentAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(categoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshBtn)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteBtn)
                                .addComponent(newOperationBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(welcomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mpImport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentAmount)
                    .addComponent(totalReceived)
                    .addComponent(totalField))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String name = validateUser.getName().toUpperCase();

        welcomeLabel.setText("Bienvenido, " + name + "!");

        categoryFilter.setSelectedItem("All");
        typeFilter.setSelectedItem("All");
        loadTable(categoryFilter.getSelectedItem().toString(), typeFilter.getSelectedItem().toString(), dateFilter.getSelectedItem().toString(), yearFilter.getSelectedItem().toString());

    }//GEN-LAST:event_formWindowOpened

    private void newOperationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOperationBtnActionPerformed
        NewOperation nOperation = new NewOperation(control, validateUser);
        nOperation.setVisible(true);
        nOperation.setLocationRelativeTo(null);
    }//GEN-LAST:event_newOperationBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        loadTable("All", "All", "All",yearFilter.getSelectedItem().toString());
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (operationsTable.getRowCount() > 0) {
            if (operationsTable.getSelectedRow() != -1) {
                int idOp = (int) operationsTable.getValueAt(operationsTable.getSelectedRow(), 0);
                int option = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar ésta operación?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    control.deleteOperation(idOp);
                    JOptionPane.showMessageDialog(null, "El movimiento se borró de manera exitosa.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    loadTable("All", "All", "All","2024");
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void categoryFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryFilterItemStateChanged
        String catFilter = (String) categoryFilter.getSelectedItem();
        String typFilter = (String) typeFilter.getSelectedItem();
        String monthFilter = (String) dateFilter.getSelectedItem();
        String yrFilter = (String) yearFilter.getSelectedItem();
        loadTable(catFilter, typFilter, monthFilter, yrFilter);
    }//GEN-LAST:event_categoryFilterItemStateChanged

    private void typeFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeFilterItemStateChanged
        String catFilter = (String) categoryFilter.getSelectedItem();
        String typFilter = (String) typeFilter.getSelectedItem();
        String monthFilter = (String) dateFilter.getSelectedItem();
        String yrFilter = (String) yearFilter.getSelectedItem();
        loadTable(catFilter, typFilter, monthFilter, yrFilter);
    }//GEN-LAST:event_typeFilterItemStateChanged


    private void categoryFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFilterActionPerformed
        //filterTable(categoryFilter.getSelectedItem().toString(), typeFilter.getSelectedItem().toString());
    }//GEN-LAST:event_categoryFilterActionPerformed

    private void dateFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateFilterActionPerformed

    private void dateFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dateFilterItemStateChanged
        String catFilter = (String) categoryFilter.getSelectedItem();
        String typFilter = (String) typeFilter.getSelectedItem();
        String monthFilter = (String) dateFilter.getSelectedItem();
        String yrFilter = String.valueOf(yearFilter.getSelectedItem());
        loadTable(catFilter, typFilter, monthFilter, yrFilter);
    }//GEN-LAST:event_dateFilterItemStateChanged

    
    private void mpImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpImportActionPerformed
        File file = null;
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos XLSX", "xlsx");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(jPanel1);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
        }
        List<Operation> operations = Poiji.fromExcel(file, Operation.class);
        for (Operation operation : operations) {
            if (operation.getAmount() < 0) {
                operation.setType("Egreso");
            } else {
                operation.setType("Ingreso");
            }
            
            if(operation.getCategory() == null){
                operation.setCategory("Operación MP");
            }
            
            String dateStr = operation.getDate();
            String editedDate = dateStr.substring(0,10);
            System.out.println(editedDate);

            control.createOp(operation.getDescr(), operation.getType(), operation.getCategory(), operation.getAmount(), editedDate);
        }
    }//GEN-LAST:event_mpImportActionPerformed

    private void yearFilterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearFilterItemStateChanged
        String catFilter = (String) categoryFilter.getSelectedItem();
        String typFilter = (String) typeFilter.getSelectedItem();
        String monthFilter = (String) dateFilter.getSelectedItem();
        String yrFilter = String.valueOf(yearFilter.getSelectedItem());
        loadTable(catFilter, typFilter, monthFilter, yrFilter);
    }//GEN-LAST:event_yearFilterItemStateChanged

    private void yearFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearFilterActionPerformed


    DefaultTableModel tableModel;

    public void loadTable(String filter1, String filter2, String filterMonth, String filterYear) {
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titles[] = {"Fecha", "Monto", "Descripcion", "Tipo", "Categoría"};
        tableModel.setColumnIdentifiers(titles);

        List<Operation> operationList = control.getOperations();
        boolean hasResult = false;

        for (Operation operation : operationList) {
            if (operation.getUser().getId() == validateUser.getId()) {

                Object[] rowData = {operation.getDate(), operation.getAmount(), operation.getDescr(), operation.getType(), operation.getCategory()};
                
                String strMonth = operation.getDate().substring(5, 7);
                Integer operationDate = Integer.parseInt(strMonth);
                
                String strYear = operation.getDate().substring(0,4);
                String selectedYear = String.valueOf(yearFilter.getSelectedItem());

                boolean filterMatch1 = filter1.equals("All") || operation.getCategory().equals(filter1);
                boolean filterMatch2 = filter2.equals("All") || operation.getType().equals(filter2);
                boolean filterMatchMonth = filterMonth.equals("All") || operationDate == getMonth(filterMonth);
                boolean filterMatchYear = strYear.equals(selectedYear);
                if (filterMatch1 && filterMatch2 && filterMatchMonth && filterMatchYear) {
                    tableModel.addRow(rowData);
                }
               
            }
        }
        operationsTable.setModel(tableModel);
        calcTotal();
    }

    private void calcTotal() {
        int amountColumn = 1;
        int typeColumn = 3;
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
        
        String formattedIn = String.format("%.2f", totalRec);
        String formattedOut = String.format("%.2f", totalSent);
        String formattedTotal = String.format("%.2f", totalRec + totalSent);
        
        totalReceived.setText("Ingreso: " + "$" + formattedIn);
        sentAmount.setText("Gastado: " + "$" + formattedOut);
        totalField.setText("Total: " + "$" + formattedTotal);
    }

    private int getMonth(String month) {
        String[] names = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(month)) {
                return i + 1;
            }
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoryFilter;
    private javax.swing.JComboBox<String> dateFilter;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton mpImport;
    private javax.swing.JButton newOperationBtn;
    private javax.swing.JTable operationsTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel sentAmount;
    private javax.swing.JLabel totalField;
    private javax.swing.JLabel totalReceived;
    private javax.swing.JComboBox<String> typeFilter;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JComboBox<String> yearFilter;
    // End of variables declaration//GEN-END:variables
}
