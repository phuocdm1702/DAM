/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.LoaiPhong;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class LoaiPhongRepository {

    public List<LoaiPhong> getAll() {
        List<LoaiPhong> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[ma]
                          ,[ten]
                          ,[don_gia_theo_gio]
                          ,[don_gia_qua_ngay]
                          ,[don_gia_qua_dem]
                          ,[so_nguoi]
                          ,[ghi_chu]
                          ,[tien_qua_gio]
                          ,[trang_thai]
                      FROM [dbo].[loai_phong]
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiPhong LP = new LoaiPhong();
                LP.setId(rs.getString(1));
                LP.setMa(rs.getString(2));
                LP.setTen(rs.getString(3));
                LP.setDonGiaTheoGio(rs.getFloat(4));
                LP.setDonGiaQuaNgay(rs.getFloat(5));
                LP.setDonGiaQuaDem(rs.getFloat(6));
                LP.setSoNguoi(rs.getInt(7));
                LP.setGhiChu(rs.getString(8));
                LP.setTienQuaGio(rs.getFloat(9));
                LP.setTrangThai(rs.getInt(10));
                list.add(LP);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) {
        List<LoaiPhong> list = new LoaiPhongRepository().getAll();
        for (LoaiPhong loaiPhong : list) {
            System.out.println(loaiPhong.toString());
        }
    }
}
