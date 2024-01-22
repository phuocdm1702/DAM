/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.SinhVien;
import java.util.ArrayList;
import java.util.List;
import viewmodel.SinhVienViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class SinhVienRepository {

    public List<SinhVienViewModel> getAll() {
        List<SinhVienViewModel> list = new ArrayList<>();
        String sql = """
                    SELECT dbo.SinhVien.maSV, dbo.SinhVien.ten, dbo.SinhVien.gioiTinh, dbo.SinhVien.dienthoai, dbo.SinhVien.email, dbo.Lop.ma_lop
                    FROM dbo.Lop INNER JOIN dbo.SinhVien ON dbo.Lop.id = dbo.SinhVien.ma_lop
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVienViewModel SVMD = new SinhVienViewModel();
                SVMD.setMaSV(rs.getString(1));
                SVMD.setTen(rs.getString(2));
                SVMD.setGioiTinh(rs.getInt(3));
                SVMD.setSdt(rs.getString(4));
                SVMD.setEmail(rs.getString(5));
                SVMD.setTenLop(rs.getString(6));
                list.add(SVMD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean add(SinhVien sv) {
        int check = 0;
        String sql = """
                   INSERT INTO [dbo].[SinhVien]
                                    ([maSV]
                                    ,[ten]
                                    ,[cmnd]
                                    ,[dienthoai]
                                    ,[email]
                                    ,[ma_lop]
                                    ,[username]
                                    ,[gioiTinh])
                              VALUES
                               (?,?,?,?,?,?,?,?)
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, sv.getMaSV());
            ps.setObject(2, sv.getTen());
            ps.setObject(3, sv.getCmnd());
            ps.setObject(4, sv.getSdt());
            ps.setObject(5, sv.getEmail());
            ps.setObject(6, sv.getMaLop());
            ps.setObject(7, sv.getUserName());
            ps.setObject(8, sv.getGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean update(SinhVien sv, String maNew) {
        int check = 0;
        String sql = """
                   UPDATE [dbo].[SinhVien]
                      SET 
                          [ten] = ?
                         ,[cmnd] = ?
                         ,[dienthoai] = ?
                         ,[email] = ?
                         ,[ma_lop] = ?
                         ,[username] = ?
                         ,[gioiTinh] = ?
                    WHERE [maSV] = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {

            ps.setObject(1, sv.getTen());
            ps.setObject(2, sv.getCmnd());
            ps.setObject(3, sv.getSdt());
            ps.setObject(4, sv.getEmail());
            ps.setObject(5, sv.getMaLop());
            ps.setObject(6, sv.getUserName());
            ps.setObject(7, sv.getGioiTinh());
            ps.setObject(8, maNew);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        int check = 0;
        String sql = """
                   DELETE FROM [dbo].[SinhVien]
                    WHERE [maSV] = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {

            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public List<SinhVienViewModel> getSD1702() {
        List<SinhVienViewModel> list = new ArrayList<>();
        String sql = """
                    SELECT dbo.SinhVien.maSV, dbo.SinhVien.ten, dbo.SinhVien.gioiTinh, dbo.SinhVien.dienthoai, dbo.SinhVien.email, dbo.Lop.ma_lop
                    FROM dbo.Lop INNER JOIN dbo.SinhVien ON dbo.Lop.id = dbo.SinhVien.ma_lop
                     WHERE dbo.Lop.ma_lop LIKE 'SD1702'
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVienViewModel SVMD = new SinhVienViewModel();
                SVMD.setMaSV(rs.getString(1));
                SVMD.setTen(rs.getString(2));
                SVMD.setGioiTinh(rs.getInt(3));
                SVMD.setSdt(rs.getString(4));
                SVMD.setEmail(rs.getString(5));
                SVMD.setTenLop(rs.getString(6));
                list.add(SVMD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<SinhVienViewModel> getTop5() {
        List<SinhVienViewModel> list = new ArrayList<>();
        String sql = """
                    SELECT TOP 5 dbo.SinhVien.maSV, dbo.SinhVien.ten, dbo.SinhVien.gioiTinh, dbo.SinhVien.dienthoai, dbo.SinhVien.email, dbo.Lop.ma_lop
                    FROM dbo.Lop INNER JOIN dbo.SinhVien ON dbo.Lop.id = dbo.SinhVien.ma_lop
                    WHERE dbo.SinhVien.gioiTinh LIKE '0'
                    ORDER BY dbo.SinhVien.ten ASC
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVienViewModel SVMD = new SinhVienViewModel();
                SVMD.setMaSV(rs.getString(1));
                SVMD.setTen(rs.getString(2));
                SVMD.setGioiTinh(rs.getInt(3));
                SVMD.setSdt(rs.getString(4));
                SVMD.setEmail(rs.getString(5));
                SVMD.setTenLop(rs.getString(6));
                list.add(SVMD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public List<SinhVienViewModel> sapXep() {
        List<SinhVienViewModel> list = new ArrayList<>();
        String sql = """
                    SELECT dbo.SinhVien.maSV, dbo.SinhVien.ten, dbo.SinhVien.gioiTinh, dbo.SinhVien.dienthoai, dbo.SinhVien.email, dbo.Lop.ma_lop
                    FROM dbo.Lop INNER JOIN dbo.SinhVien ON dbo.Lop.id = dbo.SinhVien.ma_lop  
                    ORDER BY dbo.SinhVien.maSV DESC
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVienViewModel SVMD = new SinhVienViewModel();
                SVMD.setMaSV(rs.getString(1));
                SVMD.setTen(rs.getString(2));
                SVMD.setGioiTinh(rs.getInt(3));
                SVMD.setSdt(rs.getString(4));
                SVMD.setEmail(rs.getString(5));
                SVMD.setTenLop(rs.getString(6));
                list.add(SVMD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<SinhVienViewModel> searchByTenLop(String tenlop) {
        List<SinhVienViewModel> list = new ArrayList<>();
        String sql = """
                    SELECT dbo.SinhVien.maSV, dbo.SinhVien.ten, dbo.SinhVien.gioiTinh, dbo.SinhVien.dienthoai, dbo.SinhVien.email, dbo.Lop.ma_lop
                    FROM dbo.Lop INNER JOIN dbo.SinhVien ON dbo.Lop.id = dbo.SinhVien.ma_lop  
                    WHERE dbo.Lop.ma_lop = ?
                    """;
        try (Connection cnt = DBConnect.getConnection(); PreparedStatement ps = cnt.prepareStatement(sql)) {
            ps.setObject(1, tenlop);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SinhVienViewModel SVMD = new SinhVienViewModel();
                SVMD.setMaSV(rs.getString(1));
                SVMD.setTen(rs.getString(2));
                SVMD.setGioiTinh(rs.getInt(3));
                SVMD.setSdt(rs.getString(4));
                SVMD.setEmail(rs.getString(5));
                SVMD.setTenLop(rs.getString(6));
                list.add(SVMD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<SinhVienViewModel> list1 = new SinhVienRepository().getAll();
        for (SinhVienViewModel sinhVienViewModel : list1) {
            System.out.println(sinhVienViewModel.toString());
        }
    }
}
