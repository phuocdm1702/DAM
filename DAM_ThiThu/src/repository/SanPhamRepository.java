/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;


import entity.SanPham;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class SanPhamRepository {
    public List<SanPham> getAll() {
        List<SanPham> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[san_pham_id]
                          ,[ma_san_pham]
                          ,[ten]
                          ,[so_luong]
                          ,[gia]
                          ,[mieu_ta]
                      FROM [dbo].[san_pham]
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham SP = new SanPham();
                SP.setIdSP(rs.getInt(1));
                SP.setSpID(rs.getInt(2));
                SP.setMaSP(rs.getString(3));
                SP.setTenSP(rs.getString(4));
                SP.setSoLuongSP(rs.getInt(5));
                SP.setGia(rs.getFloat(6));
                SP.setMieuTa(rs.getString(7));
                list.add(SP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
