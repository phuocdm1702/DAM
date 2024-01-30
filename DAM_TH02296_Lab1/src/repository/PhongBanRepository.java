/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.PhongBan;
import java.util.ArrayList;
import java.util.List;
import viewmodel.PhongBanModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class PhongBanRepository {

    public List<PhongBanModel> getAll() {
        List<PhongBanModel> list = new ArrayList<>();
        String sql = """
                     SELECT dbo.phong_ban.id,dbo.phong_ban.ma, dbo.phong_ban.ten, dbo.phong_ban.trang_thai, dbo.phong_ban.so_luong_phong_ban, dbo.loai_phong.ma AS Expr2, dbo.loai_phong.ten AS Expr1
                     FROM dbo.loai_phong INNER JOIN dbo.phong_ban ON dbo.loai_phong.id = dbo.phong_ban.loai_phong_ban_id
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhongBanModel PB = new PhongBanModel();
                PB.setId(rs.getString(1));
                PB.setMaPB(rs.getString(2));
                PB.setTenPB(rs.getString(3));
                PB.setTrangThai(rs.getInt(4));
                PB.setSoLuongPB(rs.getInt(5));
                PB.setMaLPBID(rs.getString(6));
                PB.setTenLPB(rs.getString(7));
                list.add(PB);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean add(PhongBan pb) {
        int check = 0;
        String sql = """
                    INSERT INTO [dbo].[phong_ban]
                               (
                                [ma]
                               ,[loai_phong_ban_id]
                               ,[ten]
                               ,[so_luong_phong_ban]
                               ,[trang_thai])
                         VALUES
                               (?,?,?,?,?)
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, pb.getMa());
            ps.setObject(2, pb.getLoaiPBID());
            ps.setObject(3, pb.getTen());
            ps.setObject(4, pb.getSoLuongPB());
            ps.setObject(5, pb.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

//    public boolean add(PhongBan pb) {
//        int check = 0;
//        String sql = """
//                    INSERT INTO [dbo].[phong_ban]
//                               (
//                                [ma]
//                               ,[ten]
//                               ,[so_luong_phong_ban]
//                               ,[trang_thai])
//                         VALUES
//                               (?,?,?,?)
//                    """;
//        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
//            ps.setObject(1, pb.getMa());
//            ps.setObject(2, pb.getTen());
//            ps.setObject(3, pb.getSoLuongPB());
//            ps.setObject(4, pb.getTrangThai());
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return check > 0;
//    }

    public boolean update(PhongBan pb, String idnew) {
        int check = 0;
        String sql = """
                    UPDATE [dbo].[phong_ban]
                                  SET 
                                      [loai_phong_ban_id] = ?
                                     ,[ma] = ?
                                     ,[ten] = ?
                                     ,[so_luong_phong_ban] = ?
                                     ,[trang_thai] = ?
                                WHERE [id] = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, pb.getLoaiPBID());
            ps.setObject(2, pb.getMa());
            ps.setObject(3, pb.getTen());
            ps.setObject(4, pb.getSoLuongPB());
            ps.setObject(5, pb.getTrangThai());
            ps.setObject(6, idnew);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }
    
    public boolean delete(String id) {
        int check = 0;
        String sql = """
                    DELETE FROM [dbo].[phong_ban]
                    WHERE [id] = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        List<PhongBanModel> list1 = new PhongBanRepository().getAll();
        for (PhongBanModel phongBanModel : list1) {
            System.out.println(phongBanModel.toString());
        }
    }
}
