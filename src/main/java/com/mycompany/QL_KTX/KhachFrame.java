/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.QL_KTX;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class KhachFrame extends javax.swing.JFrame {
    
    private String currentSoCMT = "";

    /**
     * Creates new form KhachFrame
     */
    public KhachFrame() {
        this.setTitle("Quản lý Khách");
        initComponents();
        loadTableData();
        setupTableListeners();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tên khách ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Ngày sinh");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Số CMT");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã sinh viên");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Lưu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField4.setToolTipText("");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày đến thăm");

        jTextField5.setToolTipText("");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Tạo mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setToolTipText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã Sinh Viên", "Số CMT", "Ngày sinh", "Lớp", "Quê Quán", "Sửa", "Xóa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Lấy dữ liệu từ các JTextField
        String TenKhach = jTextField1.getText();
        String SoCMT = jTextField2.getText();
        String NgaySinh = jTextField3.getText();
        String MaSV = jTextField4.getText();
        String NgayTham = jTextField5.getText();
        String sql;
        System.out.print(this.currentSoCMT);
        
        if (TenKhach.isEmpty() || SoCMT.isEmpty() || NgaySinh.isEmpty() || MaSV.isEmpty() || NgayTham.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        boolean isUpdating = !currentSoCMT.isEmpty();
        System.out.print(isUpdating);
        if(isUpdating){
            // Câu lệnh UPDATE
            sql = "UPDATE Khachthamquan SET TenKhach ='" + TenKhach + "', SoCMT ='" + SoCMT + "',  NgaySinh ='" + NgaySinh + "', MaSV ='" + MaSV + "', NgayTham ='" + NgayTham + "' WHERE SoCMT = " + this.currentSoCMT;
        } else {
            // Câu lệnh INSERT
            sql = "INSERT INTO Khachthamquan (TenKhach, SoCMT, NgaySinh, MaSV, NgayTham) VALUES ('" + TenKhach + "', '" + SoCMT + "', '" + NgaySinh + "', '" + MaSV + "', '" + NgayTham + "')";
        }
        System.out.print(sql);
        try {
            int rowsAffected = MySqlConnect.executeUpdate(sql);
            if (rowsAffected > 0) {
                jButton1.setText("Lưu");
                if (isUpdating != true){
                    JOptionPane.showMessageDialog(null, "Thêm mới thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Sửa thành công!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            // Sau khi lưu, hiển thị dữ liệu trong JTable
            loadTableData();
        }  catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(""); // Tên khách 
        jTextField2.setText(""); // Số cmt
        jTextField3.setText(""); // Ngày sinh 
        jTextField4.setText(""); // Mã SV
        jTextField5.setText(""); // Ngày đến thăm
        jButton1.setText("Lưu");
        currentSoCMT = "";
        //this.currentId = 0;
    }//GEN-LAST:event_jButton2ActionPerformed
private void loadTableData() {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Không cho phép chỉnh sửa bất kỳ ô nào
                return false;
            }
        };
        model.addColumn("Tên Khách");
        model.addColumn("Số CMT");
        model.addColumn("Ngày sinh");
        model.addColumn("Mã sinh viên");
        model.addColumn("Ngày Đến thăm");
        model.addColumn("Sửa");
        model.addColumn("Xóa");

        // Thêm dữ liệu vào mô hình bảng
        String sqlSelect = "SELECT * FROM Khachthamquan";
        try {
            ResultSet rs = MySqlConnect.executeSQL(sqlSelect);

            while (rs != null && rs.next()) {
                Khach khach;
                khach = new Khach(
                        rs.getString("TenKhach"),
                        rs.getString("SoCMT"),
                        rs.getDate("NgaySinh"),
                        rs.getString("MaSV"),
                        rs.getDate("NgayTham")
                );
                // Thêm hàng vào DefaultTab
                model.addRow(new Object[]{
                    khach.getTenKhach(),
                    khach.getSoCMT(),
                    khach.getNgaySinh(),
                    khach.getMaSV(),
                    khach.getNgayTham(),
                    "Sửa",
                    "Xóa"
                });
            }

            // Thiết lập model cho JTable
            jTable1.setModel(model);

            rs.close();
        } catch (SQLException ex) {
            System.out.println("Failed to retrieve data from the database.");
            ex.printStackTrace();
        }
    }
    private void setupTableListeners() {
            jTable1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = jTable1.rowAtPoint(e.getPoint());
                    int column = jTable1.columnAtPoint(e.getPoint());

                    // Kiểm tra nếu nhấp vào một hàng
                    if (row >= 0) {
                        // Kiểm tra nếu click vào cột "Sửa"
                        if (column == jTable1.getColumn("Sửa").getModelIndex()) {
                            // Cập nhật dữ liệu lên form
                            updateFormFromSelectedRow(row);
                        }
                        // Kiểm tra nếu click vào cột "Xóa"
                        else if (column == jTable1.getColumn("Xóa").getModelIndex()) {
                            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa dòng này?", "Xóa", JOptionPane.YES_NO_OPTION);
                            if (confirm == JOptionPane.YES_OPTION) {
                                String SoCMT = jTable1.getValueAt(row,1).toString();
                                deleteRow(SoCMT);
                            }
                        }
                    }
                }
            });
        }
    private void updateFormFromSelectedRow(int row) {
        if (row >= 0) {
            jTextField1.setText(jTable1.getValueAt(row, 0).toString()); // TenKhach
            jTextField2.setText(jTable1.getValueAt(row, 1).toString()); // SoCMT
            jTextField3.setText(jTable1.getValueAt(row, 2).toString()); // NgaySinh
            jTextField4.setText(jTable1.getValueAt(row, 3).toString()); // MaSV
            jTextField5.setText(jTable1.getValueAt(row, 4).toString()); // NgayTham
            jButton1.setText("Sửa");
            this.currentSoCMT = jTable1.getValueAt(row, 1).toString();
            
        }
    }
    
    private void deleteRow(String SoCMT) {
        String sqlDelete = "DELETE FROM Khachthamquan WHERE SoCMT = ?";
        int rowsAffected = MySqlConnect.executeDelete(sqlDelete, SoCMT);
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Xóa thành công", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Xóa không   thành công", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        loadTableData();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
