/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import static Login.TaiKhoanController.index;
import static Main.ConnectionSQL.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akamine
 */
public class BangLuongNgoaiGioFrame extends javax.swing.JFrame {

    /**
     * Creates new form BangLuongNgoaiGioFrame
     */
    public BangLuongNgoaiGioFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        showData();
    }

    public void showData(){
        List<BangLuongNgoaiGio> blng = new ArrayList<>();
        String query = "Select * from lichsuluongngoaigio NamHoc order by NamHoc,Ky,MaCB";
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
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (jTable1.getSelectedRow() >= 0) {
                    macbjtf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0) + "");
                    kyjtf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "");
                    namhocjtf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2) + "");
                    sotietjtf.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3) + "");
                }
            }
        });
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        macbjtf = new javax.swing.JTextField();
        kyjtf = new javax.swing.JTextField();
        namhocjtf = new javax.swing.JTextField();
        sotietjtf = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

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
                .addGap(242, 242, 242)
                .addComponent(jLabel6)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.setBackground(new java.awt.Color(242, 241, 235));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mã cán bộ:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Kỳ:");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Năm học:");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Số tiết ngoài giờ:");

        macbjtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        kyjtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        namhocjtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        sotietjtf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        addbtn.setBackground(new java.awt.Color(156, 16, 16));
        addbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("Thêm");
        addbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(156, 16, 16));
        deletebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Xóa");
        deletebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(156, 16, 16));
        updatebtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Sửa");
        updatebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        refreshbtn.setBackground(new java.awt.Color(156, 16, 16));
        refreshbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshbtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshbtn.setText("Làm mới");
        refreshbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(156, 16, 16));
        exitbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("Thoát");
        exitbtn.setBorder(new javax.swing.border.MatteBorder(null));
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel23))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kyjtf, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(macbjtf)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(54, 54, 54)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sotietjtf, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(namhocjtf))))
                    .addContainerGap(75, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(macbjtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kyjtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namhocjtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sotietjtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(172, 172, 172));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("LỊCH SỬ LƯƠNG NGOÀI GIỜ CÁC CÁN BỘ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        if(macbjtf.getText().equals("") || kyjtf.getText().equals("") || namhocjtf.getText().equals("") || sotietjtf.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Hãy Nhập Đầy Đủ Dữ Liệu");
        }
        else{
            String checkDup = "select MaCB from lichsuluongngoaigio where MaCB ='"+macbjtf.getText()+"' and Ky='"+kyjtf.getText()+"' and NamHoc='"+namhocjtf.getText()+"'";
            try{
                Connection con = getConnection();
                Statement stm = con.createStatement();
                ResultSet r = stm.executeQuery(checkDup);
                while(r.next()){
                    JOptionPane.showMessageDialog(null, "Lương ngoài giờ bạn định thêm đã có trong bảng lương ngoài giờ!!!");
                    return;
                }
                con.close();
            }catch(Exception e){}
            
            BangLuongNgoaiGio st = new BangLuongNgoaiGio(){};
            boolean check = false;
            String query = "select MaCB from quatrinhluong where ThoiGianKetThuc = '2023'";
            List<Integer> macblist = new ArrayList<>();
            try{
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                macblist.add(rs.getInt("MaCB"));
            }
            for(int i=0;i<macblist.size();i++){
                if(macblist.get(i) == Integer.parseInt(macbjtf.getText())) check = true;
            }
            
            conn.close();
            } catch(Exception e){}
            
            if(check == true) st.setMaCB(Integer.parseInt(macbjtf.getText()));
            else{
                JOptionPane.showMessageDialog(null, "Mã cán bộ bạn vừa thêm không tồn tại!!!");
                return;
            }
            
            st.setKy(Integer.parseInt(kyjtf.getText()));
            if((Integer.parseInt(namhocjtf.getText()) >2023) || (Integer.parseInt(namhocjtf.getText()) <2000)){
                JOptionPane.showMessageDialog(null, "Hãy nhập đúng định dạng năm!!!");
                return;
            } else st.setNamHoc(namhocjtf.getText());
            
            if(Integer.parseInt(sotietjtf.getText()) < 300){
                st.SoTietNgoaiGio = Integer.parseInt(sotietjtf.getText());
            }
            
            if(Integer.parseInt(namhocjtf.getText())<2023){
                st.setLuongCoSo(1490000);
            }
            else st.setLuongCoSo(1800000);
            
            
            String query1 = "select HeSo from canbo, bacluong where MaCB ='"+macbjtf.getText()+"' and canbo.Bac = bacluong.Bac";
            try{
                Connection conn1 = getConnection();
                Statement stmt1 = conn1.createStatement();
                ResultSet rs1 = stmt1.executeQuery(query1);
                while(rs1.next()){
                    st.setSotien1Tiet(st.getLuongCoSo()*rs1.getDouble("HeSo")/76 *1.5);
                }
                st.setTongLuong(st.getSotien1Tiet()*st.getSoTietNgoaiGio());
                
                
            }catch(Exception e){}
            
            System.out.println("Luong ngoai gio: "+st.getMaCB()+" - "+st.getKy()+" - "+st.getNamHoc()+" - "+st.getLuongCoSo()+" - "+st.getSoTietNgoaiGio()+" - "+st.getSotien1Tiet()+" - "+st.getTongLuong());
            
            
            
            
            String add = "INSERT INTO lichsuluongngoaigio(MaCB,Ky,NamHoc,SoTietNgoaiGio,LuongCoSo,SoTien1Tiet,TongLuong) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            try{
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(add);
                pstmt.setInt(1, st.getMaCB());
                pstmt.setInt(2, st.getKy());
                pstmt.setString(3, st.getNamHoc());
                pstmt.setInt(4, st.getSoTietNgoaiGio());
                pstmt.setInt(5,(int) st.getLuongCoSo());
                pstmt.setInt(6,(int) st.getSotien1Tiet());
                pstmt.setInt(7,(int) st.getTongLuong());
                pstmt.execute();
            } catch (Exception e){
            }
            //System.out.println(add);
            JOptionPane.showMessageDialog(null, "Thêm mới thành công!!!!");
            showData();
        }

    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

            String query = "DELETE FROM lichsuluongngoaigio WHERE MaCB = '"+macbjtf.getText()+"' and Ky='"+kyjtf.getText()+"' and NamHoc='"+namhocjtf.getText()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (Exception e){
        }
        System.out.println(query);
        JOptionPane.showMessageDialog(null, "Da xoa thanh cong!!!");
        showData();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
     
    }//GEN-LAST:event_updatebtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        macbjtf.setText("");
        kyjtf.setText("");
        namhocjtf.setText("");
        sotietjtf.setText("");
        jTable1.setSelectionModel(null);
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_exitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangLuongNgoaiGioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangLuongNgoaiGioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kyjtf;
    private javax.swing.JTextField macbjtf;
    private javax.swing.JTextField namhocjtf;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JTextField sotietjtf;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
