/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QuanLyCuaHang.GUI;

import QuanLyCuaHang.BUS.KhachHangBUS;
import QuanLyCuaHang.DTO.KhachHangDTO;
import java.util.ArrayList;
import java.util.List;


public class KhachHangGUI extends javax.swing.JFrame {
    KhachHangBUS khBUS = new KhachHangBUS();
    public KhachHangGUI() {
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBody = new javax.swing.JPanel();
        jPContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTKhachHang = new javax.swing.JTable();
        jBSua = new javax.swing.JButton();
        jBXoa = new javax.swing.JButton();
        jBThem = new javax.swing.JButton();
        jBTimkiem = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPMenu = new javax.swing.JPanel();
        jBNhanVien = new javax.swing.JButton();
        jBKhuyenMai = new javax.swing.JButton();
        jBSanPham = new javax.swing.JButton();
        jBBanHang = new javax.swing.JButton();
        jBKhachHang = new javax.swing.JButton();
        jBNhapHang = new javax.swing.JButton();
        jBThongKe = new javax.swing.JButton();
        jLLogo = new javax.swing.JLabel();
        jPHeader = new javax.swing.JPanel();
        jLNameapp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mác Đô Nan");

        jPBody.setBackground(new java.awt.Color(255, 255, 255));

        jTKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ", "Tên", "Giới tính"
            }
        ));
        jScrollPane1.setViewportView(jTKhachHang);

        jBSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fixicon.png"))); // NOI18N
        jBSua.setText(" Sửa");

        jBXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delicon.png"))); // NOI18N
        jBXoa.setText(" Xóa");
        jBXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXoaActionPerformed(evt);
            }
        });

        jBThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/addicon.png"))); // NOI18N
        jBThem.setText(" Thêm");
        jBThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBThemActionPerformed(evt);
            }
        });

        jBTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/searchicon.png"))); // NOI18N
        jBTimkiem.setText("Tìm kiếm");

        txtTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPContentLayout = new javax.swing.GroupLayout(jPContent);
        jPContent.setLayout(jPContentLayout);
        jPContentLayout.setHorizontalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPContentLayout.createSequentialGroup()
                        .addComponent(jBTimkiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jBThem)
                        .addGap(18, 18, 18)
                        .addComponent(jBSua)
                        .addGap(18, 18, 18)
                        .addComponent(jBXoa)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPContentLayout.setVerticalGroup(
            jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBXoa)
                    .addComponent(jBSua)
                    .addComponent(jBThem)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBTimkiem))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        jPMenu.setBackground(new java.awt.Color(204, 0, 0));

        jBNhanVien.setBackground(new java.awt.Color(153, 0, 0));
        jBNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jBNhanVien.setText("Nhân viên");
        jBNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBNhanVien.setPreferredSize(new java.awt.Dimension(125, 20));
        jBNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNhanVienActionPerformed(evt);
            }
        });

        jBKhuyenMai.setBackground(new java.awt.Color(153, 0, 0));
        jBKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        jBKhuyenMai.setText("Khuyến mãi");
        jBKhuyenMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBKhuyenMai.setPreferredSize(new java.awt.Dimension(125, 20));
        jBKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKhuyenMaiActionPerformed(evt);
            }
        });

        jBSanPham.setBackground(new java.awt.Color(153, 0, 0));
        jBSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBSanPham.setForeground(new java.awt.Color(255, 255, 255));
        jBSanPham.setText("Sản phẩm");
        jBSanPham.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSanPhamActionPerformed(evt);
            }
        });

        jBBanHang.setBackground(new java.awt.Color(153, 0, 0));
        jBBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBBanHang.setForeground(new java.awt.Color(255, 255, 255));
        jBBanHang.setText("Bán hàng");
        jBBanHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBanHangActionPerformed(evt);
            }
        });

        jBKhachHang.setBackground(new java.awt.Color(51, 102, 0));
        jBKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jBKhachHang.setText("Khách hàng");
        jBKhachHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBNhapHang.setBackground(new java.awt.Color(153, 0, 0));
        jBNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBNhapHang.setForeground(new java.awt.Color(255, 255, 255));
        jBNhapHang.setText("Nhập hàng");
        jBNhapHang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBThongKe.setBackground(new java.awt.Color(153, 0, 0));
        jBThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jBThongKe.setText("Thống kê");
        jBThongKe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo(1).png"))); // NOI18N

        javax.swing.GroupLayout jPMenuLayout = new javax.swing.GroupLayout(jPMenu);
        jPMenu.setLayout(jPMenuLayout);
        jPMenuLayout.setHorizontalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNhapHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBKhachHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBNhanVien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jBSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBKhuyenMai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBanHang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPMenuLayout.setVerticalGroup(
            jPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPHeader.setBackground(new java.awt.Color(255, 255, 255));
        jPHeader.setForeground(new java.awt.Color(255, 0, 0));

        jLNameapp.setBackground(new java.awt.Color(255, 255, 255));
        jLNameapp.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLNameapp.setForeground(new java.awt.Color(255, 0, 0));
        jLNameapp.setText("Phần mềm quản lý cửa hàng Mác Đô Nan");

        javax.swing.GroupLayout jPHeaderLayout = new javax.swing.GroupLayout(jPHeader);
        jPHeader.setLayout(jPHeaderLayout);
        jPHeaderLayout.setHorizontalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLNameapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPHeaderLayout.setVerticalGroup(
            jPHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLNameapp)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPBodyLayout = new javax.swing.GroupLayout(jPBody);
        jPBody.setLayout(jPBodyLayout);
        jPBodyLayout.setHorizontalGroup(
            jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBodyLayout.createSequentialGroup()
                .addComponent(jPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPBodyLayout.setVerticalGroup(
            jPBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBodyLayout.createSequentialGroup()
                .addComponent(jPHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPBody, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBanHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBanHangActionPerformed

    private void jBSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSanPhamActionPerformed

    private void jBKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBKhuyenMaiActionPerformed

    private void jBNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNhanVienActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jBNhanVienActionPerformed

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void jBXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBXoaActionPerformed

    private void jBThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBThemActionPerformed
        // TODO add your handling code here:
        new addKhachHangGUI().setVisible(true);
    }//GEN-LAST:event_jBThemActionPerformed

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
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBanHang;
    private javax.swing.JButton jBKhachHang;
    private javax.swing.JButton jBKhuyenMai;
    private javax.swing.JButton jBNhanVien;
    private javax.swing.JButton jBNhapHang;
    private javax.swing.JButton jBSanPham;
    private javax.swing.JButton jBSua;
    private javax.swing.JButton jBThem;
    private javax.swing.JButton jBThongKe;
    private javax.swing.JButton jBTimkiem;
    private javax.swing.JButton jBXoa;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLNameapp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPBody;
    private javax.swing.JPanel jPContent;
    private javax.swing.JPanel jPHeader;
    private javax.swing.JPanel jPMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTKhachHang;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
