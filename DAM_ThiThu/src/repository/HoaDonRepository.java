/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.HoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepository {
    public List<HoaDon> getAll() {
        List<HoaDon> list = new ArrayList<>();
        String sql = """
                    SELECT [id]
                          ,[ma_hoa_don]
                          ,[tong_tien]
                          ,[trang_thai]
                      FROM [dbo].[hoa_don]
                     """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               HoaDon HD = new HoaDon();
               HD.setIdHoaDon(rs.getInt(1));
               HD.setMaHD(rs.getString(2));
               HD.setTongTienHD(rs.getInt(3));
               HD.setTrangThaiHD(rs.getInt(4));
               list.add(HD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
