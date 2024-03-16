/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.HoaDonChiTiet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import viewmodel.HoaDonChiTietViewmodel;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietRepository {

    public List<HoaDonChiTietViewmodel> getAll() {
        List<HoaDonChiTietViewmodel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.hoa_don_chi_tiet.id, dbo.san_pham.ma_san_pham, dbo.hoa_don.ma_hoa_don, dbo.san_pham.ten, dbo.san_pham.so_luong,dbo.san_pham.gia, dbo.hoa_don_chi_tiet.so_luong AS Expr1, dbo.hoa_don_chi_tiet.thanh_tien, 
                     dbo.hoa_don.trang_thai
                     FROM 
                     dbo.hoa_don INNER JOIN
                     dbo.hoa_don_chi_tiet ON dbo.hoa_don.id = dbo.hoa_don_chi_tiet.hoa_don_id INNER JOIN
                     dbo.san_pham ON dbo.hoa_don_chi_tiet.san_pham_id = dbo.san_pham.id
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTietViewmodel CTSPM = new HoaDonChiTietViewmodel();
                CTSPM.setIdCTSP(rs.getInt(1));
                CTSPM.setMaSP(rs.getString(2));
                CTSPM.setMaHD(rs.getString(3));
                CTSPM.setTenSP(rs.getString(4));
                CTSPM.setSoLuongSP(rs.getInt(5));
                CTSPM.setGia(rs.getFloat(6));
                CTSPM.setSoLuongCTSP(rs.getInt(7));
                CTSPM.setThanhTien(rs.getFloat(8));
                CTSPM.setTrangThai(rs.getInt(9));
                list.add(CTSPM);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(HoaDonChiTiet HDCT, String maSP, String maHD) {
        int check = 0;
        String sql = """
                     INSERT INTO [dbo].[hoa_don_chi_tiet]
                                ([san_pham_id]
                                ,[hoa_don_id]
                                ,[gia]
                                ,[so_luong]
                                ,[thanh_tien]
                                ,[trang_thai])
                          VALUES
                                ((SELECT id FROM san_pham WHERE ma_san_pham = ?),(SELECT id FROM hoa_don WHERE ma_hoa_don = ?),?,?,?,?)
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, maSP);
            ps.setObject(2, maHD);
            ps.setObject(3, HDCT.getGiaHDCT());
            ps.setObject(4, HDCT.getSoLuongHDCT());
            ps.setObject(5, HDCT.getThanhTienHDCT());
            ps.setObject(6, HDCT.getTrangThaiHDCT());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean xoa(int id) {
        int check = 0;
        String sql = """
                     DELETE FROM [dbo].[hoa_don_chi_tiet]
                     WHERE id =?
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
