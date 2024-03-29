/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import entity.LoaiPhong;
import entity.PhongBan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.LoaiPhongService;
import service.PhongBanService;
import viewmodel.PhongBanModel;

/**
 *
 * @author ADMIN
 */
public class ViewPhongBan extends javax.swing.JFrame {

    List<PhongBanModel> list = new ArrayList<>();
    List<LoaiPhong> listLP = new ArrayList<>();

    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultComboBoxModel cboBoxModel = new DefaultComboBoxModel();

    PhongBanService srPB = new PhongBanService();
    LoaiPhongService srLP = new LoaiPhongService();

    /**
     * Creates new form ViewPhongBan
     */
    public ViewPhongBan() {
        initComponents();
        setLocationRelativeTo(this);
        list = srPB.getAll();
        listLP = srLP.getAll();

        tableModel = (DefaultTableModel) tblHienThi.getModel();
        cboBoxModel = (DefaultComboBoxModel) cboMaLPB.getModel();
        showDataCbo(listLP);
        showDataTable(list);
    }

    public void showDataTable(List<PhongBanModel> list1) {
        tableModel.setRowCount(0);
        for (PhongBanModel phongBanModel : list1) {
            tableModel.addRow(phongBanModel.toRowData());
        }
    }

    public void showDataCbo(List<LoaiPhong> listLP1) {
        cboBoxModel.removeAllElements();
        for (LoaiPhong loaiPhong : listLP1) {
            cboBoxModel.addElement(loaiPhong.getId());
        }
    }

    public void showDetail(int show) {
        PhongBanModel pbm = list.get(show);
        txtID.setText(pbm.getId());
        txtMa.setText(pbm.getMaPB());
        txtTen.setText(pbm.getTenPB());
        txtTenLP.setText(pbm.getTenLPB());
        txtSoLuongPhongBan.setText(String.valueOf(pbm.getSoLuongPB()));
        int trangThai = pbm.getTrangThai();
        if (trangThai == 0) {
            rdoHoatDong.setSelected(true);
        } else {
            rdoKhongHoatDong.setSelected(true);
        }
        String id = finiDByTenLPB(pbm.getMaLPBID());
        cboMaLPB.setSelectedItem(id);

    }

    public String finiDByTenLPB(String ten) {
        for (LoaiPhong lp : srLP.getAll()) {
            if (lp.getMa().equals(ten)) {
                return lp.getId();
            }
        }
        return null;
    }

    public PhongBan getFormData() {

        String ma = txtMa.getText().trim();
        String ten = txtTen.getText().trim();
        String tenLPB = txtTenLP.getText().trim();
        int tt = rdoHoatDong.isSelected() ? 0 : 1;
        int soLuongPB = Integer.parseInt(txtSoLuongPhongBan.getText());
        String maLPB = cboMaLPB.getSelectedItem().toString();

        PhongBan pb = new PhongBan(tenLPB, maLPB, ma, ten, soLuongPB, tt);
        return pb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grTrangThai = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdoHoatDong = new javax.swing.JRadioButton();
        rdoKhongHoatDong = new javax.swing.JRadioButton();
        cboMaLPB = new javax.swing.JComboBox<>();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtSoLuongPhongBan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTenLP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ PHÒNG");

        jLabel2.setText("Mã:");

        jLabel3.setText("Tên:");

        jLabel4.setText("Số lượng phòng ban:");

        jLabel5.setText("Trạng thái:");

        jLabel6.setText("Mã loại phòng ban:");

        grTrangThai.add(rdoHoatDong);
        rdoHoatDong.setText("Hoạt động");

        grTrangThai.add(rdoKhongHoatDong);
        rdoKhongHoatDong.setText("Không hoạt động");

        txtTen.setText("                       ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Trạng thái", "Số lượng phòng", "Mã loại phòng", "Tên loại phòng"
            }
        ));
        tblHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHienThi);

        jLabel7.setText("Tên loại Phòng:");

        jLabel8.setText("ID:");

        txtID.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTenLP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(rdoHoatDong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rdoKhongHoatDong))
                        .addComponent(cboMaLPB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSoLuongPhongBan, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoLuongPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTenLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rdoHoatDong)
                            .addComponent(rdoKhongHoatDong))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboMaLPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHienThiMouseClicked
        // TODO add your handling code here:
        int index = tblHienThi.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblHienThiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
            return;
        }
        if (txtTen.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên PB không được để trống");
            return;
        }
        if (txtSoLuongPhongBan.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Số lượng không được để trống");
            return;
        }
        if (!txtSoLuongPhongBan.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "số lượng phải là số nguyên dương!");
            return;
        }
        if (txtTenLP.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tên LP không được để trống");
            return;
        }
        int check = JOptionPane.showConfirmDialog(this, "Bạn có muôn Add không?", "?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            srPB.add(getFormData());
            list = srPB.getAll();
            showDataTable(list);
            JOptionPane.showMessageDialog(this, "Thêm thành công.");
            return;
        }
        if (check == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn NO");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn CANCEL");
            return;
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "Bạn có muôn update không?", "?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            int index = tblHienThi.getSelectedRow();
            PhongBanModel pbm = list.get(index);
            srPB.update(getFormData(), pbm.getId());
            list = srPB.getAll();
            showDataTable(list);
            JOptionPane.showMessageDialog(this, "UPDATE thành công.");
            return;
        }
        if (check == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn NO");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn CANCEL");
            return;
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(this, "Bạn có muôn delete không?", "?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (check == JOptionPane.YES_OPTION) {
            int index = tblHienThi.getSelectedRow();
            PhongBanModel pbm = list.get(index);
            srPB.delete(pbm.getId());
            list = srPB.getAll();
            showDataTable(list);
            JOptionPane.showMessageDialog(this, "Delete thành công.");
            return;
        }
        if (check == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn NO.");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn CANCEL.");
            return;
        }

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
            java.util.logging.Logger.getLogger(ViewPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPhongBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPhongBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboMaLPB;
    private javax.swing.ButtonGroup grTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoHoatDong;
    private javax.swing.JRadioButton rdoKhongHoatDong;
    private javax.swing.JTable tblHienThi;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSoLuongPhongBan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTenLP;
    // End of variables declaration//GEN-END:variables
}
