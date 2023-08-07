/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import static Main.ConnectionSQL.getConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import static Login.TaiKhoanController.index;

/**
 *
 * @author akamine
 */
public class LichSuLuongFrame extends javax.swing.JFrame {

    public static int option = 0; 
            
    public LichSuLuongFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        if(option == 0) showDataLichSuLuong();
        else showDataLichSuLuong1CanBo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(156, 16, 16));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TRƯỜNG TRUNG HỌC CƠ SỞ X");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel7)
                .addGap(185, 185, 185)
                .addComponent(jLabel6)
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã bảng lương", "MaCB", "Tháng", "Năm", "Lương cơ sở", "Lương cứng", "Phụ cấp thâm niên", "Phụ cấp chức vụ", "Tổng lương"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel8.setBackground(new java.awt.Color(172, 172, 172));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("LỊCH SỬ LƯƠNG");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LichSuLuongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichSuLuongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichSuLuongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichSuLuongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuLuongFrame().setVisible(true);
                
            }
        });
    }
    
    
    public void showDataLichSuLuong(){
        List<BangLuongChiTiet> lslList = new ArrayList<>();
        
        
        
        String query = "Select MaBangLuong, MaCB, Thang, Nam, LuongCoSo, LuongCung, PhuCapThamNien, PhuCapChucVu, TongLuong from bangluongchitiet where MaCB = '" + CanBoJFrame.maCbGlobal + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                BangLuongChiTiet blct = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")) {
                };
                lslList.add(blct);
            }
        } catch (Exception e) {
        }

        DefaultTableModel tableModel;
        jTable1.getModel();
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        lslList.forEach((bangluongchitiet) -> {
            tableModel.addRow(new Object[]{
                bangluongchitiet.getMaBangLuong(), bangluongchitiet.getMaCB(), bangluongchitiet.getThang(), bangluongchitiet.getNam(),(int) bangluongchitiet.getLuongCoSo(), (int) bangluongchitiet.getLuongCung(),(int) bangluongchitiet.getPhuCapThamNien(),(int) bangluongchitiet.getPhuCapChucVu(),(int) bangluongchitiet.getTongLuong()
            });
        });
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jTable1.getSelectedRow() >= 0) {
                    //jtfMaCB.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                    
                }
            }
        });
    }
    
    
    public void showDataLichSuLuong1CanBo(){
        List<BangLuongChiTiet> lslList = new ArrayList<>();
        
        
        
        String query = "Select MaBangLuong, MaCB, Thang, Nam, LuongCoSo, LuongCung, PhuCapThamNien, PhuCapChucVu, TongLuong from bangluongchitiet where MaCB = '" + index + "'";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                BangLuongChiTiet blct = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")) {
                };
                lslList.add(blct);
            }
        } catch (Exception e) {
        }

        DefaultTableModel tableModel;
        jTable1.getModel();
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        lslList.forEach((bangluongchitiet) -> {
            tableModel.addRow(new Object[]{
                bangluongchitiet.getMaBangLuong(), bangluongchitiet.getMaCB(), bangluongchitiet.getThang(), bangluongchitiet.getNam(),(int) bangluongchitiet.getLuongCoSo(), (int) bangluongchitiet.getLuongCung(),(int) bangluongchitiet.getPhuCapThamNien(),(int) bangluongchitiet.getPhuCapChucVu(),(int) bangluongchitiet.getTongLuong()
            });
        });
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jTable1.getSelectedRow() >= 0) {
                    //jtfMaCB.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                    
                }
            }
        });
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables



}
