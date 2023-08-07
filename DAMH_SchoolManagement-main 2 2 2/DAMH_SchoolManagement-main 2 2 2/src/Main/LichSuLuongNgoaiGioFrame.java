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
import static Main.DuKienLuongGiaoVienFrame.thongbao;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author akamine
 */
public class LichSuLuongNgoaiGioFrame extends javax.swing.JFrame {

    
    public static int linhcanh = 0;
    public static int option1 = 0; 
    public static int sotietglobal = 0;
    public static String noti = "";
    public static int sotienglobal = 0;
    
    public LichSuLuongNgoaiGioFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        if(option1 == 0) showData();
        else showDataViewGiaoVien();
        System.out.println("option1 là: "+option1);
        if(linhcanh == 0){
            btnSave.setVisible(true);
        }
        else{
            btnSave.setVisible(false);
            jlbSoTien.setText(String.valueOf(sotienglobal));
            jlbThoiGian.setText(noti);
            jlbSoTiet.setText(String.valueOf(sotietglobal));
            jtfSoTiet.setVisible(false);
            jlbSoTiet.setVisible(true);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbMaCB = new javax.swing.JLabel();
        jlbSoTiet = new javax.swing.JLabel();
        jlbSoTien = new javax.swing.JLabel();
        jlbThoiGian = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jtfSoTiet = new javax.swing.JTextField();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jPanel1.setBackground(new java.awt.Color(172, 172, 172));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("LỊCH SỬ LƯƠNG NGOÀI GIỜ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTable1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã cán bộ", "Kỳ", "Năm học", "Số tiết ngoài giờ", "Mức lương cơ sở", "Số tiền/tiết", "Tổng lương"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kỳ hiện tại: 1 --- Năm học 2023-2024:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Thông tin về ngoài giờ của giáo viên trong kỳ mới nhất: (Đang cập nhật)");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Mã cán bộ: ");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Số tiết dạy ngoài giờ (tính đến thời điểm hiện tại:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Số tiền ước tính: ");

        jlbMaCB.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jlbSoTiet.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jlbSoTien.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        jlbThoiGian.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnSave.setBackground(new java.awt.Color(156, 16, 16));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jtfSoTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoTietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlbMaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbMaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jlbSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1)
                .addGap(22, 22, 22))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int sotiet = Integer.parseInt(jtfSoTiet.getText());
        
        String query = "select LuongCoSo from bangluong where MaBangLuong = (select max(MaBangLuong) from bangluong)";
        int luongcoso = 0;
        try{
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                luongcoso = rs.getInt("LuongCoSo");
                System.out.println("luongcoso: "+luongcoso);
            }
            conn.close();
        }catch(Exception e){}
        
        
        String query1 = "select HeSo from canbo, bacluong where canbo.Bac = bacluong.Bac and MaCB='"+CanBoJFrame.maCbGlobal+"'";
        System.out.println(query1);
        double heso = 0.0;
        try{
            Connection conn1 = getConnection();
            Statement stmt1 = conn1.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query1);
            while(rs1.next()){
                heso = rs1.getInt("HeSo");
                System.out.println("He so "+heso);
            }
            conn1.close();
        }catch(Exception e){};
        
        double luong1tiet =(double) heso * luongcoso / 76 * 1.5;
        int sotien =(int) luong1tiet * sotiet;
        sotienglobal = sotien;
        
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm - dd.MM.yyyy");
        
        int result = JOptionPane.showConfirmDialog(this,
                        "Bạn có chắc chắn xác nhận thông tin trên không?",
                        "Xác nhận",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
                    linhcanh++;
                    sotietglobal = sotiet;
                    btnSave.setVisible(false);
                    jlbSoTien.setText(String.valueOf(sotienglobal));
                    jlbSoTiet.setText(String.valueOf(sotietglobal));
                    jlbSoTiet.setVisible(true);
                    jtfSoTiet.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công!!!");
                    noti = "Thông tin đã được cập nhật vào "+ft.format(date);
                    jlbThoiGian.setText(noti);
                }
                    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jtfSoTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoTietActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoTietActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuLuongNgoaiGioFrame().setVisible(true);
            }
        });
    }
    
    
    
    public void showData(){
        jlbSoTiet.setVisible(false);
        jlbMaCB.setText(String.valueOf(CanBoJFrame.maCbGlobal));
        
        List<BangLuongNgoaiGio> blng = new ArrayList<>();
        String query = "Select * from lichsuluongngoaigio where MaCB ='"+CanBoJFrame.maCbGlobal+"' order by MaCB, Ky, NamHoc";
        System.out.println(query);
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                BangLuongNgoaiGio st = new BangLuongNgoaiGio(rs.getInt("MaCB"), rs.getInt("Ky"), rs.getString("NamHoc"), rs.getInt("SoTietNgoaiGio"), rs.getInt("LuongCoSo"), rs.getInt("SoTien1Tiet"), rs.getInt("TongLuong")) {
                };
                blng.add(st);
            }
        } catch (Exception e) {
        }
        
        
        DefaultTableModel tableModel;
        jTable1.getModel();
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        blng.forEach((bangluongngoaigio) -> {
            
            tableModel.addRow(new Object[]{
                bangluongngoaigio.getMaCB(), bangluongngoaigio.getKy(), bangluongngoaigio.getNamHoc(), bangluongngoaigio.getSoTietNgoaiGio(),(int) bangluongngoaigio.getLuongCoSo(),(int) bangluongngoaigio.getSotien1Tiet(),(int) bangluongngoaigio.getTongLuong()
            });
        });
    }
    
    
    
    
    public void showDataViewGiaoVien(){
        btnSave.setVisible(false);
        jtfSoTiet.setVisible(false);
        jlbMaCB.setText(String.valueOf(index));
        List<BangLuongNgoaiGio> blng = new ArrayList<>();
        String query = "Select * from lichsuluongngoaigio where MaCB ='"+index+"' order by MaCB, Ky, NamHoc";
        System.out.println(query);
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                BangLuongNgoaiGio st = new BangLuongNgoaiGio(rs.getInt("MaCB"), rs.getInt("Ky"), rs.getString("NamHoc"), rs.getInt("SoTietNgoaiGio"), rs.getInt("LuongCoSo"), rs.getInt("SoTien1Tiet"), rs.getInt("TongLuong")) {
                };
                blng.add(st);
            }
        } catch (Exception e) {
        }
        
        
        DefaultTableModel tableModel;
        jTable1.getModel();
        tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);
        blng.forEach((bangluongngoaigio) -> {
            
            tableModel.addRow(new Object[]{
                bangluongngoaigio.getMaCB(), bangluongngoaigio.getKy(), bangluongngoaigio.getNamHoc(), bangluongngoaigio.getSoTietNgoaiGio(),(int) bangluongngoaigio.getLuongCoSo(),(int) bangluongngoaigio.getSotien1Tiet(),(int) bangluongngoaigio.getTongLuong()
            });
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbMaCB;
    private javax.swing.JLabel jlbSoTien;
    private javax.swing.JLabel jlbSoTiet;
    private javax.swing.JLabel jlbThoiGian;
    private javax.swing.JTextField jtfSoTiet;
    // End of variables declaration//GEN-END:variables
}
