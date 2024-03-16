/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.HoaDon;
import entity.HoaDonChiTiet;
import entity.SanPham;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.HoaDonChiTietService;
import service.HoaDonService;
import service.SanPhamService;
import viewmodel.HoaDonChiTietViewmodel;

/**
 *
 * @author ADMIN
 */
public class ViewHoaDonChiTiet extends javax.swing.JFrame {

    List<HoaDonChiTietViewmodel> listCTSPM = new ArrayList<>();
    List<HoaDon> listHD = new ArrayList<>();
    List<SanPham> listSP = new ArrayList<>();
    DefaultComboBoxModel comboBoxModelSP = new DefaultComboBoxModel();
    DefaultComboBoxModel comboBoxModelHD = new DefaultComboBoxModel();
    DefaultTableModel tableModel = new DefaultTableModel();
    HoaDonService srHD = new HoaDonService();
    SanPhamService srSP = new SanPhamService();
    HoaDonChiTietService srCTSPM = new HoaDonChiTietService();

    /**
     * Creates new form ViewChiTietSanPham
     */  
    public ViewHoaDonChiTiet() {
        initComponents();
        listCTSPM = srCTSPM.getAll();
        listHD = srHD.getAll();
        listSP = srSP.getAll();
        tableModel = (DefaultTableModel) tblHienThi.getModel();
        comboBoxModelSP = (DefaultComboBoxModel) cboMaSP.getModel();
        comboBoxModelHD = (DefaultComboBoxModel) cboMaHD.getModel();
        showDataTable(listCTSPM);
        showDataCboHD(listHD);
        showDataCboSP(listSP);
    }

    public void showDataTable(List<HoaDonChiTietViewmodel> listCTSPM1) {
        tableModel.setRowCount(0);
        for (HoaDonChiTietViewmodel chiTietSanPhamViewmodel : listCTSPM1) {
            tableModel.addRow(new Object[]{
                chiTietSanPhamViewmodel.getMaSP(),
                chiTietSanPhamViewmodel.getMaHD(),
                chiTietSanPhamViewmodel.getTenSP(),
                chiTietSanPhamViewmodel.getSoLuongSP(),
                chiTietSanPhamViewmodel.getGia(),
                chiTietSanPhamViewmodel.getSoLuongCTSP(),
                chiTietSanPhamViewmodel.getThanhTien(),
                chiTietSanPhamViewmodel.getTrangThai()
            });
        }
    }

    public void showDataCboSP(List<SanPham> listSP1) {
        comboBoxModelSP.removeAllElements();
        for (SanPham sanPham : listSP1) {
            comboBoxModelSP.addElement(sanPham.getMaSP());
        }
    }

    public void showDataCboHD(List<HoaDon> listHD1) {
        comboBoxModelHD.removeAllElements();
        for (HoaDon hoaDon : listHD1) {
            comboBoxModelHD.addElement(hoaDon.getMaHD());
        }

    }

    public void showDetail() {
        int show = tblHienThi.getSelectedRow();
        HoaDonChiTietViewmodel HDCTM = listCTSPM.get(show);
        txtGia.setText(String.valueOf(HDCTM.getGia()));
        txtSoLuongCTSP.setText(String.valueOf(HDCTM.getSoLuongCTSP()));
        txtThanhTien.setText(String.valueOf(HDCTM.getThanhTien()));
        cboMaHD.setSelectedItem(HDCTM.getMaHD());
        cboMaSP.setSelectedItem(HDCTM.getMaSP());
    }

    public HoaDonChiTiet getFormData() {
        Float gia = Float.parseFloat(txtGia.getText().trim());
        int soLuong = Integer.parseInt(txtSoLuongCTSP.getText().trim());
        Float thanhTien = Float.parseFloat(txtThanhTien.getText().trim());
        HoaDonChiTiet HDCT = new HoaDonChiTiet(gia, soLuong, thanhTien);
        return HDCT;
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
        cboMaSP = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboMaHD = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtSoLuongCTSP = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ CHI TIẾT SẢN PHẨM");

        jLabel2.setText("Mã SP:");

        jLabel3.setText("Giá:");

        jLabel4.setText("Thành tiền:");

        cboMaSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Mã HD:");

        cboMaHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Số lượng:");

        btnThem.setText("Thêm ");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Mã HD", "Tên SP", "Số lượng ", "Giá ", "Số lượng", "Thành tiền", "Trạng thái"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuongCTSP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboMaHD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoLuongCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        showDetail();
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int index = tblHienThi.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để them.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String maSP = (String) cboMaSP.getSelectedItem();
        String maHD = (String) cboMaHD.getSelectedItem();
        srCTSPM.add(getFormData(), maSP, maHD);
        listCTSPM = srCTSPM.getAll();
        showDataTable(listCTSPM);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int index = tblHienThi.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để xóa.", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        HoaDonChiTietViewmodel HDCTM = listCTSPM.get(index);
        srCTSPM.xoa(HDCTM.getIdCTSP());
        listCTSPM = srCTSPM.getAll();
        showDataTable(listCTSPM);
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHoaDonChiTiet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMaHD;
    private javax.swing.JComboBox<String> cboMaSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtSoLuongCTSP;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
